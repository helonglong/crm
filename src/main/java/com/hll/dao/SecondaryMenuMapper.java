package com.hll.dao;

import com.hll.pojo.SecondaryMenu;

import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-16 23:33
 */
public interface SecondaryMenuMapper {
    /**
     * 查询指定角色id和
     * 指定一级菜单id的
     * 有二级菜单
     * 参数：
     *      rid:角色id
     *      mid:一级菜单id
     */
    List<SecondaryMenu> getAll(Map<String,Object> map);
}
