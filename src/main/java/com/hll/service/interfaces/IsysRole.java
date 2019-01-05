package com.hll.service.interfaces;

import com.hll.pojo.SysRole;
import com.hll.pojo.SysUser;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-17 1:01
 */
public interface IsysRole {
    /**
     * 获取除boos和admin以外的角色
     * @return 角色集合
     */
    List<SysRole> getAdmin();

    void updateRole(SysUser user);

    /**
     * 获取除boos和admin以外的角色 除未分配
     */
    List<SysRole> getAdmin2();
}
