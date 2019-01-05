package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.Storage;
import com.hll.service.interfaces.Istorage;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 20:42
 */
@Controller
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    Istorage istorage;
    /**
     * 查询所有信息，加模糊查询
     */
    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<Storage> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam(value = "prodName", defaultValue = "null") String prodName,
            @RequestParam(value = "stkWarehouse", defaultValue = "null") String stkWarehouse
    ){
        /*准备分页*/
        PageHelper.startPage( page, limit );
        List<Storage> storages = istorage.selectAll( prodName, stkWarehouse );
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( storages, 5 );
        /*返回结果集*/
        Msg<Storage> msg=new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
        return msg;
    }
}
