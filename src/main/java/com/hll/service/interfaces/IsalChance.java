package com.hll.service.interfaces;

import com.hll.pojo.SalChance;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-07 17:41
 */
@Service
public interface IsalChance {
    /**
     * 销售机会全表查询加模糊查询
     * @param chcCustName 客户名称
     * @param chcLinkman 联系人
     * @param chcCreateDate1 起始日期
     * @param chcCreateDate2 截止日期
     * @return 查询结果
     */
    List<SalChance> selectAll(String chcCustName, String chcLinkman, Date chcCreateDate1, Date chcCreateDate2);

    /**
     * 插入销售机会
     * @param salChance 销售机会pojo
     */
    void add(SalChance salChance);

    /**
     * 分配给客户经理
     * @param salChance pojo
     */
    void feipei(SalChance salChance);

    /**
     * 查询所有已分配的数据
     * @param chcCustName 客户名称
     * @param chcLinkman 联系人
     * @param d1 分配开始时间
     * @param d2 分配截止时间
     * @return 返回结果集
     */
    List<SalChance> selectAll2(String chcCustName, String chcLinkman, String chcStatus, Date d1, Date d2);
}
