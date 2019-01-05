package com.hll.utils;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-22 15:47
 */
public class SysRigthUtils {
    private Integer role;
    private List<RightUtils> list;

    @Override
    public String toString() {
        return "SysRigthUtils{" +
                "role=" + role +
                ", list=" + list +
                '}';
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public List<RightUtils> getList() {
        return list;
    }

    public void setList(List<RightUtils> list) {
        this.list = list;
    }
}
