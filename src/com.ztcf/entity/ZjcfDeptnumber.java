package com.ztcf.entity;


import java.io.Serializable;
//部门信息
public class ZjcfDeptnumber implements Serializable {

  private String dept;
  private java.sql.Date sysDate;
  private long num;


  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }


  public java.sql.Date getSysDate() {
    return sysDate;
  }

  public void setSysDate(java.sql.Date sysDate) {
    this.sysDate = sysDate;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "ZjcfDeptnumber{" +
            "dept='" + dept + '\'' +
            ", sysDate=" + sysDate +
            ", num=" + num +
            '}';
  }

  public ZjcfDeptnumber() {
  }
}
