package com.hll.service;

import com.hll.dao.CstCustomerMapper;
import com.hll.pojo.CstCustomer;
import com.hll.service.interfaces.IcstCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-09 14:06
 */
@Service
public class CstCustomerService implements IcstCustomer {
    @Autowired
    CstCustomerMapper cstCustomerMapper;
    @Override
    public List<CstCustomer> selectAll(String name, Integer khid, Integer dqid, Integer djid) {

        if ("".equals( name )){name=null;}//客户姓名
        if (khid!=null&&khid.intValue()==-1){khid=null;}//客户经理id
        if (dqid!=null&&dqid.intValue()==-1){dqid=null;}//地区id
        if (djid!=null&&djid.intValue()==-1){djid=null;}//等级id

        /*封装map*/
        Map<String,Object> map=new HashMap<>();

        map.put( "name" ,name);
        map.put( "khid" ,khid);
        map.put( "dqid" ,dqid);
        map.put( "djid" ,djid);

        List<CstCustomer> cstCustomers= cstCustomerMapper.selectAll(map);
//        List<CstCustomer> cstCustomers = cstCustomerMapper.selectByExample( null );
        return cstCustomers;
    }

    @Override
    public CstCustomer selectId(Integer id) {
        CstCustomer cstCustomer = cstCustomerMapper.selectByPrimaryKey( String.valueOf( id ) );
        return cstCustomer;
    }
}
