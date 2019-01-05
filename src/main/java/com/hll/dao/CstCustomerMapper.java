package com.hll.dao;

import com.hll.pojo.CstCustomer;
import com.hll.pojo.CstCustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CstCustomerMapper {
    long countByExample(CstCustomerExample example);

    int deleteByExample(CstCustomerExample example);

    int deleteByPrimaryKey(String custId);

    int insert(CstCustomer record);

    int insertSelective(CstCustomer record);

    List<CstCustomer> selectByExample(CstCustomerExample example);

    CstCustomer selectByPrimaryKey(String custId);

    int updateByExampleSelective(@Param("record") CstCustomer record, @Param("example") CstCustomerExample example);

    int updateByExample(@Param("record") CstCustomer record, @Param("example") CstCustomerExample example);

    int updateByPrimaryKeySelective(CstCustomer record);

    int updateByPrimaryKey(CstCustomer record);

    /**
     * 查询客户信息+模糊查询
     *  name 客户名称
     *  khid 客户经理id
     *  dqid 地区id
     *  djid 等级id
     * @return 结果集
     */
    List<CstCustomer> selectAll(Map<String, Object> map);
}