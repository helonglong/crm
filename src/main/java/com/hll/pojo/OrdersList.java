package com.hll.pojo;

/**
 * @author 何龙
 * @create 2018-12-13 20:15
 */
public class OrdersList {

    /*订单详细编号*/
    private Integer ordersListId;
    /*订单商品名称*/
    private String ordersListName;

    @Override
    public String toString() {
        return "OrdersList{" +
                "ordersListId=" + ordersListId +
                ", ordersListName='" + ordersListName + '\'' +
                ", ordersListNumber=" + ordersListNumber +
                ", ordersListPrice=" + ordersListPrice +
                ", ordersListCompany='" + ordersListCompany + '\'' +
                ", ordersListTotalPrice=" + ordersListTotalPrice +
                '}';
    }

    /*商品数量*/
    private Integer ordersListNumber;
    /*商品单价*/
    private Float ordersListPrice;
    /*商品单位*/
    private String ordersListCompany;

    public String getOrdersListCompany() {
        return ordersListCompany;
    }

    public void setOrdersListCompany(String ordersListCompany) {
        this.ordersListCompany = ordersListCompany;
    }

    /*商品总价*/
    private Float ordersListTotalPrice;

    public Integer getOrdersListId() {
        return ordersListId;
    }

    public void setOrdersListId(Integer ordersListId) {
        this.ordersListId = ordersListId;
    }

    public String getOrdersListName() {
        return ordersListName;
    }

    public void setOrdersListName(String ordersListName) {
        this.ordersListName = ordersListName;
    }

    public Integer getOrdersListNumber() {
        return ordersListNumber;
    }

    public void setOrdersListNumber(Integer ordersListNumber) {
        this.ordersListNumber = ordersListNumber;
    }

    public Float getOrdersListPrice() {
        return ordersListPrice;
    }

    public void setOrdersListPrice(Float ordersListPrice) {
        this.ordersListPrice = ordersListPrice;
    }

    public Float getOrdersListTotalPrice() {
        return ordersListTotalPrice;
    }

    public void setOrdersListTotalPrice(Float ordersListTotalPrice) {
        this.ordersListTotalPrice = ordersListTotalPrice;
    }
}
