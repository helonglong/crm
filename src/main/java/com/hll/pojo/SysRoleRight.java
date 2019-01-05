package com.hll.pojo;

public class SysRoleRight {
    private Integer rfId;

    private Integer rfRoleId;

    private Integer rfRightCode;

    private SysRight sysRight;

    public SysRight getSysRight() {
        return sysRight;
    }

    public void setSysRight(SysRight sysRight) {
        this.sysRight = sysRight;
    }

    public Integer getRfId() {
        return rfId;
    }

    public void setRfId(Integer rfId) {
        this.rfId = rfId;
    }

    public Integer getRfRoleId() {
        return rfRoleId;
    }

    public void setRfRoleId(Integer rfRoleId) {
        this.rfRoleId = rfRoleId;
    }

    public Integer getRfRightCode() {
        return rfRightCode;
    }

    public void setRfRightCode(Integer rfRightCode) {
        this.rfRightCode = rfRightCode;
    }

    @Override
    public String toString() {
        return "SysRoleRight{" +
                "rfId=" + rfId +
                ", rfRoleId=" + rfRoleId +
                ", rfRightCode=" + rfRightCode +
                ", sysRight=" + sysRight +
                '}';
    }
}