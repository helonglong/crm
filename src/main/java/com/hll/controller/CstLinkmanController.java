package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.CstLinkman;
import com.hll.service.interfaces.IcstLinkman;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-09 21:11
 */
@Controller
@RequestMapping("/cstLinkman")
public class CstLinkmanController {
    @RequestMapping("/linkman")
    public String linkman(Model model, @RequestParam("id")Integer id){
        model.addAttribute( "id",id );
        return "/crm_cus/info/linkman";
    }

    @Autowired
    IcstLinkman icstLinkman;
    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<CstLinkman> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam("id") Integer id){

        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*开始查询*/
        List<CstLinkman> list = icstLinkman.selectAll(id);
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( list );
        /*返回结果集*/
        Msg<CstLinkman> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
//        Msg<CstCustomer> msg=new Msg<>(1,"没有数据",null,null);
        return msg;

    }

}
