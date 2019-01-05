package com.hll.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CstActivity {
    private Integer atvId;

    private String atvCustNo;
    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date atvDate;

    private String atvPlace;

    private String atvTitle;

    private String atvRemark;

    private String atvDesc;

    public Integer getAtvId() {
        return atvId;
    }

    public void setAtvId(Integer atvId) {
        this.atvId = atvId;
    }

    public String getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(String atvCustNo) {
        this.atvCustNo = atvCustNo == null ? null : atvCustNo.trim();
    }

    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace == null ? null : atvPlace.trim();
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle == null ? null : atvTitle.trim();
    }

    public String getAtvRemark() {
        return atvRemark;
    }

    public void setAtvRemark(String atvRemark) {
        this.atvRemark = atvRemark == null ? null : atvRemark.trim();
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc == null ? null : atvDesc.trim();
    }
}