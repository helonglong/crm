package com.hll.dao;

import com.hll.pojo.SalChance;
import com.hll.pojo.SalChanceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SalChanceMapper {
    long countByExample(SalChanceExample example);

    int deleteByExample(SalChanceExample example);

    int deleteByPrimaryKey(Integer chcId);

    int insert(SalChance record);

    int insertSelective(SalChance record);

    List<SalChance> selectByExample(SalChanceExample example);

    /**
     * 模糊查询
     *  chcCustName 名称
     *  chcLinkman 联系人
     *  d1 开始时间
     *  d2 截止时间
     * @return 结果集
     */
    List<SalChance> selectWhere(Map<String, Object> map);

    SalChance selectByPrimaryKey(Integer chcId);

    int updateByExampleSelective(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    int updateByExample(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    int updateByPrimaryKeySelective(SalChance record);

    int updateByPrimaryKey(SalChance record);
    /**
     * 模糊查询分配后的数据
     *  chcCustName 名称
     *  chcLinkman 联系人
     *  d1 分配开始时间
     *  d2 分配截止时间
     * @return 结果集
     */
    List<SalChance> selectWhere2(Map<String, Object> map);

    /**
     * 修改状态为3：开发中
     * @param map id sate
     */
    void updateSate(Map<String, Object> map);
}