package com.hll.controller;

import com.hll.pojo.SysRole;
import com.hll.pojo.SysUser;
import com.hll.service.interfaces.IsysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-17 0:57
 */
@Controller
@RequestMapping("/sysRole")
public class SysRoleController {

    @Autowired
    IsysRole isysRole;

    /**
     * 获取除boos和admin以外的角色
     */
    @RequestMapping("/getAdmin")
    @ResponseBody
    public List<SysRole> getAdmin(){

        List<SysRole> sysRoles=isysRole.getAdmin();

        return sysRoles;
    }
    /**
     * 分配角色
     */
    @RequestMapping("/updateRole")
    @ResponseBody
    public String updateRole(SysUser user){

        isysRole.updateRole(user);

        return "";
    }


    /**
     * 获取除boos、admin、未分配以外的角色
     */
    @RequestMapping("/getAdmin2")
    @ResponseBody
    public List<SysRole> getAdmin2(){
        return isysRole.getAdmin2();
    }
}
