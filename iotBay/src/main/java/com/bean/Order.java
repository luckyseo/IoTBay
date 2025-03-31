package com.bean;

import com.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Long orderId;
    private Date createDate;
    private OrderStatus orderStatus;
    private Integer[] productIds;
    private Customer buyer;

    public Order() {
    }

    public Order(Long orderId, Date createDate, OrderStatus orderStatus, Integer[] productIds, Customer buyer) {
        this.orderId = orderId;
        this.createDate = createDate;
        this.orderStatus = orderStatus;
        this.productIds = productIds;
        this.buyer = buyer;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer[] getProductIds() {
        return productIds;
    }

    public void setProductIds(Integer[] productIds) {
        this.productIds = productIds;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }
}