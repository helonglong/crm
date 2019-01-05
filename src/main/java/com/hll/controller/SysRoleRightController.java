package com.hll.controller;

import com.hll.pojo.Competence;
import com.hll.service.interfaces.IsysRoleRight;
import com.hll.utils.Msg;
import com.hll.utils.RightUtils;
import com.hll.utils.SysRigthUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-22 0:24
 */
@RestController
@RequestMapping("/roleRight")
public class SysRoleRightController {
    @Autowired
    IsysRoleRight isysRoleRight;

    @PostMapping("/update")
    public Msg update(
            @RequestBody SysRigthUtils list){
        Map<String,Object> map=new HashMap<>();

        if (list.getRole()==null||list.getList().size()<=0){
           return new Msg(1,"参数不合法",null,null);
        }

        isysRoleRight.update( list );

        return new Msg(0,"",null,null);
    }

    @PostMapping("/getAdmin")
    public List<Competence> getAdmin(){
        return isysRoleRight.getAdmin();
    }

    @PostMapping("/getRoleRight")
    public List<RightUtils> getRoleRight(
            @RequestParam("rid")Integer rid){
        return isysRoleRight.getRoleRight(rid);
    }
}
