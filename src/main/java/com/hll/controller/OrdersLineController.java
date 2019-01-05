package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.pojo.OrdersList;
import com.hll.service.interfaces.IordersLine;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-13 19:52
 */
@Controller
@RequestMapping("/ordersLine")
public class OrdersLineController {
    @Autowired
    IordersLine iordersLine;

    @RequestMapping("/list")
    public String linkman(Model model, @RequestParam("id")Integer id){
        model.addAttribute( "id",id );
        return "/crm_cus/info/order_detail";
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public Msg<OrdersList> list_n(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam("id") Integer id){

        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*开始查询*/
        List<OrdersList> list = iordersLine.selectAll(id);
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( list );

        Msg<OrdersList> msg=new Msg<>(0,"", (int) pageInfo.getTotal(),pageInfo.getList());
        Map<String,Object> map =new HashMap<>();
        /*求得总价钱*/
        List<OrdersList> list1 = pageInfo.getList();
        Float count=0f;
        for (OrdersList ordersList : list1) {
            count+=ordersList.getOrdersListTotalPrice();
        }

        map.put("amountOfMoney",count);
        msg.setMap( map );
        return msg;
    }


}


