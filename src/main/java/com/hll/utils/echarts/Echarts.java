package com.hll.utils.echarts;

import java.util.List;

/**
 * 返回图表数据类
 * @author 何龙
 * @create 2018-12-14 17:34
 */
public class Echarts {
    /**
     * 返回数据信息
     */
    private List<Elist> list;
    /**
     * 标题
     */
    private String title;
    /**
     * 鼠标指向提示
     */
    private String point;

    public Echarts(List<Elist> list, String title, String point) {
        this.list = list;
        this.title = title;
        this.point = point;
    }
    @Override
    public String toString() {
        return "Echarts{" +
                "list=" + list +
                ", title='" + title + '\'' +
                ", point='" + point + '\'' +
                '}';
    }

    public List<Elist> getList() {
        return list;
    }

    public void setList(List<Elist> list) {
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
}
