package com.hll.service;

import com.hll.dao.SalChanceMapper;
import com.hll.pojo.SalChance;
import com.hll.pojo.SysUser;
import com.hll.service.interfaces.IsalChance;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-07 17:48
 */
@Service
public class SalChanceService implements IsalChance {
    @Autowired
    SalChanceMapper salChanceMapper;
    @Override
    public List<SalChance> selectAll(String chcCustName, String chcLinkman, Date d1, Date d2) {

        if (chcCustName!=null){//chcCustName不为null时装载条件
            chcCustName="%"+chcCustName+"%";
        }

        if (chcLinkman!=null){//chcLinkman不为null时装载条件
            chcLinkman="%"+chcLinkman+"%";
        }

        //起始日期
        String date1=null;
        if (d1!=null){
            date1 = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).format( d1 );
        }
        //截止日期
        String date2=null;
        if (d2!=null){
            date2 = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).format( d2 );
        }

        Map<String,Object> map=new LinkedHashMap<>();
        map.put( "chcCustName",chcCustName );
        map.put( "chcLinkman",chcLinkman );
        map.put( "d1",date1 );
        map.put( "d2",date2 );

        List<SalChance> salChances = salChanceMapper.selectWhere(map);
        return salChances;
    }

    @Override
    public void add(SalChance salChance) {

        int i = salChanceMapper.insertSelective( salChance );
    }

    @Override
    public void feipei(SalChance salChance) {

        salChanceMapper.updateByPrimaryKeySelective( salChance );
    }

    @Override
    public List<SalChance> selectAll2(String chcCustName, String chcLinkman,String chcStatus, Date d1, Date d2) {

        if (chcCustName!=null){//chcCustName不为null时装载条件
            chcCustName="%"+chcCustName+"%";
        }

        if (chcLinkman!=null){//chcLinkman不为null时装载条件
            chcLinkman="%"+chcLinkman+"%";
        }

        //起始日期
        String date1=null;
        if (d1!=null){
            date1 = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).format( d1 );
        }
        //截止日期
        String date2=null;
        if (d2!=null){
            date2 = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).format( d2 );
        }


        Map<String,Object> map=new LinkedHashMap<>();
        map.put( "chcCustName",chcCustName );
        map.put( "chcLinkman",chcLinkman );
        map.put( "d1",date1 );
        map.put( "d2",date2 );
        map.put( "chcStatus",chcStatus );

        /*获取Subject*/
        Subject currentUser = SecurityUtils.getSubject();

        /*获取session*/
        Session session = currentUser.getSession();

        //判断是否为客户经理
        SysUser user = (SysUser) session.getAttribute( "user" );
        if (user.getUsrRoleId()>1){
            map.put( "userId",user.getUsrId());
        }

        return salChanceMapper.selectWhere2(map);

    }


}
