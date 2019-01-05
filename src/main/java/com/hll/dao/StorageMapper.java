package com.hll.dao;

import com.hll.pojo.Storage;
import com.hll.pojo.StorageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorageMapper {
    long countByExample(StorageExample example);

    int deleteByExample(StorageExample example);

    int deleteByPrimaryKey(Integer stkId);

    int insert(Storage record);

    int insertSelective(Storage record);

    List<Storage> selectByExample(StorageExample example);

    Storage selectByPrimaryKey(Integer stkId);

    int updateByExampleSelective(@Param("record") Storage record, @Param("example") StorageExample example);

    int updateByExample(@Param("record") Storage record, @Param("example") StorageExample example);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}