package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmSchedulerSeatPrice implements Serializable {

  private Integer id;
  private double price;
  private Integer areaLevel;
  private Integer scheduleId;
  private Integer seatNum;
  private Date createdTime;
  private Date updatedTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
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

  public Integer getSeatNum() {
    return seatNum;
  }

  public void setSeatNum(Integer seatNum) {
    this.seatNum = seatNum;
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
