package com.hll.pojo;

public class OrdersLine {
    private Integer oddId;

    private Integer oddOrderId;

    private Integer oddProdId;

    private Integer oddCount;

    public Integer getOddId() {
        return oddId;
    }

    public void setOddId(Integer oddId) {
        this.oddId = oddId;
    }

    public Integer getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(Integer oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public Integer getOddProdId() {
        return oddProdId;
    }

    public void setOddProdId(Integer oddProdId) {
        this.oddProdId = oddProdId;
    }

    public Integer getOddCount() {
        return oddCount;
    }

    public void setOddCount(Integer oddCount) {
        this.oddCount = oddCount;
    }

    @Override
    public String toString() {
        return "OrdersLine{" +
                "oddId=" + oddId +
                ", oddOrderId=" + oddOrderId +
                ", oddProdId=" + oddProdId +
                ", oddCount=" + oddCount +
                '}';
    }
}