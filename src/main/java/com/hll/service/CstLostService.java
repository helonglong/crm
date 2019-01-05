package com.hll.service;

import com.hll.dao.CstLostMapper;
import com.hll.pojo.CstLost;
import com.hll.pojo.CstLostExample;
import com.hll.pojo.SysUser;
import com.hll.service.interfaces.IcstLost;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-14 0:31
 */
@Service
public class CstLostService implements IcstLost {
    @Autowired
    CstLostMapper cstLostMapper;
    @Override
    public List<CstLost> selectAll(CstLost cstLost) {
        CstLostExample cstLostExample=new CstLostExample();
        CstLostExample.Criteria criteria = cstLostExample.createCriteria();

        if (cstLost!=null){
            if ((!"".equals(cstLost.getLstCustName())&&cstLost.getLstCustName()!=null)){
                criteria.andLstCustNameLike("%"+cstLost.getLstCustName()+"%");
            }
            if (!"0".equals(cstLost.getLstCustManagerId()) && cstLost.getLstCustManagerId()!=null){
                criteria.andLstCustManagerIdEqualTo(cstLost.getLstCustManagerId());
            }
            if (cstLost.getLstStatus()!= 0 && cstLost.getLstStatus()!=null){
                criteria.andLstStatusEqualTo(cstLost.getLstStatus());
            }
        }


        SysUser user =
                (SysUser) SecurityUtils.getSubject().getSession().getAttribute( "user" );
        if (user.getUsrRoleId()>1){//角色不是管理员和boss时
            criteria.andLstCustManagerIdEqualTo(user.getUsrId());
        }

        List<CstLost> cstLosts = cstLostMapper.selectByExample(cstLostExample);

        return cstLosts;
    }
}
