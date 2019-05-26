package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmOrderLinkUser implements Serializable {

  private Integer id;
  private Integer orderId;
  private Integer linkUserId;
  private String linkUserName;
  private Integer X;
  private Integer Y;
  private double price;
  private Date createdTime;
  private Integer updatedTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Integer getLinkUserId() {
    return linkUserId;
  }

  public void setLinkUserId(Integer linkUserId) {
    this.linkUserId = linkUserId;
  }

  public String getLinkUserName() {
    return linkUserName;
  }

  public void setLinkUserName(String linkUserName) {
    this.linkUserName = linkUserName;
  }

  public Integer getX() {
    return X;
  }

  public void setX(Integer x) {
    X = x;
  }

  public Integer getY() {
    return Y;
  }

  public void setY(Integer y) {
    Y = y;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }
}
