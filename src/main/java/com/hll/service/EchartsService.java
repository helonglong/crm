package com.hll.service;

import com.hll.dao.EchartsMapper;
import com.hll.service.interfaces.Iecharts;
import com.hll.utils.echarts.Elist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-14 20:23
 */
@Service
public class EchartsService implements Iecharts {
    @Autowired
    EchartsMapper echartsMapper;
    @Override
    public List<Elist> credit() {
        List<Elist> elists = echartsMapper.credit();
        return elists;
    }

    @Override
    public List<Elist> grade() {
        List<Elist> elists = echartsMapper.grade();
        return elists;
    }

    @Override
    public List<Elist> satisfaction() {
        List<Elist> elists = echartsMapper.satisfaction();
        return elists;
    }

    @Override
    public List<Elist> area() {
        List<Elist> elists = echartsMapper.area();
        return elists;
    }

    @Override
    public List<Elist> customerContribution() {
        List<Elist> elists = echartsMapper.customerContribution();
        Integer sum=echartsMapper.customerContribution2();
        Elist elist=new Elist();
        elist.setName("其他");
        elist.setValue(sum);
        elists.add(elist);
        return elists;
    }

    @Override
    public List<String> years() {
        List<String> list = echartsMapper.years();
        return list;
    }

    @Override
    public List<Elist> years_n(String d) {
        Map<String,String> map =new HashMap<>();
        map.put( "d1",d+"-01-01 00:00:00" );
        map.put( "d2",d+"-12-31 23:59:59" );
        List<Elist> elists = echartsMapper.years_n(map);
        Integer sum=echartsMapper.years_n2(map);
        if (sum!=null){
            Elist elist=new Elist();
            elist.setName("其他");
            elist.setValue(sum);
            elists.add(elist);
        }
        return elists;
    }

    @Override
    public List<Elist> status() {
        List<Elist> elists = echartsMapper.status();
        return elists;
    }

}
