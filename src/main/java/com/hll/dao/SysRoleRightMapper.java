package com.hll.dao;

import com.hll.pojo.RoleRight;
import com.hll.pojo.SysRoleRight;
import com.hll.pojo.SysRoleRightExample;
import com.hll.utils.RightUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysRoleRightMapper {
    long countByExample(SysRoleRightExample example);

    int deleteByExample(SysRoleRightExample example);

    int deleteByPrimaryKey(Integer rfId);

    int insert(SysRoleRight record);

    int insertSelective(SysRoleRight record);

    List<SysRoleRight> selectByExample(SysRoleRightExample example);

    SysRoleRight selectByPrimaryKey(Integer rfId);

    int updateByExampleSelective(@Param("record") SysRoleRight record, @Param("example") SysRoleRightExample example);

    int updateByExample(@Param("record") SysRoleRight record, @Param("example") SysRoleRightExample example);

    int updateByPrimaryKeySelective(SysRoleRight record);

    int updateByPrimaryKey(SysRoleRight record);

    /**
     * 根据角色id查询出所有权限
     * @param rid id
     * @return 所有权限
     */
    List<SysRoleRight> getCompetence(Integer rid);

    /**
     * 查询管理员的权限
     * @param name 父菜单名字
     * @return 管理员的权限
     */
    List<RoleRight> getAdmin(Integer id);

    /**
     * 增加权限
     * rid 角色id
     * name 权限名
     * @param map 权限集合
     */
    void insertOne(Map<String, Object> map);

    /**
     * 获取指定角色权限名集合
     * @param rid 角色id
     * @return 指定角色权限名集合
     */
    List<RightUtils> getRoleRight(Integer rid);
}