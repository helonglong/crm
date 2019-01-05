package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.CstActivity;
import com.hll.service.interfaces.ICstActivity;
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
 * @create 2018-12-11 20:31
 */
@Controller
@RequestMapping("/cstActivity")
public class CstActivityController {
    @RequestMapping("/contact")
    public String activity(Model model, @RequestParam("id")Integer id){
        model.addAttribute( "id",id );
        return "/crm_cus/info/contact";
    }

    @Autowired
    ICstActivity iCstActivity;
    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<CstActivity> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam("id") Integer id){

        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*开始查询*/
        List<CstActivity> list = iCstActivity.selectAll(id);
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( list );
        /*返回结果集*/
        Msg<CstActivity> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
        return msg;

    }

}
