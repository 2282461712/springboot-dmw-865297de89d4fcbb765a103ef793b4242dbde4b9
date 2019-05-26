package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmUser implements Serializable {

  private Integer id;
  private String phone;
  private String password;
  private String wxUserId;
  private String realName;
  private String nickName;
  private Integer sex;
  private String hobby;
  private String idCard;
  private Date birthday;
  private Date createdTime;
  private Date updatedTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getWxUserId() {
    return wxUserId;
  }

  public void setWxUserId(String wxUserId) {
    this.wxUserId = wxUserId;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
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

  @Override
  public String toString() {
    return "DmUser{" +
            "id=" + id +
            ", phone='" + phone + '\'' +
            ", password='" + password + '\'' +
            ", wxUserId='" + wxUserId + '\'' +
            ", realName='" + realName + '\'' +
            ", nickName='" + nickName + '\'' +
            ", sex=" + sex +
            ", hobby='" + hobby + '\'' +
            ", idCard='" + idCard + '\'' +
            ", birthday=" + birthday +
            ", createdTime=" + createdTime +
            ", updatedTime=" + updatedTime +
            '}';
  }
}
