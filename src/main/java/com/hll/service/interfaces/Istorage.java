package com.hll.service.interfaces;

import com.hll.pojo.Storage;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 20:47
 */
@Service
public interface Istorage {
    /**
     *查询所有，加模糊查询
     */
    List<Storage> selectAll(String prodName, String stkWarehouse);
}
