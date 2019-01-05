package com.hll.dao;

import com.hll.pojo.BasDict;
import com.hll.pojo.BasDictExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasDictMapper {
    long countByExample(BasDictExample example);

    int deleteByExample(BasDictExample example);

    int deleteByPrimaryKey(Integer dictId);

    int insert(BasDict record);

    int insertSelective(BasDict record);

    List<BasDict> selectByExample(BasDictExample example);

    BasDict selectByPrimaryKey(Integer dictId);

    int updateByExampleSelective(@Param("record") BasDict record, @Param("example") BasDictExample example);

    int updateByExample(@Param("record") BasDict record, @Param("example") BasDictExample example);

    int updateByPrimaryKeySelective(BasDict record);

    int updateByPrimaryKey(BasDict record);
}