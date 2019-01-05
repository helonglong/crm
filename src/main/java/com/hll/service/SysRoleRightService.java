package com.hll.service;

import com.hll.dao.AMenuMapper;
import com.hll.dao.SecondaryMenuMapper;
import com.hll.dao.SysRoleRightMapper;
import com.hll.pojo.*;
import com.hll.service.interfaces.IsysRoleRight;
import com.hll.utils.RightUtils;
import com.hll.utils.SysRigthUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 何龙
 * @create 2018-12-16 22:38
 */
@Service
public class SysRoleRightService implements IsysRoleRight {
    @Autowired
    SysRoleRightMapper sysRoleRightMapper;
    @Autowired
    AMenuMapper aMenuMapper;
    @Autowired
    SecondaryMenuMapper secondaryMenuMapper;
    @Override
    public List<SysRoleRight> getCompetence(Integer rid) {

        List<SysRoleRight> list =
                sysRoleRightMapper.getCompetence(rid);
        return list;
    }

    @Override
    public void update(SysRigthUtils competenceList) {
        /*1.删除角色权限*/
        SysRoleRightExample sysRoleRightExample = new SysRoleRightExample();
        SysRoleRightExample.Criteria criteria = sysRoleRightExample.createCriteria();
        criteria.andRfRoleIdEqualTo(competenceList.getRole());//删除指定角色id的权限
        sysRoleRightMapper.deleteByExample(sysRoleRightExample);

        /*2.增加新的权限*/
        List<RightUtils> list = competenceList.getList();
        for (RightUtils o : list) {
            Map<String,Object> map=new LinkedHashMap<>();
            map.put("rid",competenceList.getRole());
            map.put("name",o.getName());

            sysRoleRightMapper.insertOne(map);
        }

    }



    @Override
    public List<Competence> getAdmin() {
        List<Competence> competenceList = new ArrayList<>();
        /*开始获取一级菜单*/
        List<AMenu> AMenus = aMenuMapper.getAll(1);
        /*开始循环获取一级菜单下对应的二级菜单*/
        for (AMenu aMenu : AMenus) {
            /*权限*/
            Competence competence= new Competence();
            competence.setaMenu(aMenu);
            List<RoleRight> roleRights= sysRoleRightMapper.getAdmin(aMenu.getId());
            /*装入权限*/
            competence.setRoleRights(roleRights);
            competenceList.add( competence );
        }
        return competenceList;
    }

    @Override
    public List<RightUtils> getRoleRight(Integer rid) {
        return  sysRoleRightMapper.getRoleRight(rid);
    }
}
