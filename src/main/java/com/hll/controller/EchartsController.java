package com.hll.controller;

import com.hll.service.interfaces.Iecharts;
import com.hll.utils.echarts.Echarts;
import com.hll.utils.echarts.Elist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 图表、报表控制器
 * @author 何龙
 * @create 2018-12-14 20:14
 */
@Controller
@RequestMapping("/echarts")
public class EchartsController {
    @Autowired
    Iecharts iecharts;
    /**
     * 按信用
     * @return 按信用用户分布
     */
    @RequestMapping(value = "/credit",method = RequestMethod.POST)
    @ResponseBody
    public Echarts credit(){
        List<Elist> Elists=iecharts.credit();

        Echarts echarts=
                new Echarts( Elists,
                        "按信誉度用户分布",
                        "信用度分布" );
        return echarts;
    }


    /**
     * 按等级分布
     * @return 按等级分布
     */
    @RequestMapping(value = "/grade",method = RequestMethod.POST)
    @ResponseBody
    public Echarts grade(){
        List<Elist> Elists=iecharts.grade();

        Echarts echarts=
                new Echarts( Elists,
                        "按客户等级",
                        "客户等级分布" );
        return echarts;
    }

    /**
     * 按满意度
     * @return 按客户满意度
     */
    @RequestMapping(value = "/satisfaction",method = RequestMethod.POST)
    @ResponseBody
    public Echarts satisfaction(){
        List<Elist> Elists=iecharts.satisfaction();

        Echarts echarts=
                new Echarts( Elists,
                        "按客户满意度",
                        "客户满意度分布" );
        return echarts;
    }

    /**
     * 按地区
     * @return 按客户地区
     */
    @RequestMapping(value = "/area",method = RequestMethod.POST)
    @ResponseBody
    public Echarts area(){
        List<Elist> Elists=iecharts.area();

        Echarts echarts=
                new Echarts( Elists,
                        "按客户地区",
                        "客户地区分布" );
        return echarts;
    }


    /**
     * 全部客户贡献度
     * @return 全部客户贡献度
     */
    @RequestMapping(value = "/customerContribution",method = RequestMethod.POST)
    @ResponseBody
    public Echarts customerContribution(){
        List<Elist> Elists=iecharts.customerContribution();

        Echarts echarts=
                new Echarts( Elists,
                        "全部客户贡献度(取二十)",
                        "客户贡献度" );
        return echarts;
    }

    /**
     * 全部客户贡献度
     * @return 全部客户贡献度
     */
    @RequestMapping(value = "/years",method = RequestMethod.POST)
    @ResponseBody
    public List<String> years(){
        List<String> list=iecharts.years();
        return list;
    }


    /**
     * 全部客户贡献度 按年份
     * @return 全部客户贡献度 按年份
     */
    @RequestMapping(value = "/years_n",method = RequestMethod.POST)
    @ResponseBody
    public Echarts years_n(
            @RequestParam("d") String d
    ){
        List<Elist> Elists=iecharts.years_n(d);

        Echarts echarts=
                new Echarts( Elists,
                        d+"年客户贡献度",
                        "客户贡献度" );
        return echarts;
    }

    /**
     * 客户流失状态分布
     * @return 客户流失状态分布
     */
    @RequestMapping(value = "/status",method = RequestMethod.POST)
    @ResponseBody
    public Echarts status(){
        List<Elist> Elists=iecharts.status();

        Echarts echarts=
                new Echarts( Elists,
                        "客户流失状态分布",
                        "客户流失状态" );
        return echarts;
    }


}
