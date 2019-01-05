package com.hll.utils.echarts;

/**
 * 客户贡献Echarts数据
 * @author 何龙
 * @create 2018-12-14 17:02
 */
public class Elist {
    /**
     * 名称
     */
    private String name;
    /**
     * 数据值
     */
    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Elist{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
