package com.hll.service.interfaces;

import com.hll.pojo.CstLost;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-14 0:29
 */
@Service
public interface IcstLost {
    /**
     * 查询所有客户流失信息
     * @param cstLost 客户流失对象
     * @return 客户流失
     */
    List<CstLost> selectAll(CstLost cstLost);
}
