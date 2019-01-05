package com.hll.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CstLost {
    private Integer lstId;
    /**
     *客户编号: 外键
     */
    private String lstCustNo;
    /**
     *客户名称
     */
    private String lstCustName;
    /**
     *客户经理id
     */
    private String lstCustManagerId;
    /**
     *客户经理名字
     */
    private String lstCustManagerName;
    /**
     *上次下单时间
     */
    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lstLastOrderDate;
    /**
     *流失时间
     */
    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lstLostDate;
    /**
     *流失原因
     */
    private String lstDelay;
    /**
     *暂缓措施
     */
    private String lstReason;
    /**
     *状态: 默认值1 1 预警 2 暂缓流失 3 确认流失
     */
    private Short lstStatus=0;

    public Integer getLstId() {
        return lstId;
    }

    public void setLstId(Integer lstId) {
        this.lstId = lstId;
    }

    public String getLstCustNo() {
        return lstCustNo;
    }

    public void setLstCustNo(String lstCustNo) {
        this.lstCustNo = lstCustNo == null ? null : lstCustNo.trim();
    }

    public String getLstCustName() {
        return lstCustName;
    }

    public void setLstCustName(String lstCustName) {
        this.lstCustName = lstCustName == null ? null : lstCustName.trim();
    }

    public String getLstCustManagerId() {
        return lstCustManagerId;
    }

    public void setLstCustManagerId(String lstCustManagerId) {
        this.lstCustManagerId = lstCustManagerId == null ? null : lstCustManagerId.trim();
    }

    public String getLstCustManagerName() {
        return lstCustManagerName;
    }

    public void setLstCustManagerName(String lstCustManagerName) {
        this.lstCustManagerName = lstCustManagerName == null ? null : lstCustManagerName.trim();
    }

    public Date getLstLastOrderDate() {
        return lstLastOrderDate;
    }

    public void setLstLastOrderDate(Date lstLastOrderDate) {
        this.lstLastOrderDate = lstLastOrderDate;
    }

    public Date getLstLostDate() {
        return lstLostDate;
    }

    public void setLstLostDate(Date lstLostDate) {
        this.lstLostDate = lstLostDate;
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay == null ? null : lstDelay.trim();
    }

    public String getLstReason() {
        return lstReason;
    }

    public void setLstReason(String lstReason) {
        this.lstReason = lstReason == null ? null : lstReason.trim();
    }

    public Short getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(Short lstStatus) {
        this.lstStatus = lstStatus;
    }

    @Override
    public String toString() {
        return "CstLost{" +
                "lstId=" + lstId +
                ", lstCustNo='" + lstCustNo + '\'' +
                ", lstCustName='" + lstCustName + '\'' +
                ", lstCustManagerId='" + lstCustManagerId + '\'' +
                ", lstCustManagerName='" + lstCustManagerName + '\'' +
                ", lstLastOrderDate=" + lstLastOrderDate +
                ", lstLostDate=" + lstLostDate +
                ", lstDelay='" + lstDelay + '\'' +
                ", lstReason='" + lstReason + '\'' +
                ", lstStatus=" + lstStatus +
                '}';
    }
}