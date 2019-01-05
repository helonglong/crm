package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.CstLost;
import com.hll.service.interfaces.IcstLost;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-14 0:26
 */
@Controller
@RequestMapping("/cstLost")
public class CstLostController {
    @Autowired
    IcstLost icstLost;
    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<CstLost> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            CstLost cstLost){
        System.out.println(cstLost);
        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*开始查询*/
        List<CstLost> cstLosts = icstLost.selectAll( cstLost);
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( cstLosts );
        /*返回结果集*/
        Msg<CstLost> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
//        Msg<CstLost> msg=new Msg<>(1,"没有数据",null,null);
        return msg;

    }
}
