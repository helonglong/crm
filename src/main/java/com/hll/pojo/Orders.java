package com.hll.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 订单表
 */
public class Orders {
    private Integer odrId;

    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date odrDate;

    private String odrAddr;

    private String odrStatus;

    private Integer odrCustId;

    public Integer getOdrId() {
        return odrId;
    }

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public Date getOdrDate() {
        return odrDate;
    }

    public void setOdrDate(Date odrDate) {
        this.odrDate = odrDate;
    }

    public String getOdrAddr() {
        return odrAddr;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr == null ? null : odrAddr.trim();
    }

    public String getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus == null ? null : odrStatus.trim();
    }

    public Integer getOdrCustId() {
        return odrCustId;
    }

    public void setOdrCustId(Integer odrCustId) {
        this.odrCustId = odrCustId;

    }

    @Override
    public String toString() {
        return "Orders{" +
                "odrId=" + odrId +
                ", odrDate=" + odrDate +
                ", odrAddr='" + odrAddr + '\'' +
                ", odrStatus='" + odrStatus + '\'' +
                ", odrCustId=" + odrCustId +
                '}';
    }
}