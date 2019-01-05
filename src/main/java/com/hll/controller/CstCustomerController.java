package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.CstCustomer;
import com.hll.service.interfaces.IcstCustomer;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-09 13:53
 */
@Controller
@RequestMapping("/cstCustomer")
public class CstCustomerController {
    @Autowired
    IcstCustomer icstCustomer;
    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<CstCustomer> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            String name, Integer khid,Integer dqid, Integer djid){

        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*开始查询*/
        List<CstCustomer> cstCustomers = icstCustomer.selectAll( name, khid, dqid, djid );
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( cstCustomers );
        /*返回结果集*/
        Msg<CstCustomer> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
//        Msg<CstCustomer> msg=new Msg<>(1,"没有数据",null,null);
        return msg;

    }

    @RequestMapping("/selectId")
    @ResponseBody
    public CstCustomer selectId(@RequestParam("id")Integer id){
        CstCustomer cstCustomer=icstCustomer.selectId(id);
        return cstCustomer;
    }
}
