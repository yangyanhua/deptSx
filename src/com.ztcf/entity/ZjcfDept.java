package com.ztcf.entity;


import java.io.Serializable;

public class ZjcfDept implements Serializable {

  private long id;
  private String dept;
  private long zt;
  private java.sql.Timestamp xiugaiTime;
  private double taskamount;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }


  public long getZt() {
    return zt;
  }

  public void setZt(long zt) {
    this.zt = zt;
  }


  public java.sql.Timestamp getXiugaiTime() {
    return xiugaiTime;
  }

  public void setXiugaiTime(java.sql.Timestamp xiugaiTime) {
    this.xiugaiTime = xiugaiTime;
  }


  public double getTaskamount() {
    return taskamount;
  }

  public void setTaskamount(double taskamount) {
    this.taskamount = taskamount;
  }

  public ZjcfDept() {
  }
}
