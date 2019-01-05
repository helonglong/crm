package com.hll.service.interfaces;

import com.hll.utils.echarts.Elist;

import java.util.List;

/**
 * Echarts 报表
 * @author 何龙
 * @create 2018-12-14 20:22
 */
public interface Iecharts {
    /**
     * 按信用
     * @return 按信用用户分布
     */
    List<Elist> credit();

    /**
     * 按等级
     * @return 按等级
     */
    List<Elist> grade();

    /**
     * 按满意度
     * @return 按客户满意度
     */
    List<Elist> satisfaction();

    /**
     * 客户地区分布
     * @return 客户地区分布
     */
    List<Elist> area();

    /**
     * 全部客户贡献
     * @return 全部客户贡献
     */
    List<Elist> customerContribution();

    /**
     * 获取所有分组年份
     * @return 获取所有分组年份
     */
    List<String> years();
    /**
     * 全部客户贡献度 按年份
     * @return 全部客户贡献度 按年份
     */
    List<Elist> years_n(String d);

    /**
     * 客户流失状态分布
     * @return 客户流失状态分布
     */
    List<Elist> status();
}
