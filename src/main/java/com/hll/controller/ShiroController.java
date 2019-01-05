package com.hll.controller;

import com.hll.pojo.SysUser;
import com.hll.service.interfaces.Iusermenu;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-05 11:57
 */
@Controller
@RequestMapping("/shiro")
public class ShiroController {

    @Autowired
    Iusermenu iusermenu;
    /**
     * 登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public  Map<String,Object> login(
            @RequestParam("name")String name,//用户名
            @RequestParam("password")String password,//密码
            @RequestParam("verificationCode")String verificationCode //验证码
            ){
        Map<String,Object> m=new HashMap<>();
        Integer code=0;//登录失败
        /*获取Subject*/
        Subject currentUser = SecurityUtils.getSubject();

        /*获取session*/
        Session session = currentUser.getSession();

        /*判断验证码是否正确*/
        String sessionCode= (String) session.getAttribute("verCode");
        if (!sessionCode.equals(verificationCode)){//验证码有误
            m.put( "code",code );
            m.put( "msg","验证码有误" );
            return  m;
        }


        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(name, password);
            token.setRememberMe(true);
            try {
                /*密码验证*/
                currentUser.login(token);
            } catch (UnknownAccountException uae) {
                m.put( "code",code );
                m.put( "msg","用户名不存在" );
                return  m;
            } catch (IncorrectCredentialsException ice) {

                m.put( "code",code );
                m.put( "msg","密码错误" );
                return  m;
            } catch (LockedAccountException lae) {

                m.put( "code",code );
                m.put( "msg","用户被锁定" );
                return  m;
            }catch (AuthenticationException e){

                m.put( "code",code );
                m.put( "msg","登录失败" );

                return  m;
            }

        }

        /*调用service方法,将菜单与权限全部放入session中*/

        SysUser user = (SysUser) currentUser.getPrincipals().getPrimaryPrincipal();
        session.setAttribute("user",user);
        iusermenu.getMenu(user);

        code=1;
        m.put( "code",code );
        return  m;
    }

}
