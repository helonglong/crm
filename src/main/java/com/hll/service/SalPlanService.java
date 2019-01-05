package com.hll.service;

import com.hll.dao.SalChanceMapper;
import com.hll.dao.SalPlanMapper;
import com.hll.pojo.SalPlan;
import com.hll.service.interfaces.IsalPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-08 22:51
 */
@Service
public class SalPlanService implements IsalPlan{
    @Autowired
    SalPlanMapper salPlanMapper;
    @Autowired
    SalChanceMapper salChanceMapper;
    @Override
    public void insert(Integer id, String text) {
        /*制订计划*/
        Map<String,Object> map=new HashMap<>();
        map.put( "id",id );
        map.put( "text",text );
        salPlanMapper.insertOne(map);

        /*修改状态为3：开发中*/
        map.put("sate",3);
        salChanceMapper.updateSate(map);

    }

    @Override
    public void update(Integer id, Integer sate, String text) {
        /*执行计划*/
        Map<String,Object> map=new HashMap<>();
        map.put( "id",id );
        map.put( "text",text );
        salPlanMapper.updateOne(map);

        /*修改状态为4：开发失败  5：开发成功*/
        map.put("sate",sate);
        salChanceMapper.updateSate(map);
    }

    @Override
    public SalPlan selectKey(Integer id) {
        SalPlan salPlan = salPlanMapper.selectByPrimaryKey( id );
        return salPlan;
    }

}
