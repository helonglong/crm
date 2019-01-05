package com.hll.service.interfaces;

import com.hll.pojo.Orders;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-13 19:32
 */
public interface Iorders {
    /**
     * 查询指定客户的订单
     * @param id 客户id
     * @return 订单
     */
    List<Orders> selectAll(Integer id);

    /**
     * 查询指定订单id
     * @param id 订单id
     * @return 指定订单
     */
    Orders selectOne(Integer id);
}
