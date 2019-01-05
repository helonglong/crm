package com.hll.service;


import com.hll.dao.ProductMapper;
import com.hll.pojo.Product;
import com.hll.pojo.ProductExample;
import com.hll.service.interfaces.Iproduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 17:41
 */
@Service
public class ProductService implements Iproduct {
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> selectAll(String prodName, String prodType, String prodBatch) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        if (!"null".equals(prodName)){
            prodName="%"+prodName+"%";
            criteria.andProdNameLike(prodName);
        }
        if (!"null".equals(prodType)){
            prodType="%"+prodType+"%";
            criteria.andProdTypeLike( prodType );
        }

        if (!"null".equals(prodBatch)){
            prodBatch="%"+prodBatch+"%";
            criteria.andProdBatchLike(prodBatch);
        }
        List<Product> products = productMapper.selectByExample(productExample);
        return products;

    }
}
