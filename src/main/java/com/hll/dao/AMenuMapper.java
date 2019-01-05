package com.hll.dao;

import com.hll.pojo.AMenu;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-16 23:23
 */
public interface AMenuMapper {
    /**
     * 根据用户角色id查询一级菜单
     */
    List<AMenu> getAll(Integer rid);
}
