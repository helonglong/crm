package com.hll.pojo;

/**
 * 子菜单  带链接的
 * @author 何龙
 * @create 2018-12-16 22:26
 */
public class SecondaryMenu {
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
    /**
     * 菜单指向的路径
     */
    private String path;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "SecondaryMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
