package com.hll.service.interfaces;

import com.hll.pojo.CstLinkman;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-10 0:08
 */
@Service
public interface IcstLinkman {
    List<CstLinkman> selectAll(Integer id);
}
