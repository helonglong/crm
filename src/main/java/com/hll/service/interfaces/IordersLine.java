package com.hll.service.interfaces;

import com.hll.pojo.OrdersList;

import java.util.List;

/**
 * 订单详细
 * @author 何龙
 * @create 2018-12-13 20:48
 */
public interface IordersLine {
    /**
     * 根据订单编号查询订单详细
     * @param id 订单编号
     * @return 订单详细
     */
    List<OrdersList> selectAll(Integer id);
}
