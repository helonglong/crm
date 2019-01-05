package com.hll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 后台界面转发控制器
 */
@Controller
public class BaseController {
    /**
     * 一级目录统一转发
     * @param url 目标jsp
     * @return
     */
    @RequestMapping(value = "/{url}",method = RequestMethod.GET)
    public String base(@PathVariable("url") String url){
        return url;
    }

    /**
     * 二级目录统一转发
     * @param url1 一级目录
     * @param url2 目标jsp
     * @return
     */
    @RequestMapping(value = "/{url1:^crm_\\S*$}/{url2}",method = RequestMethod.GET)
    public String base_two(@PathVariable("url1") String url1,
                           @PathVariable("url2") String url2){
        return url1+"/"+url2;
    }
    /**
     * 三级目录统一转发
     * @param url1 目录1
     * @param url2 目录2
     * @param url3 目标文件
     *
     */

    @RequestMapping(value = "/{url1:^crm_\\S*$}/{url2}/{url3}",method = RequestMethod.GET)
    public String base_three(@PathVariable("url1") String url1,
                             @PathVariable("url2") String url2,
                             @PathVariable("url3") String url3){
        return url1+"/"+url2+"/"+url3;
    }



}


