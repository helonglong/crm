package com.hll.service;

import com.hll.dao.AMenuMapper;
import com.hll.dao.SecondaryMenuMapper;
import com.hll.pojo.*;
import com.hll.service.interfaces.IsysRoleRight;
import com.hll.service.interfaces.Iusermenu;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-16 17:14
 */
@Service
public class UserMenuService implements Iusermenu {

    @Autowired
    IsysRoleRight isysRoleRight;

    @Autowired
    AMenuMapper aMenuMapper;

    @Autowired
    SecondaryMenuMapper secondaryMenuMapper;

    @Override
    public List<Menu> getMenu(SysUser user) {
        List<Menu> menuList = new ArrayList<>();


        /*获取Subject*/
        Subject currentUser = SecurityUtils.getSubject();
         /*获取session*/
        Session session = currentUser.getSession();
        /*获取权限*/
        List<SysRoleRight> competence =
                isysRoleRight.getCompetence( user.getUsrRoleId() );
        /*将获取的权限装入session*/
        session.setAttribute("competence",competence);


        /*开始获取一级菜单*/
        List<AMenu> AMenus = aMenuMapper.getAll(user.getUsrRoleId());
        /*开始循环获取一级菜单下对应的二级菜单*/
        for (AMenu aMenu : AMenus) {
            /*菜单对象*/
            Menu menu=new Menu();

            /*装入一级菜单*/
            menu.setaMenu(aMenu);
            /*查询二级菜单*/
            Map<String,Object> map =new HashMap<>();
            map.put("rid",user.getUsrRoleId());
            map.put("mid",aMenu.getId());
            List<SecondaryMenu> bMenu =
                    secondaryMenuMapper.getAll( map );
            /*装入二级菜单*/
            menu.setbMenu(bMenu);

            menuList.add(menu);

        }

        /*将菜单装入session*/
        session.setAttribute("menu",menuList);

        return menuList;
    }
}
