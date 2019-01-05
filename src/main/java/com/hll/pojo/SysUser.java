package com.hll.pojo;

/**
 * 系统用户表
 */
public class SysUser {
    private String usrId;

    private String usrName;

    private String usrPassword;

    private SysRole role;

    private Integer usrRoleId;

    private Integer usrFlag;


    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }

    public Integer getUsrRoleId() {
        return usrRoleId;
    }

    public void setUsrRoleId(Integer usrRoleId) {
        this.usrRoleId = usrRoleId;
    }

    public Integer getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(Integer usrFlag) {
        this.usrFlag = usrFlag;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "usrId='" + usrId + '\'' +
                ", usrName='" + usrName + '\'' +
                ", usrPassword='" + usrPassword + '\'' +
                ", role=" + role +
                ", usrRoleId=" + usrRoleId +
                ", usrFlag=" + usrFlag +
                '}';
    }
}