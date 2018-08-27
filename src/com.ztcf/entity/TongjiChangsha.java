package com.ztcf.entity;


import java.io.Serializable;
//升级
public class TongjiChangsha implements Serializable {

  private String uporderid;
  private java.sql.Date uptradedate;
  private String neworderid;
  private double upamount;
  private double newamount;
  private long upnum;


  public String getUporderid() {
    return uporderid;
  }

  public void setUporderid(String uporderid) {
    this.uporderid = uporderid;
  }


  public java.sql.Date getUptradedate() {
    return uptradedate;
  }

  public void setUptradedate(java.sql.Date uptradedate) {
    this.uptradedate = uptradedate;
  }


  public String getNeworderid() {
    return neworderid;
  }

  public void setNeworderid(String neworderid) {
    this.neworderid = neworderid;
  }


  public double getUpamount() {
    return upamount;
  }

  public void setUpamount(double upamount) {
    this.upamount = upamount;
  }


  public double getNewamount() {
    return newamount;
  }

  public void setNewamount(double newamount) {
    this.newamount = newamount;
  }


  public long getUpnum() {
    return upnum;
  }

  public void setUpnum(long upnum) {
    this.upnum = upnum;
  }

  @Override
  public String toString() {
    return "TongjiChangsha{" +
            "uporderid='" + uporderid + '\'' +
            ", uptradedate=" + uptradedate +
            ", neworderid='" + neworderid + '\'' +
            ", upamount=" + upamount +
            ", newamount=" + newamount +
            ", upnum=" + upnum +
            '}';
  }

  public TongjiChangsha() {
  }
}
