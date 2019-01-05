package com.hll.service;

import com.hll.dao.SysRoleMapper;
import com.hll.dao.SysUserMapper;
import com.hll.pojo.SysRole;
import com.hll.pojo.SysRoleExample;
import com.hll.pojo.SysUser;
import com.hll.service.interfaces.IsysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-17 1:02
 */
@Service
public class SysRoleService implements IsysRole {
    @Autowired
    SysRoleMapper sysRoleMapper;
    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public List<SysRole> getAdmin() {
        SysRoleExample example=new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdGreaterThan(1);
        List<SysRole> sysRoles = sysRoleMapper.selectByExample(example);
        return sysRoles;
    }

    @Override
    public void updateRole(SysUser user) {
        sysUserMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<SysRole> getAdmin2() {

        SysRoleExample example=new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdGreaterThan(1);
        criteria.andRoleIdNotEqualTo(999);
        List<SysRole> sysRoles = sysRoleMapper.selectByExample(example);
        return sysRoles;
    }
}
