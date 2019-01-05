package com.hll.pojo;

/**
 * 一级菜单
 * @author 何龙
 * @create 2018-12-16 22:24
 */
public class AMenu {
    /**
     * id
     */
    private Integer id;
    /**
     * 名称：左侧菜单栏显示的文字
     */
    private String name;
    /**
     * 小图标class  阿里巴巴icon
     */
    private String icon;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "AMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
