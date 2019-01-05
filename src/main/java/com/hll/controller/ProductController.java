package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.Product;
import com.hll.service.interfaces.Iproduct;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 17:33
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    Iproduct iproduct;

    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<Product> selectAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam(value = "prodName", defaultValue = "null") String prodName,
            @RequestParam(value = "prodType", defaultValue = "null") String prodType,
            @RequestParam(value = "prodBatch", defaultValue = "null") String prodBatch
    ){
        /*准备分页*/
        PageHelper.startPage( page, limit );
        List<Product> products = iproduct.selectAll( prodName, prodType, prodBatch );
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( products, 5 );
        /*返回结果集*/
        return new Msg<>( 0,"",(int)(pageInfo.getTotal()),pageInfo.getList());
    }
}
