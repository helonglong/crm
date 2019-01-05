package com.hll.pojo;

public class SysRight {
    private String rightCode;

    private String rightText;

    private String rightUrl;

    private String rightTip;

    private Integer sysFunId;

    private Short rightType;

    private Integer sysChId;

    public String getRightCode() {
        return rightCode;
    }

    public void setRightCode(String rightCode) {
        this.rightCode = rightCode == null ? null : rightCode.trim();
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText == null ? null : rightText.trim();
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl == null ? null : rightUrl.trim();
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip == null ? null : rightTip.trim();
    }

    public Integer getSysFunId() {
        return sysFunId;
    }

    public void setSysFunId(Integer sysFunId) {
        this.sysFunId = sysFunId;
    }

    public Short getRightType() {
        return rightType;
    }

    public void setRightType(Short rightType) {
        this.rightType = rightType;
    }

    public Integer getSysChId() {
        return sysChId;
    }

    public void setSysChId(Integer sysChId) {
        this.sysChId = sysChId;
    }

    @Override
    public String toString() {
        return "SysRight{" +
                "rightCode='" + rightCode + '\'' +
                ", rightText='" + rightText + '\'' +
                ", rightUrl='" + rightUrl + '\'' +
                ", rightTip='" + rightTip + '\'' +
                ", sysFunId=" + sysFunId +
                ", rightType=" + rightType +
                ", sysChId=" + sysChId +
                '}';
    }
}