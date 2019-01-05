package com.hll.service;

import com.hll.dao.BasDictMapper;
import com.hll.pojo.BasDict;
import com.hll.pojo.BasDictExample;
import com.hll.service.interfaces.IbasDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 9:50
 */
@Service
public class BasDictService implements IbasDict{
    @Autowired
    BasDictMapper basDictMapper;

    @Override
    public List<BasDict> selectAll(String type, String item, String value) {

        BasDictExample basDictExample = new BasDictExample();
        BasDictExample.Criteria criteria = basDictExample.createCriteria();
        if (!"null".equals(type)){
            type="%"+type+"%";
            criteria.andDictTypeLike(type);
        }
        if (!"null".equals(item)){
            item="%"+item+"%";
            criteria.andDictItemLike( item );
        }

        if (!"null".equals(value)){
            value="%"+value+"%";
            criteria.andDictValueLike(value);
        }
        List<BasDict> basDicts = basDictMapper.selectByExample( basDictExample );
        return basDicts;
    }

    @Override
    public void delete(Integer id) {
        basDictMapper.deleteByPrimaryKey( id );
    }

    @Override
    public void update(BasDict basDict) {

        basDictMapper.updateByPrimaryKeySelective(basDict);
    }

    @Override
    public void insert(BasDict basDict) {

        basDictMapper.insert( basDict );
    }

    @Override
    public List<BasDict> selectUserAll(String name) {

        BasDictExample basDictExample = new BasDictExample();
        BasDictExample.Criteria criteria = basDictExample.createCriteria();
        criteria.andDictTypeEqualTo( name );
        List<BasDict> basDicts = basDictMapper.selectByExample( basDictExample );
        return basDicts;
    }
}
