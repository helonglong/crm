package com.hll.dao;

import com.hll.pojo.CstLost;
import com.hll.pojo.CstLostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CstLostMapper {
    long countByExample(CstLostExample example);

    int deleteByExample(CstLostExample example);

    int deleteByPrimaryKey(Integer lstId);

    int insert(CstLost record);

    int insertSelective(CstLost record);

    List<CstLost> selectByExample(CstLostExample example);

    CstLost selectByPrimaryKey(Integer lstId);

    int updateByExampleSelective(@Param("record") CstLost record, @Param("example") CstLostExample example);

    int updateByExample(@Param("record") CstLost record, @Param("example") CstLostExample example);

    int updateByPrimaryKeySelective(CstLost record);

    int updateByPrimaryKey(CstLost record);
}