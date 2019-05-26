package com.szxs.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 剧场详情实体类
 */
public class VoItemDetail implements Serializable {
    private Integer id;
    private String itemName;
    private String  abstractMessage;
    private Integer itemType1Id;
    private String  itemType1Name;
    private Integer itemType2Id;
    private String itemType2Name;
    private Date startTime;
    private Date endTime;
    private String state;
    private String basicDescription;
    private String projectDescription;
    private String reminderDescription;
    private Integer cinemaId;
    private Float avgScore;
    private Integer commentCount;
    private Integer areaId;
    private String areaName;
    private String latitude;
    private String longitude;
    private String imgUrl;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
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

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Float avgScore) {
        this.avgScore = avgScore;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
