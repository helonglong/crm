package com.hll.service;

import com.hll.dao.OrdersMapper;
import com.hll.pojo.Orders;
import com.hll.pojo.OrdersExample;
import com.hll.service.interfaces.Iorders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-13 19:33
 */
@Service
public class OrdersService implements Iorders {
    @Autowired
    OrdersMapper ordersMapper;
    @Override
    public List<Orders> selectAll(Integer id) {
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.createCriteria().andOdrCustIdEqualTo( id );
        List<Orders> orders = ordersMapper.selectByExample( ordersExample );
        return orders;
    }

    @Override
    public Orders selectOne(Integer id) {
        Orders orders = ordersMapper.selectByPrimaryKey( id );
        return orders;
    }
}
