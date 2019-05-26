package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmSchedulerSeat implements Serializable {

  private Integer id;
  private Integer X;
  private Integer Y;
  private Integer areaLevel;
  private Integer scheduleId;
  private String orderNo;
  private Integer userId;
  private Integer status;
  private Integer sort;
  private Date createdTime;
  private Date updatedTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public Integer getAreaLevel() {
    return areaLevel;
  }

  public void setAreaLevel(Integer areaLevel) {
    this.areaLevel = areaLevel;
  }

  public Integer getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(Integer scheduleId) {
    this.scheduleId = scheduleId;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public Date getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Date updatedTime) {
    this.updatedTime = updatedTime;
  }
}
