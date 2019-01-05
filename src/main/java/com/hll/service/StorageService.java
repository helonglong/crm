package com.hll.service;

import com.hll.dao.StorageMapper;
import com.hll.pojo.Storage;
import com.hll.pojo.StorageExample;
import com.hll.service.interfaces.Istorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 20:50
 */
@Service
public class StorageService implements Istorage {
    @Autowired
    StorageMapper storageMapper;
    @Override
    public List<Storage> selectAll(String prodName, String stkWarehouse) {
        StorageExample storageExample = new StorageExample();
        StorageExample.Criteria criteria = storageExample.createCriteria();
        if (!"null".equals( prodName )){
            prodName="%"+prodName+"%";
            criteria.andStkMemoLike(prodName);
        }
        if (!"null".equals( stkWarehouse )){
            stkWarehouse="%"+stkWarehouse+"%";
            criteria.andStkWarehouseLike(stkWarehouse);
        }
        System.out.println("prodName---------->"+prodName);
        System.out.println("stkWarehouse---------->"+stkWarehouse);
        List<Storage> storages = storageMapper.selectByExample( storageExample );
        return storages;
    }
}
