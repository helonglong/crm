package com.hll.service.interfaces;

import com.hll.pojo.SalPlan;
import org.springframework.stereotype.Service;

/**
 * @author 何龙
 * @create 2018-12-08 22:49
 */
@Service
public interface IsalPlan {
    /**
     * 制订计划
     * @param id 机会表id
     * @param text 计划内容
     */
    void insert(Integer id, String text);

    /**
     * 执行计划
     * @param sate 状态
     * @param id 机会表id
     * @param text 计划内容
     */
    void update(Integer id, Integer sate, String text);

    SalPlan selectKey(Integer id);
}
