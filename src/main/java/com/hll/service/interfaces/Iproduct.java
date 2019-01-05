package com.hll.service.interfaces;

import com.hll.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 17:38
 */
@Service
public interface Iproduct {
    /**
     *
     * @param prodName 商品名
     * @param prodType 型号
     * @param prodBatch 批次
     * @return 商品列表
     */
    List<Product> selectAll(String prodName, String prodType, String prodBatch);
}
