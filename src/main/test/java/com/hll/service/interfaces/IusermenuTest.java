package com.hll.service.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 何龙
 * @create 2018-12-16 23:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class IusermenuTest {
    @Autowired
    Iusermenu iusermenu;
    @Test
    public void getMenu() {
/*        SysUser user = new SysUser();
        user.setUsrRoleId(1);
        List<Menu> menu = iusermenu.getMenu( user );
        for (Menu menu1 : menu) {
            System.out.println( menu1 );
        }*/
    }

}