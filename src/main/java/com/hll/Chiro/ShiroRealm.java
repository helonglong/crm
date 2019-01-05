package com.hll.Chiro;

import com.hll.pojo.SysRoleRight;
import com.hll.pojo.SysUser;
import com.hll.service.interfaces.Iusers;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 何龙
 * @create 2018-12-05 10:03
 */
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    Iusers iusers;
    SysUser user;

    /*单纯密码认证*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        UsernamePasswordToken upd = (UsernamePasswordToken) token;
        String username = upd.getUsername();
        String password = new String( upd.getPassword() );

        /*开始调用service获取用户信息*/
        user = iusers.getUser(username);

        if (user==null){
            throw new UnknownAccountException("用户不存在");
        }else if (user.getUsrFlag()==0){
            throw new LockedAccountException("用户被冻结");
        }


        //1.用户的实体类
        Object principal=user;
        //2.密码，从数据库取出来的
        Object credentials=user.getUsrPassword();
        //3.调用父类的getname()方法
        //4.颜值加密
        ByteSource byteSource=ByteSource.Util.bytes( username );

        AuthenticationInfo sinfo=new SimpleAuthenticationInfo(principal,credentials,byteSource,getName());
        return sinfo;
    }




    /*角色授权*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取登录用户的信息
        SysUser principal= (SysUser) principals.getPrimaryPrincipal();
        /*判断当前角色*/
        Set<String> set=new LinkedHashSet<>();
        set.add("user");

        if (principal.getUsrRoleId()==0){
            set.add("boss");
        }
        if (principal.getUsrRoleId()==1){
            set.add("admin");
        }
        if (principal.getUsrRoleId()==2){
            set.add("manager");
        }
        if (principal.getUsrRoleId()==3){
            set.add("business");
        }
        /*角色与权限*/
        SimpleAuthorizationInfo info =
                new SimpleAuthorizationInfo();
        /*添加角色*/
        info.addRoles(set);

        /*添加权限*/
        Set<String> competence =new LinkedHashSet<>();
        /*从session中获取权限*/
        Session session =
                SecurityUtils.getSubject().getSession();

        List<SysRoleRight> competence1 =
                (List<SysRoleRight>) session.getAttribute( "competence" );
        for (SysRoleRight sysRoleRight : competence1) {
            competence.add( sysRoleRight.getSysRight().getRightTip());
        }
        /*将权限装入*/
        info.addStringPermissions(competence);


        /*返回角色和权限信息*/
        return info;
    }




    public static void main(String[] args) {

        Object password="123456";
        ByteSource byteSource=ByteSource.Util.bytes( "王大锤" );
        SimpleHash md5 = new SimpleHash( "MD5", password, byteSource, 1000 );
        System.out.println(md5);
    }
}
