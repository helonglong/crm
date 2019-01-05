package com.hll.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hll.dao.SysUserMapper;
import com.hll.pojo.SysUser;
import com.hll.service.interfaces.IsysUser;
import com.hll.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-03 15:45
 */

@Controller
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    SysUserMapper sysUserMapper;


    @PostMapping("/insertUser")
    @ResponseBody
    public Map<String,Object> insertUser(
            @RequestParam("userName") String userName,
            @RequestParam("pass") String pass
    ){
        SysUser user=new SysUser();
        user.setUsrName(userName);
        user.setUsrPassword(pass);
        Map<String,Object> map=isysUser.insertUser(user);
        return map;
    }

    /**
     * 修改用户账户状态
     * @param code 状态码
     * @return 状态
     */
    @PostMapping("/setCode")
    @ResponseBody
    public String setCode(@RequestParam("code")Integer code,
                          @RequestParam("id")Integer id){

        isysUser.setCode(id,code);

        return "ok";
    }


    @RequestMapping(value = "/sysInsert",method = RequestMethod.POST)
    @ResponseBody
    public String insert(String list){
        Gson gson=new Gson();
        List<SysUser> o = gson.fromJson( list, new TypeToken<List<SysUser>>() {
        }.getType() );
        for (SysUser s:o){
            sysUserMapper.insert( s );
        }
        System.out.println( o );
        System.out.println(list);
        return "成功";
    }

    /**
     * 查询客户经理所有信息
     * @return 返回客户经理
     */
    @Autowired
    IsysUser isysUser;

    @RequestMapping("/selectUser1")
    @ResponseBody
    public List<SysUser> selectUser1(){
        List<SysUser> sysUsers=isysUser.selectUser1();
        return sysUsers;
    }

    /**
     * 返回所有用户
     * @param page 当前页
     * @param limit 条数
     *
     * @return 用户集合
     */
    @RequestMapping("/getUsers")
    @ResponseBody
    public Msg<SysUser> getUsers(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam(value = "usrId", defaultValue = "") String usrId,
            @RequestParam(value = "usrName", defaultValue = "") String usrName
    ){


        /*准备分页*/
        PageHelper.startPage( page, limit );
        /*检查是否为条件查询*/
        SysUser user=new SysUser();
        user.setUsrId(usrId);
        user.setUsrName(usrName);
        List<SysUser> basDicts=isysUser.getUsers(user);
        /*分页包装*/
        PageInfo pageInfo = new PageInfo( basDicts, 5 );

        return new Msg<>(
                0,"",
                (int)(pageInfo.getTotal()),
                pageInfo.getList());
    }
}
