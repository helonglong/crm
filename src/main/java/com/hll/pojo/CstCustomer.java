package com.hll.pojo;

public class CstCustomer {
    private String custId;
    /**
     *客户名称
     */
    private String custName;
    /**
     *客户经理ID
     */
    private String custManagerId;
    /**
     *客户级别:默认值1 (数据字典 客户等级)
     */
    private String custLevel;
    /**
     *客户满意度:1~5 默认值3 (数据字典 客户满意度)
     */
    private String custSatisfy;
    /**
     *客户信用度:1~5 默认值3 (数据字典 客户信用度)
     */
    private String custCredit;
    /**
     *地址
     */
    private String custAddr;
    /**
     * 邮编
     */
    private String custZip;
    /**
     *电话
     */
    private String custTel;
    /**
     *网址
     */
    private String custWebsite;
    /**
     *客户状态: 默认值 1 正常 2,并将cust_status列修改为非空
     */
    private Short custStatus;
    /**
     *地区: 数据字典(地区)
     */
    private String custRegion;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustManagerId() {
        return custManagerId;
    }

    public void setCustManagerId(String custManagerId) {
        this.custManagerId = custManagerId == null ? null : custManagerId.trim();
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel == null ? null : custLevel.trim();
    }

    public String getCustSatisfy() {
        return custSatisfy;
    }

    public void setCustSatisfy(String custSatisfy) {
        this.custSatisfy = custSatisfy == null ? null : custSatisfy.trim();
    }

    public String getCustCredit() {
        return custCredit;
    }

    public void setCustCredit(String custCredit) {
        this.custCredit = custCredit == null ? null : custCredit.trim();
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr == null ? null : custAddr.trim();
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip == null ? null : custZip.trim();
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel == null ? null : custTel.trim();
    }

    public String getCustWebsite() {
        return custWebsite;
    }

    public void setCustWebsite(String custWebsite) {
        this.custWebsite = custWebsite == null ? null : custWebsite.trim();
    }

    public Short getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(Short custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustRegion() {
        return custRegion;
    }

    public void setCustRegion(String custRegion) {
        this.custRegion = custRegion == null ? null : custRegion.trim();
    }
}