package com.hll.pojo;

/**
 * 权限
 * @author 何龙
 * @create 2018-12-22 10:57
 */
public class RoleRight {
    private String name;
    private String value;

    @Override
    public String toString() {
        return "RoleRight{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
