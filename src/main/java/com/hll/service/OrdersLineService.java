package com.hll.service;

import com.hll.dao.OrdersLineMapper;
import com.hll.pojo.OrdersList;
import com.hll.service.interfaces.IordersLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-13 20:50
 */
@Service
public class OrdersLineService implements IordersLine {
    @Autowired
    OrdersLineMapper ordersLineMapper;
    @Override
    public List<OrdersList> selectAll(Integer id) {
        List<OrdersList> ordersList= ordersLineMapper.selectAll(id);
        return ordersList;
    }
}
