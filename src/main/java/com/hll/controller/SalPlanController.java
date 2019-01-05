package com.hll.controller;

import com.hll.pojo.SalPlan;
import com.hll.service.interfaces.IsalPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 何龙
 * @create 2018-12-08 22:35
 */
@Controller
@RequestMapping("/salPlan")
public class SalPlanController {
    @Autowired
    IsalPlan isalPlan;
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Integer id,String text){

        isalPlan.insert(id,text);

        return null;
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(Integer id,Integer sate,String text){

        isalPlan.update(id,sate,text);

        return null;
    }

    @RequestMapping("/dev")
    public String crmSaleDev(
            @RequestParam("id")Integer id,
            Model model){
        SalPlan salPlan=isalPlan.selectKey(id);
        model.addAttribute( "list",salPlan );
        return "/crm_sale/dev/list_n";
    }


}
