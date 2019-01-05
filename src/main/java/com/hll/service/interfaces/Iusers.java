package com.hll.service.interfaces;

import com.hll.pojo.SysUser;

/**
 * @author 何龙
 * @create 2018-12-16 14:51
 */
public interface Iusers {
    /**
     * 查询具体用户名的用户
     * @param name 用户名
     * @return 用户
     */
    SysUser getUser(String name);
}
