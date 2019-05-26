package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

public class DmOrder implements Serializable {

  private Integer id;
  private String orderNo;
  private Integer userId;
  private Integer schedulerId;
  private Integer itemId;
  private String itemName;
  private String wxTradeNo;
  private String aliTradeNo;
  private Integer orderType;
  private String payType;
  private Integer totalCount;
  private Integer sourceType;
  private Integer isNeedInvoice;
  private Integer invoiceType;
  private String invoiceHead;
  private String invoiceNo;
  private Integer isNeedInsurance;
  private double totalAmount;
  private double insuranceAmount;
  private Date createdTime;
  private Date updatedTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public Integer getSchedulerId() {
    return schedulerId;
  }

  public void setSchedulerId(Integer schedulerId) {
    this.schedulerId = schedulerId;
  }

  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getWxTradeNo() {
    return wxTradeNo;
  }

  public void setWxTradeNo(String wxTradeNo) {
    this.wxTradeNo = wxTradeNo;
  }

  public String getAliTradeNo() {
    return aliTradeNo;
  }

  public void setAliTradeNo(String aliTradeNo) {
    this.aliTradeNo = aliTradeNo;
  }

  public Integer getOrderType() {
    return orderType;
  }

  public void setOrderType(Integer orderType) {
    this.orderType = orderType;
  }

  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public Integer getSourceType() {
    return sourceType;
  }

  public void setSourceType(Integer sourceType) {
    this.sourceType = sourceType;
  }

  public Integer getIsNeedInvoice() {
    return isNeedInvoice;
  }

  public void setIsNeedInvoice(Integer isNeedInvoice) {
    this.isNeedInvoice = isNeedInvoice;
  }

  public Integer getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
  }

  public String getInvoiceHead() {
    return invoiceHead;
  }

  public void setInvoiceHead(String invoiceHead) {
    this.invoiceHead = invoiceHead;
  }

  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public Integer getIsNeedInsurance() {
    return isNeedInsurance;
  }

  public void setIsNeedInsurance(Integer isNeedInsurance) {
    this.isNeedInsurance = isNeedInsurance;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public double getInsuranceAmount() {
    return insuranceAmount;
  }

  public void setInsuranceAmount(double insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
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
