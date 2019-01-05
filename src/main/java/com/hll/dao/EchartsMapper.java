package com.hll.dao;

import com.hll.utils.echarts.Elist;

import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-14 20:25
 */
public interface EchartsMapper {
    /**
     * 按信用
     * @return 按信用用户分布
     */
    List<Elist> credit();

    /**
     * 等级
     * @return 客户等级
     */
    List<Elist> grade();
    /**
     * 按满意度
     * @return 按客户满意度
     */
    List<Elist> satisfaction();

    /**
     * 按地区
     * @return 按客户地区
     */
    List<Elist> area();

    /**
     * 全部客户贡献 前十
     * @return 全部客户贡献 前十
     */
    List<Elist> customerContribution();
    /**
     * 全部客户贡献 除前十 其他
     * @return 全部客户贡献 除前十 其他
     */
    Integer customerContribution2();

    /**
     * 获取所有分组年份
     * @return list
     */
    List<String> years();
    /**
     * 全部客户贡献度 按年份 前二十
     * @return 全部客户贡献度 按年份
     * @param d
     */
    List<Elist> years_n(Map<String,String> map);
    /**
     * 全部客户贡献度 按年份 后二十
     * @return 全部客户贡献度 按年份
     * @param d
     */
    Integer years_n2(Map<String,String> map);

    /**
     * 客户流失状态分布
     * @return 客户流失状态分布
     */
    List<Elist> status();
}
