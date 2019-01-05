package com.hll.pojo;

public class CstLinkman {
    private Integer lkmId;
    /**
     *客户编号:外键 cst_customer(cust_no)
     */
    private String lkmCustNo;

    @Override
    public String toString() {
        return "CstLinkman{" +
                "lkmId=" + lkmId +
                ", lkmCustNo='" + lkmCustNo + '\'' +
                ", lkmCustName='" + lkmCustName + '\'' +
                ", lkmName='" + lkmName + '\'' +
                ", lkmSex='" + lkmSex + '\'' +
                ", lkmPostion='" + lkmPostion + '\'' +
                ", lkmTel='" + lkmTel + '\'' +
                ", lkmMobile='" + lkmMobile + '\'' +
                ", lkmMemo='" + lkmMemo + '\'' +
                '}';
    }

    /**
     *客户名称
     */
    private String lkmCustName;
    /**
     *联系人名称
     */
    private String lkmName;
    /**
     *性别:默认值'男'
     */
    private String lkmSex;
    /**
     *职位
     */
    private String lkmPostion;
    /**
     *办公电话
     */
    private String lkmTel;
    /**
     *手机
     */
    private String lkmMobile;
    /**
     *备注
     */
    private String lkmMemo;

    public Integer getLkmId() {
        return lkmId;
    }

    public void setLkmId(Integer lkmId) {
        this.lkmId = lkmId;
    }

    public String getLkmCustNo() {
        return lkmCustNo;
    }

    public void setLkmCustNo(String lkmCustNo) {
        this.lkmCustNo = lkmCustNo == null ? null : lkmCustNo.trim();
    }

    public String getLkmCustName() {
        return lkmCustName;
    }

    public void setLkmCustName(String lkmCustName) {
        this.lkmCustName = lkmCustName == null ? null : lkmCustName.trim();
    }

    public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName == null ? null : lkmName.trim();
    }

    public String getLkmSex() {
        return lkmSex;
    }

    public void setLkmSex(String lkmSex) {
        this.lkmSex = lkmSex == null ? null : lkmSex.trim();
    }

    public String getLkmPostion() {
        return lkmPostion;
    }

    public void setLkmPostion(String lkmPostion) {
        this.lkmPostion = lkmPostion == null ? null : lkmPostion.trim();
    }

    public String getLkmTel() {
        return lkmTel;
    }

    public void setLkmTel(String lkmTel) {
        this.lkmTel = lkmTel == null ? null : lkmTel.trim();
    }

    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile == null ? null : lkmMobile.trim();
    }

    public String getLkmMemo() {
        return lkmMemo;
    }

    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo == null ? null : lkmMemo.trim();
    }
}