package com.hll.service.interfaces;

import com.hll.pojo.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-12-08 9:47
 */
@Service
public interface IsysUser {
    /**
     * 查询客户经理所有信息
     * @return 返回客户经理
     */
    List<SysUser> selectUser1();

    /**
     * 返回所有用户
     * @param user 用户对象
     * @return 用户集合
     */
    List<SysUser> getUsers(SysUser user);


    void setCode(Integer id,Integer code);

    /**
     * 新增系统用户
     * @param user 用户
     * @return 状态
     */
    Map<String, Object> insertUser(SysUser user);
}
