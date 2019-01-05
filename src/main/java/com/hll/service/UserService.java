package com.hll.service;

import com.hll.dao.SysUserMapper;
import com.hll.pojo.SysUser;
import com.hll.service.interfaces.Iusers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 何龙
 * @create 2018-12-16 14:54
 */
@Service
public class UserService implements Iusers {
    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public SysUser getUser(String name) {

        SysUser sysUser=sysUserMapper.getUser(name);

        return sysUser;
    }
}
