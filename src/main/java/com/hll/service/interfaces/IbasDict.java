package com.hll.service.interfaces;

import com.hll.pojo.BasDict;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-06 9:48
 */
@Service
public interface IbasDict {
    /**
     * 条件模糊查询
     */
    List<BasDict> selectAll(String type, String item, String value);

    /**
     * 根据id删除数据
     * @param id
     */
    void delete(Integer id);
    /*根据id进行修改*/
    void update(BasDict basDict);

    /**
     * 插入数据
     * @param basDict
     */
    void insert(BasDict basDict);

    /**
     * 查询指定角色id类别的拥护
     * @param name 字典类别
     * @return
     */
    List<BasDict> selectUserAll(String name);
}
