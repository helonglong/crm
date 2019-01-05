package com.hll.Chiro;

import com.hll.dao.SysRightMapper;
import com.hll.pojo.SysRight;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-05 23:04
 */
public class FilterChainDefinitionMap {

    LinkedHashMap<String,String> map=new LinkedHashMap<>();

    @Autowired
    SysRightMapper sysRightMapper;

    public LinkedHashMap<String,String> getMap(){
        map.put( "/static/**","anon" );//开启静态资源访问
        map.put( "/403.jsp","anon" );//403页面
        map.put( "/404.jsp","anon" );//404页面
        map.put( "/500.jsp","anon" );//500页面
        map.put( "/login.jsp","anon" );//登录页面
        map.put( "/shiro/login","anon" );//登录逻辑页面
        map.put( "/getCode","anon" );//验证码
        /*上面是免登陆能访问的资源*/

        map.put( "/shiro/logout","logout" );//退出登录
        map.put( "/crm_sys/edit1","authc,roles[admin]" );//管理员角色
        map.put( "/crm_sys/list","authc,roles[admin]" );//管理员角色


        /*加入数据库权限*/
        List<SysRight> sysRights =
                sysRightMapper.selectByExample( null );

        for (SysRight sysRight : sysRights) {
            map.put( sysRight.getRightUrl(),
                    "perms[\""+sysRight.getRightTip()+"\"]");
        }

        map.put( "/**","authc" );//其他页面必须登录才能访问
        return map;
    }
}
