package com.hll.service.interfaces;

import com.hll.pojo.Competence;
import com.hll.pojo.SysRoleRight;
import com.hll.utils.RightUtils;
import com.hll.utils.SysRigthUtils;

import java.util.List;

/**
 * @author 何龙
 * @create 2018-12-16 22:37
 */
public interface IsysRoleRight {
    /**
     * 查询指定角色的全部权限
     */
    List<SysRoleRight> getCompetence(Integer rid);

    /**
     * 修改指定id角色的权限
     * @param rigthUtils 权限工具类
     * @return 状态
     */
    void update(SysRigthUtils rigthUtils);

    /**
     * 获取管理员权限菜单
     * @return 管理员权限菜单
     */
    List<Competence> getAdmin();

    /**
     * 获取指定角色权限名集合
     * @param rid 角色id
     * @return 指定角色权限名集合
     */
    List<RightUtils> getRoleRight(Integer rid);
}
