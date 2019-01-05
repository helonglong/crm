package com.hll.dao;

import com.hll.pojo.SalPlan;
import com.hll.pojo.SalPlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SalPlanMapper {
    long countByExample(SalPlanExample example);

    int deleteByExample(SalPlanExample example);

    int deleteByPrimaryKey(Integer plaId);

    int insert(SalPlan record);

    int insertSelective(SalPlan record);

    List<SalPlan> selectByExample(SalPlanExample example);

    SalPlan selectByPrimaryKey(Integer plaId);

    int updateByExampleSelective(@Param("record") SalPlan record, @Param("example") SalPlanExample example);

    int updateByExample(@Param("record") SalPlan record, @Param("example") SalPlanExample example);

    int updateByPrimaryKeySelective(SalPlan record);

    int updateByPrimaryKey(SalPlan record);

    /**
     * 制订计划
     * @param map id与计划内容
     */
    void insertOne(Map<String, Object> map);

    /**
     * 执行计划
     * @param map id与计划结果
     */
    void updateOne(Map<String, Object> map);
}