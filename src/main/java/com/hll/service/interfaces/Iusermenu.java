package com.hll.service.interfaces;

import com.hll.pojo.Menu;
import com.hll.pojo.SysUser;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-16 17:13
 */
public interface Iusermenu {
    /**
     * 获取权限和菜单放入session
     * @param user 用户
     * @return 返回菜单集合
     */
    List<Menu> getMenu(SysUser user);
}
