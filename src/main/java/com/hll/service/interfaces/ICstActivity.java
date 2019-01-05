package com.hll.service.interfaces;

import com.hll.pojo.CstActivity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-11 20:36
 */
@Service
public interface ICstActivity {
    /**
     * 查询所有交往记录
     * @param id 外键
     * @return 结果集
     */
    List<CstActivity> selectAll(Integer id);
}
