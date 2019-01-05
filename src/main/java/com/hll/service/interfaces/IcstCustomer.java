package com.hll.service.interfaces;

import com.hll.pojo.CstCustomer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-09 14:03
 */
@Service
public interface IcstCustomer {
    /**
     * 查询客户信息+模糊查询
     * @param name 客户名称
     * @param khid 客户经理id
     * @param dqid 地区id
     * @param djid 等级id
     * @return 结果集
     */
    List<CstCustomer> selectAll(String name, Integer khid, Integer dqid, Integer djid);


    CstCustomer selectId(Integer id);
}
