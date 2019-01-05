package com.hll.service;

import com.hll.dao.CstActivityMapper;
import com.hll.pojo.CstActivity;
import com.hll.pojo.CstActivityExample;
import com.hll.service.interfaces.ICstActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-11 20:38
 */
@Service
public class CstActivityService implements ICstActivity {
    @Autowired
    CstActivityMapper cstActivityMapper;
    @Override
    public List<CstActivity> selectAll(Integer id) {
        CstActivityExample cstActivityExample = new CstActivityExample();
        CstActivityExample.Criteria criteria = cstActivityExample.createCriteria();
        criteria.andAtvCustNoEqualTo( String.valueOf( id ) );
        List<CstActivity> cstActivities =
                cstActivityMapper.select(String.valueOf( id ));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+cstActivities);
        return cstActivities;
    }
}
