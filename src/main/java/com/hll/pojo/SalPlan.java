package com.hll.pojo;

import java.util.Date;

/**
 * 机会执行表
 */
public class SalPlan {
    private Integer plaId;

    private Integer plaChcId;

    private Date plaDate;

    private String plaTodo;

    private String plaResult;

    public SalChance getSalChance() {
        return salChance;
    }

    @Override
    public String toString() {
        return "SalPlan{" +
                "plaId=" + plaId +
                ", plaChcId=" + plaChcId +
                ", plaDate=" + plaDate +
                ", plaTodo='" + plaTodo + '\'' +
                ", plaResult='" + plaResult + '\'' +
                ", salChance=" + salChance +
                '}';
    }

    public void setSalChance(SalChance salChance) {
        this.salChance = salChance;
    }

    private SalChance salChance;

    public Integer getPlaId() {
        return plaId;
    }

    public void setPlaId(Integer plaId) {
        this.plaId = plaId;
    }

    public Integer getPlaChcId() {
        return plaChcId;
    }

    public void setPlaChcId(Integer plaChcId) {
        this.plaChcId = plaChcId;
    }

    public Date getPlaDate() {
        return plaDate;
    }

    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    public String getPlaTodo() {
        return plaTodo;
    }

    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo == null ? null : plaTodo.trim();
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult == null ? null : plaResult.trim();
    }
}