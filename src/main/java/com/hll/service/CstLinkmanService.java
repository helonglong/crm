package com.hll.service;

import com.hll.dao.CstLinkmanMapper;
import com.hll.pojo.CstLinkman;
import com.hll.pojo.CstLinkmanExample;
import com.hll.service.interfaces.IcstLinkman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-10 0:10
 */
@Service
public class CstLinkmanService implements IcstLinkman {
    @Autowired
    CstLinkmanMapper cstLinkmanMapper;
    @Override
    public List<CstLinkman> selectAll(Integer id) {
        CstLinkmanExample cstLinkmanExample = new CstLinkmanExample();
        CstLinkmanExample.Criteria criteria = cstLinkmanExample.createCriteria();
        criteria.andLkmCustNoEqualTo( String.valueOf( id ) );
        List<CstLinkman> cstLinkmen = cstLinkmanMapper.selectByExample(cstLinkmanExample);
        return cstLinkmen;
    }
}
