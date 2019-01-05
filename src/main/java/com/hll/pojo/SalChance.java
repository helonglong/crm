package com.hll.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 销售机会
 */
public class SalChance implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Integer chcId;
    /**
     * 机会来源
     */
    private String chcSource;
    /**
     *客户名称
     */
    private String chcCustName;
    /**
     *概要
     */
    private String chcTitle;
    /**
     *成功几率 0-100
     */
    private Integer chcRate;
    /**
     *联系人
     */
    private String chcLinkman;
    /**
     *联系人电话
     */
    private String chcTel;
    /**
     *机会描述
     */
    private String chcDesc;
    /**
     *创建人ID: 引用sys_user(usr_id)
     */
    private String chcCreateId;
    /**
     *创建人名字
     */
    private String chcCreateBy;
    /**
     *创建日期时间
     */
    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chcCreateDate;

    @Override
    public String toString() {
        return "SalChance{" +
                "chcId=" + chcId +
                ", chcSource='" + chcSource + '\'' +
                ", chcCustName='" + chcCustName + '\'' +
                ", chcTitle='" + chcTitle + '\'' +
                ", chcRate=" + chcRate +
                ", chcLinkman='" + chcLinkman + '\'' +
                ", chcTel='" + chcTel + '\'' +
                ", chcDesc='" + chcDesc + '\'' +
                ", chcCreateId='" + chcCreateId + '\'' +
                ", chcCreateBy='" + chcCreateBy + '\'' +
                ", chcCreateDate=" + chcCreateDate +
                ", chcDueId='" + chcDueId + '\'' +
                ", chcDueTo='" + chcDueTo + '\'' +
                ", chcDueDate=" + chcDueDate +
                ", chcStatus=" + chcStatus +
                '}';
    }

    /**
     *指派给-某人ID
     */
    private String chcDueId;
    /**
     *指派给-某人名字
     */
    private String chcDueTo;
    /**
     *指派日期时间
     */
    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chcDueDate;
    /**
     *状态: 1 未指派 2 已指派(或开发中) 3 开发成功 4 开发失败
     */
    private Short chcStatus;


    public Integer getChcId() {
        return chcId;
    }

    public void setChcId(Integer chcId) {
        this.chcId = chcId;
    }

    public String getChcSource() {
        return chcSource;
    }

    public void setChcSource(String chcSource) {
        this.chcSource = chcSource == null ? null : chcSource.trim();
    }

    public String getChcCustName() {
        return chcCustName;
    }

    public void setChcCustName(String chcCustName) {
        this.chcCustName = chcCustName == null ? null : chcCustName.trim();
    }

    public String getChcTitle() {
        return chcTitle;
    }

    public void setChcTitle(String chcTitle) {
        this.chcTitle = chcTitle == null ? null : chcTitle.trim();
    }

    public Integer getChcRate() {
        return chcRate;
    }

    public void setChcRate(Integer chcRate) {
        this.chcRate = chcRate;
    }

    public String getChcLinkman() {
        return chcLinkman;
    }

    public void setChcLinkman(String chcLinkman) {
        this.chcLinkman = chcLinkman == null ? null : chcLinkman.trim();
    }

    public String getChcTel() {
        return chcTel;
    }

    public void setChcTel(String chcTel) {
        this.chcTel = chcTel == null ? null : chcTel.trim();
    }

    public String getChcDesc() {
        return chcDesc;
    }

    public void setChcDesc(String chcDesc) {
        this.chcDesc = chcDesc == null ? null : chcDesc.trim();
    }

    public String getChcCreateId() {
        return chcCreateId;
    }

    public void setChcCreateId(String chcCreateId) {
        this.chcCreateId = chcCreateId == null ? null : chcCreateId.trim();
    }

    public String getChcCreateBy() {
        return chcCreateBy;
    }

    public void setChcCreateBy(String chcCreateBy) {
        this.chcCreateBy = chcCreateBy == null ? null : chcCreateBy.trim();
    }

    public Date getChcCreateDate() {
        return chcCreateDate;
    }

    public void setChcCreateDate(Date chcCreateDate) {
        this.chcCreateDate = chcCreateDate;
    }

    public String getChcDueId() {
        return chcDueId;
    }

    public void setChcDueId(String chcDueId) {
        this.chcDueId = chcDueId == null ? null : chcDueId.trim();
    }

    public String getChcDueTo() {
        return chcDueTo;
    }

    public void setChcDueTo(String chcDueTo) {
        this.chcDueTo = chcDueTo == null ? null : chcDueTo.trim();
    }

    public Date getChcDueDate() {
        return chcDueDate;
    }

    public void setChcDueDate(Date chcDueDate) {
        this.chcDueDate = chcDueDate;
    }

    public Short getChcStatus() {
        return chcStatus;
    }

    public void setChcStatus(Short chcStatus) {

        this.chcStatus = chcStatus;
    }

}