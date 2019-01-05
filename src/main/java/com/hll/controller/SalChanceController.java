package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.SalChance;
import com.hll.service.interfaces.IsalChance;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-07 19:15
 */
@Controller
@RequestMapping("/salChance")
public class SalChanceController {
    @Autowired
    IsalChance isalChance;
    /**
     * 查询所有信息，加模糊查询
     */
    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<SalChance> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            String chcCustName, String chcLinkman,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date d1,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date d2){

        if ("".equals( chcCustName )){
            chcCustName=null;
        }
        if ("".equals( chcLinkman )){
            chcLinkman=null;
        }

        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*开始查询*/
        List<SalChance> salChances = isalChance.selectAll( chcCustName, chcLinkman, d1, d2 );
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( salChances, 5 );
        /*返回结果集*/
        Msg<SalChance> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
//        Msg<SalChance> msg=new Msg<>(1,"没有数据",null,null);
        return msg;
    }


    /**
     * 增加信息
     */
    @RequestMapping("/add")
    @ResponseBody
    public String add(SalChance salChance){
        System.out.println(salChance);
        isalChance.add( salChance );
        return "成功！";
    }

    /**
     * 将销售机会分配给客户经理
     * @param salChance pojo
     * @return 。。
     */
    @RequestMapping("/feipei")
    @ResponseBody
    public String feipei(SalChance salChance){
        System.out.println( salChance );
        isalChance.feipei(salChance);
        return "成功";
    }



    /**
     * 客户开发计划
     *
     * @return 。。
     */
    @RequestMapping("/development")
    @ResponseBody
    public Msg<SalChance> development(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            String chcCustName, String chcLinkman,String chcStatus,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date d1,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date d2){


        if ("".equals( chcCustName )){
            chcCustName=null;
        }
        if ("".equals( chcLinkman )){
            chcLinkman=null;
        }
        if ("0".equals( chcStatus )){
            chcStatus=null;
        }

        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*开始查询*/
        List<SalChance> salChances = isalChance.selectAll2( chcCustName, chcLinkman, chcStatus, d1, d2 );
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( salChances, 5 );
        /*返回结果集*/
        Msg<SalChance> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
//        Msg<SalChance> msg=new Msg<>(1,"没有数据",null,null);

        return msg;
    }
}
