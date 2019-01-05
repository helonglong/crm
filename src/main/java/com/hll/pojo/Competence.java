package com.hll.pojo;

import java.util.List;

/**
 * 权限列表
 * @author 何龙
 * @create 2018-12-22 10:54
 */
public class Competence {
    private AMenu aMenu;
    private List<RoleRight> roleRights;

    public AMenu getaMenu() {
        return aMenu;
    }

    public void setaMenu(AMenu aMenu) {
        this.aMenu = aMenu;
    }

    public List<RoleRight> getRoleRights() {
        return roleRights;
    }

    public void setRoleRights(List<RoleRight> roleRights) {
        this.roleRights = roleRights;
    }

    @Override
    public String toString() {
        return "Competence{" +
                "aMenu=" + aMenu +
                ", roleRights=" + roleRights +
                '}';
    }
}
