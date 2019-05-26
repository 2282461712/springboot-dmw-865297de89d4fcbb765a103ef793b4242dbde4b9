package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmItemType implements Serializable {

  private Integer id;
  private String itemType;
  private String level;
  private Integer parent;
  private String aliasName;
  private String key;
  private Date createdTime;
  private Date updatedTime;
  private DmItem dmItem;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
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

  public DmItem getDmItem() {
    return dmItem;
  }

  public void setDmItem(DmItem dmItem) {
    this.dmItem = dmItem;
  }
}
