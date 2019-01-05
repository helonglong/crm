package com.hll.dao;

import com.hll.pojo.OrdersLine;
import com.hll.pojo.OrdersLineExample;
import com.hll.pojo.OrdersList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersLineMapper {
    long countByExample(OrdersLineExample example);

    int deleteByExample(OrdersLineExample example);

    int deleteByPrimaryKey(Integer oddId);

    int insert(OrdersLine record);

    int insertSelective(OrdersLine record);

    List<OrdersLine> selectByExample(OrdersLineExample example);

    OrdersLine selectByPrimaryKey(Integer oddId);

    int updateByExampleSelective(@Param("record") OrdersLine record, @Param("example") OrdersLineExample example);

    int updateByExample(@Param("record") OrdersLine record, @Param("example") OrdersLineExample example);

    int updateByPrimaryKeySelective(OrdersLine record);

    int updateByPrimaryKey(OrdersLine record);

    /**
     * 根据订单编号查询订单详细
     * @param id 订单编号
     * @return 订单详细
     */
    List<OrdersList> selectAll(Integer id);
}