package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmCinemaSeat implements Serializable {

  private Integer id;
  private Integer X;
  private Integer Y;
  private Integer areaLevel;
  private Integer cinemaId;
  private Integer sort;
  private Integer status;
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

  public Integer getCinemaId() {
    return cinemaId;
  }

  public void setCinemaId(Integer cinemaId) {
    this.cinemaId = cinemaId;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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
