package com.hll.service;

import com.hll.dao.SysUserMapper;
import com.hll.pojo.SysUser;
import com.hll.pojo.SysUserExample;
import com.hll.service.interfaces.IsysUser;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-08 9:49
 */
@Service
public class SysUserService implements IsysUser {
    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> selectUser1() {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsrRoleIdEqualTo(2);/*2表示客户经理*/
        List<SysUser> sysUsers = sysUserMapper.selectByExample( sysUserExample );
        return sysUsers;
    }

    @Override
    public List<SysUser> getUsers(SysUser user) {


        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsrRoleIdGreaterThan(1);
        if(!"".equals(user.getUsrId())){
            criteria.andUsrIdEqualTo(user.getUsrId());
        }
        if(!"".equals(user.getUsrName())){
            String name="%"+user.getUsrName()+"%";
            criteria.andUsrNameLike(name);
        }


        return sysUserMapper.selectByExample( sysUserExample );
    }

    @Override
    public void setCode(Integer id, Integer code) {
        SysUser sysUser=new SysUser();
        sysUser.setUsrId(id.toString());
        sysUser.setUsrFlag( code );
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public Map<String, Object> insertUser(SysUser user) {
        Map<String,Object> map=new HashMap<>();
        Boolean b = this.getUser(user.getUsrName());
        if(b){
            map.put("code",1);
            map.put("msg","用户名已存在");
            return map;
        }
        /*开始加密密码*/
        String md5Pass = this.getMd5Pass( user.getUsrName(), user.getUsrPassword() );
        user.setUsrPassword( md5Pass );

        sysUserMapper.insert(user);
        map.put("code",0);
        map.put("msg","增加成功!");
        return map;
    }

     private Boolean getUser(String userName){
         SysUserExample sysUserExample = new SysUserExample();
         SysUserExample.Criteria criteria = sysUserExample.createCriteria();
         criteria.andUsrNameEqualTo(userName);

         List<SysUser> sysUsers = sysUserMapper.selectByExample( sysUserExample );
         return sysUsers.size() > 0;

    }

    private String getMd5Pass(String name, String pass){
        ByteSource byteSource=ByteSource.Util.bytes( name );
        SimpleHash md5 = new SimpleHash( "MD5", pass, byteSource, 1000 );
        return md5.toString();
    }

}
