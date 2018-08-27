package com.ztcf.entity;


import java.io.Serializable;
//订单表
public class ZjcfWorkflowNew implements Serializable {

  private long id;
  private String orderId;
  private String operDate;
  private String khName;
  private String sex;
  private String mobile;
  private String qq;
  private String email;
  private String wechat;
  private String ckName;
  private String amount;
  private String hkName;
  private long hkType;
  private String gmCourse;
  private String dgTime;
  private long orderType;
  private String description;
  private long flag;
  private long xsTj;
  private long kfTj;
  private long newStatus;
  private String newOperUser;
  private String newOperDate;
  private String newDesc;
  private String xs_name;
  private String xsDept;
  private String kf_Name;

  public void setTongjiChangsha(TongjiChangsha tongjiChangsha) {
    this.tongjiChangsha = tongjiChangsha;
  }

  public TongjiChangsha getTongjiChangsha() {
    return tongjiChangsha;
  }

  private TongjiChangsha tongjiChangsha;
  public long getId() {
    return id;
  }

  public String getOrderId() {
    return orderId;
  }

  public String getOperDate() {
    return operDate;
  }

  public String getKhName() {
    return khName;
  }

  public String getSex() {
    return sex;
  }

  public String getMobile() {
    return mobile;
  }

  public String getQq() {
    return qq;
  }

  public String getEmail() {
    return email;
  }

  public String getWechat() {
    return wechat;
  }

  public String getCkName() {
    return ckName;
  }

  public String getAmount() {
    return amount;
  }

  public String getHkName() {
    return hkName;
  }

  public long getHkType() {
    return hkType;
  }

  public String getGmCourse() {
    return gmCourse;
  }

  public String getDgTime() {
    return dgTime;
  }

  public long getOrderType() {
    return orderType;
  }

  public String getDescription() {
    return description;
  }

  public long getFlag() {
    return flag;
  }

  public long getXsTj() {
    return xsTj;
  }

  public long getKfTj() {
    return kfTj;
  }

  public long getNewStatus() {
    return newStatus;
  }

  public String getNewOperUser() {
    return newOperUser;
  }

  public String getNewOperDate() {
    return newOperDate;
  }

  public String getNewDesc() {
    return newDesc;
  }

  public String getXs_name() {
    return xs_name;
  }

  public String getXsDept() {
    return xsDept;
  }

  public String getKf_Name() {
    return kf_Name;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public void setOperDate(String operDate) {
    this.operDate = operDate;
  }

  public void setKhName(String khName) {
    this.khName = khName;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }

  public void setCkName(String ckName) {
    this.ckName = ckName;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public void setHkName(String hkName) {
    this.hkName = hkName;
  }

  public void setHkType(long hkType) {
    this.hkType = hkType;
  }

  public void setGmCourse(String gmCourse) {
    this.gmCourse = gmCourse;
  }

  public void setDgTime(String dgTime) {
    this.dgTime = dgTime;
  }

  public void setOrderType(long orderType) {
    this.orderType = orderType;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setFlag(long flag) {
    this.flag = flag;
  }

  public void setXsTj(long xsTj) {
    this.xsTj = xsTj;
  }

  public void setKfTj(long kfTj) {
    this.kfTj = kfTj;
  }

  public void setNewStatus(long newStatus) {
    this.newStatus = newStatus;
  }

  public void setNewOperUser(String newOperUser) {
    this.newOperUser = newOperUser;
  }

  public void setNewOperDate(String newOperDate) {
    this.newOperDate = newOperDate;
  }

  public void setNewDesc(String newDesc) {
    this.newDesc = newDesc;
  }

  public void setXs_name(String xs_name) {
    this.xs_name = xs_name;
  }

  public void setXsDept(String xsDept) {
    this.xsDept = xsDept;
  }

  public void setKf_Name(String kf_Name) {
    this.kf_Name = kf_Name;
  }

  @Override
  public String toString() {
    return "ZjcfWorkflowNew{" +
            "id=" + id +
            ", orderId='" + orderId + '\'' +
            ", operDate='" + operDate + '\'' +
            ", khName='" + khName + '\'' +
            ", sex='" + sex + '\'' +
            ", mobile='" + mobile + '\'' +
            ", qq='" + qq + '\'' +
            ", email='" + email + '\'' +
            ", wechat='" + wechat + '\'' +
            ", ckName='" + ckName + '\'' +
            ", amount='" + amount + '\'' +
            ", hkName='" + hkName + '\'' +
            ", hkType=" + hkType +
            ", gmCourse='" + gmCourse + '\'' +
            ", dgTime='" + dgTime + '\'' +
            ", orderType=" + orderType +
            ", description='" + description + '\'' +
            ", flag=" + flag +
            ", xsTj=" + xsTj +
            ", kfTj=" + kfTj +
            ", newStatus=" + newStatus +
            ", newOperUser='" + newOperUser + '\'' +
            ", newOperDate='" + newOperDate + '\'' +
            ", newDesc='" + newDesc + '\'' +
            ", xs_name='" + xs_name + '\'' +
            ", xsDept='" + xsDept + '\'' +
            ", kf_Name='" + kf_Name + '\'' +
            ", tongjiChangsha=" + tongjiChangsha +
            '}';
  }

  public ZjcfWorkflowNew() {
  }
}
