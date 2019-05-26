package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmItem implements Serializable {

  private Integer id;
  private String itemName;
  private String abstractMessage;
  private Integer itemType1Id;
  private String itemType1Name;
  private Integer itemType2Id;
  private String itemType2Name;
  private Integer state;
  private String basicDescription;
  private String projectDescription;
  private String reminderDescription;
  private String longitude;
  private String latitude;
  private Integer isBanner;
  private Integer isRecommend;
  private double avgScore;
  private Integer commentCount;
  private Integer cinemaId;
  private Date startTime;
  private Date endTime;
  private double minPrice;
  private double maxPrice;
  private Integer ageGroup;
  private Date createdTime;
  private Date updatedTime;
  private DmImage dmImage;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getAbstractMessage() {
    return abstractMessage;
  }

  public void setAbstractMessage(String abstractMessage) {
    this.abstractMessage = abstractMessage;
  }

  public Integer getItemType1Id() {
    return itemType1Id;
  }

  public void setItemType1Id(Integer itemType1Id) {
    this.itemType1Id = itemType1Id;
  }

  public String getItemType1Name() {
    return itemType1Name;
  }

  public void setItemType1Name(String itemType1Name) {
    this.itemType1Name = itemType1Name;
  }

  public Integer getItemType2Id() {
    return itemType2Id;
  }

  public void setItemType2Id(Integer itemType2Id) {
    this.itemType2Id = itemType2Id;
  }

  public String getItemType2Name() {
    return itemType2Name;
  }

  public void setItemType2Name(String itemType2Name) {
    this.itemType2Name = itemType2Name;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getBasicDescription() {
    return basicDescription;
  }

  public void setBasicDescription(String basicDescription) {
    this.basicDescription = basicDescription;
  }

  public String getProjectDescription() {
    return projectDescription;
  }

  public void setProjectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
  }

  public String getReminderDescription() {
    return reminderDescription;
  }

  public void setReminderDescription(String reminderDescription) {
    this.reminderDescription = reminderDescription;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Integer getIsBanner() {
    return isBanner;
  }

  public void setIsBanner(Integer isBanner) {
    this.isBanner = isBanner;
  }

  public Integer getIsRecommend() {
    return isRecommend;
  }

  public void setIsRecommend(Integer isRecommend) {
    this.isRecommend = isRecommend;
  }

  public double getAvgScore() {
    return avgScore;
  }

  public void setAvgScore(double avgScore) {
    this.avgScore = avgScore;
  }

  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }

  public Integer getCinemaId() {
    return cinemaId;
  }

  public void setCinemaId(Integer cinemaId) {
    this.cinemaId = cinemaId;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public double getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(double minPrice) {
    this.minPrice = minPrice;
  }

  public double getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(double maxPrice) {
    this.maxPrice = maxPrice;
  }

  public Integer getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(Integer ageGroup) {
    this.ageGroup = ageGroup;
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

  public DmImage getDmImage() {
    return dmImage;
  }

  public void setDmImage(DmImage dmImage) {
    this.dmImage = dmImage;
  }
}
