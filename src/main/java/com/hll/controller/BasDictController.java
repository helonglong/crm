package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.BasDict;
import com.hll.service.interfaces.IbasDict;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 9:41
 * 数据字典操作
 */
@Controller
@RequestMapping("/basDict")
public class BasDictController {
    @Autowired
    IbasDict ibasDict;

    @RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    @ResponseBody
    public Msg<BasDict> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam(value = "type", defaultValue = "null") String type,
            @RequestParam(value = "item", defaultValue = "null") String item,
            @RequestParam(value = "value", defaultValue = "null") String value
    ) {

        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*检查是否为条件查询*/
        List<BasDict> basDicts=ibasDict.selectAll( type, item, value );
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( basDicts, 5 );
        /*返回结果集*/
        Msg<BasDict> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
        return msg;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Integer id){
        ibasDict.delete(id);
        return "成功";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(BasDict basDict){
//        开始进行修改
        ibasDict.update(basDict);

        return "成功";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(BasDict basDict){
        System.out.println(basDict);
        ibasDict.insert(basDict);
        return "成功";
    }

    @RequestMapping("/selectType")
    @ResponseBody
    public List<BasDict> selectUserAll(@RequestParam("name") String name){
        List<BasDict> basDicts=ibasDict.selectUserAll(name);

        return basDicts;
    }

}
