package com.hll.dao;

import com.hll.pojo.CstLinkman;
import com.hll.pojo.CstLinkmanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CstLinkmanMapper {
    long countByExample(CstLinkmanExample example);

    int deleteByExample(CstLinkmanExample example);

    int deleteByPrimaryKey(Integer lkmId);

    int insert(CstLinkman record);

    int insertSelective(CstLinkman record);

    List<CstLinkman> selectByExample(CstLinkmanExample example);

    CstLinkman selectByPrimaryKey(Integer lkmId);

    int updateByExampleSelective(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    int updateByExample(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    int updateByPrimaryKeySelective(CstLinkman record);

    int updateByPrimaryKey(CstLinkman record);
}