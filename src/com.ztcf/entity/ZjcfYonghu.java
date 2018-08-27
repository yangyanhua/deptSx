package com.ztcf.entity;

import java.io.Serializable;
import java.sql.Timestamp;
//员工表
public class ZjcfYonghu implements Serializable {

  private long uid;
  private String id;
  private String username;
  private String name;
  private String pwd;
  private String usertype;
  private String sex;
  private String dept;
  private String mobile;
  private String phone;
  private String power;
  private long newSales;
  private long isLz;
  private long isLiushi;
  private java.sql.Timestamp xiugaiTime;
  private String level;
  private long allotRate;
  private long allotRateNew;
  private String callcenterNumber;
  private String callcenterName;
  private long isCircle;
  private long circleSize;
  private long execCount;
  private long sumallot;
  private String selectDept;
  private long zuoxi;
  private long fenji;
  private long isExportCsv;
  private String userPassTemp;
  private long execCountTwo;
  private long sumallottwo;
  private java.sql.Timestamp lastLoginTime;
  private String robotSeats;
  private String outCry;
  private ZjcfDeptnumber  zjcfDeptnumber;
  private long deptNum;//部门人数
  private  int todayOrderNum;// 当日订单数
  private  int  weekOrderNum;//当周订单数
  private int  monthOrderNum;//当月订单数
  private  double todayAmount;//当天订单金额
  private double weekAmount;//当周订单金额
  private double mothAmount;//当月订单金额
  private double weekBonus;//周奖金
  private double monthBonuss; //主管奖金
  private int todayOrdersj;//当日升级单数
  private int monthOrdersj;//当月升级单数
  private double todaySjAmount;//当日升级单金额
  private double mothSjAmount;//当月升级单金额
  private  double monthSum;  //月金额汇总
  private String sjrate;//升级率

  public void setDeptNum(long deptNum) {
    this.deptNum = deptNum;
  }

  public long getDeptNum() {

    return deptNum;
  }

  public void setMonthSum(double monthSum) {
    this.monthSum = monthSum;
  }

  public void setSjrate(String sjrate) {
    this.sjrate = sjrate;
  }

  public double getMonthSum() {
    return monthSum;
  }

  public String getSjrate() {
    return sjrate;
  }

  public void setTodaySjAmount(double todaySjAmount) {
    this.todaySjAmount = todaySjAmount;
  }

  public void setMothSjAmount(double mothSjAmount) {
    this.mothSjAmount = mothSjAmount;
  }

  public double getTodaySjAmount() {
    return todaySjAmount;
  }

  public double getMothSjAmount() {
    return mothSjAmount;
  }

  public void setTodayOrdersj(int todayOrdersj) {
    this.todayOrdersj = todayOrdersj;
  }

  public void setMonthOrdersj(int monthOrdersj) {
    this.monthOrdersj = monthOrdersj;
  }

  public int getTodayOrdersj() {
    return todayOrdersj;
  }

  public int getMonthOrdersj() {
    return monthOrdersj;
  }

  public double getMonthBonuss() {
    return monthBonuss;
  }

  public void setMonthBonuss(double monthBonuss) {
    this.monthBonuss = monthBonuss;
  }

  public double getWeekBonus() {
    return weekBonus;
  }

  public void setWeekBonus(double weekBonus) {
    this.weekBonus = weekBonus;
  }

  public void setWeekAmount(double weekAmount) {
    this.weekAmount = weekAmount;
  }

  public void setMothAmount(double mothAmount) {
    this.mothAmount = mothAmount;
  }

  public double getWeekAmount() {
    return weekAmount;
  }

  public double getMothAmount() {
    return mothAmount;
  }

  public double getTodayAmount() {
    return todayAmount;
  }

  public void setTodayAmount(double todayAmount) {
    this.todayAmount = todayAmount;

  }

  public int getMonthOrderNum() {
    return monthOrderNum;
  }

  public void setMonthOrderNum(int mothOrderNum) {
    this.monthOrderNum = mothOrderNum;
  }

  public int getWeekOrderNum() {
    return weekOrderNum;
  }

  public void setWeekOrderNum(int weekOrderNum) {
    this.weekOrderNum = weekOrderNum;
  }



  public void setZjcfDeptnumber(ZjcfDeptnumber zjcfDeptnumber) {
    this.zjcfDeptnumber = zjcfDeptnumber;
  }

  public ZjcfDeptnumber getZjcfDeptnumber() {
    return zjcfDeptnumber;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getUsertype() {
    return usertype;
  }

  public void setUsertype(String usertype) {
    this.usertype = usertype;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPower() {
    return power;
  }

  public void setPower(String power) {
    this.power = power;
  }


  public long getNewSales() {
    return newSales;
  }

  public void setNewSales(long newSales) {
    this.newSales = newSales;
  }


  public long getIsLz() {
    return isLz;
  }

  public void setIsLz(long isLz) {
    this.isLz = isLz;
  }


  public long getIsLiushi() {
    return isLiushi;
  }

  public void setIsLiushi(long isLiushi) {
    this.isLiushi = isLiushi;
  }


  public java.sql.Timestamp getXiugaiTime() {
    return xiugaiTime;
  }

  public void setXiugaiTime(java.sql.Timestamp xiugaiTime) {
    this.xiugaiTime = xiugaiTime;
  }


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  public long getAllotRate() {
    return allotRate;
  }

  public void setAllotRate(long allotRate) {
    this.allotRate = allotRate;
  }


  public long getAllotRateNew() {
    return allotRateNew;
  }

  public void setAllotRateNew(long allotRateNew) {
    this.allotRateNew = allotRateNew;
  }


  public String getCallcenterNumber() {
    return callcenterNumber;
  }

  public void setCallcenterNumber(String callcenterNumber) {
    this.callcenterNumber = callcenterNumber;
  }


  public String getCallcenterName() {
    return callcenterName;
  }

  public void setCallcenterName(String callcenterName) {
    this.callcenterName = callcenterName;
  }


  public long getIsCircle() {
    return isCircle;
  }

  public void setIsCircle(long isCircle) {
    this.isCircle = isCircle;
  }


  public long getCircleSize() {
    return circleSize;
  }

  public void setCircleSize(long circleSize) {
    this.circleSize = circleSize;
  }


  public long getExecCount() {
    return execCount;
  }

  public void setExecCount(long execCount) {
    this.execCount = execCount;
  }


  public long getSumallot() {
    return sumallot;
  }

  public void setSumallot(long sumallot) {
    this.sumallot = sumallot;
  }


  public String getSelectDept() {
    return selectDept;
  }

  public void setSelectDept(String selectDept) {
    this.selectDept = selectDept;
  }


  public long getZuoxi() {
    return zuoxi;
  }

  public void setZuoxi(long zuoxi) {
    this.zuoxi = zuoxi;
  }


  public long getFenji() {
    return fenji;
  }

  public void setFenji(long fenji) {
    this.fenji = fenji;
  }


  public long getIsExportCsv() {
    return isExportCsv;
  }

  public void setIsExportCsv(long isExportCsv) {
    this.isExportCsv = isExportCsv;
  }


  public String getUserPassTemp() {
    return userPassTemp;
  }

  public void setUserPassTemp(String userPassTemp) {
    this.userPassTemp = userPassTemp;
  }


  public long getExecCountTwo() {
    return execCountTwo;
  }

  public void setExecCountTwo(long execCountTwo) {
    this.execCountTwo = execCountTwo;
  }


  public long getSumallottwo() {
    return sumallottwo;
  }

  public void setSumallottwo(long sumallottwo) {
    this.sumallottwo = sumallottwo;
  }


  public java.sql.Timestamp getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(java.sql.Timestamp lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }


  public String getRobotSeats() {
    return robotSeats;
  }

  public void setRobotSeats(String robotSeats) {
    this.robotSeats = robotSeats;
  }


  public String getOutCry() {
    return outCry;
  }

  public void setOutCry(String outCry) {
    this.outCry = outCry;
  }

  public int getTodayOrderNum() {
    return todayOrderNum;
  }

  public void setTodayOrderNum(int todayOrderNum) {
    this.todayOrderNum = todayOrderNum;
  }

  @Override
  public String toString() {
    return "ZjcfYonghu{" +
            "uid=" + uid +
            ", id='" + id + '\'' +
            ", username='" + username + '\'' +
            ", name='" + name + '\'' +
            ", pwd='" + pwd + '\'' +
            ", usertype='" + usertype + '\'' +
            ", sex='" + sex + '\'' +
            ", dept='" + dept + '\'' +
            ", mobile='" + mobile + '\'' +
            ", phone='" + phone + '\'' +
            ", power='" + power + '\'' +
            ", newSales=" + newSales +
            ", isLz=" + isLz +
            ", isLiushi=" + isLiushi +
            ", xiugaiTime=" + xiugaiTime +
            ", level='" + level + '\'' +
            ", allotRate=" + allotRate +
            ", allotRateNew=" + allotRateNew +
            ", callcenterNumber='" + callcenterNumber + '\'' +
            ", callcenterName='" + callcenterName + '\'' +
            ", isCircle=" + isCircle +
            ", circleSize=" + circleSize +
            ", execCount=" + execCount +
            ", sumallot=" + sumallot +
            ", selectDept='" + selectDept + '\'' +
            ", zuoxi=" + zuoxi +
            ", fenji=" + fenji +
            ", isExportCsv=" + isExportCsv +
            ", userPassTemp='" + userPassTemp + '\'' +
            ", execCountTwo=" + execCountTwo +
            ", sumallottwo=" + sumallottwo +
            ", lastLoginTime=" + lastLoginTime +
            ", robotSeats='" + robotSeats + '\'' +
            ", outCry='" + outCry + '\'' +
            ", zjcfDeptnumber=" + zjcfDeptnumber +
            ", deptNum=" + deptNum +
            ", todayOrderNum=" + todayOrderNum +
            ", weekOrderNum=" + weekOrderNum +
            ", monthOrderNum=" + monthOrderNum +
            ", todayAmount=" + todayAmount +
            ", weekAmount=" + weekAmount +
            ", mothAmount=" + mothAmount +
            ", weekBonus=" + weekBonus +
            ", monthBonuss=" + monthBonuss +
            ", todayOrdersj=" + todayOrdersj +
            ", monthOrdersj=" + monthOrdersj +
            ", todaySjAmount=" + todaySjAmount +
            ", mothSjAmount=" + mothSjAmount +
            ", monthSum=" + monthSum +
            ", sjrate='" + sjrate + '\'' +
            '}';
  }

  public ZjcfYonghu(long uid, String id, String username, String name, String pwd, String usertype, String sex, String dept, String mobile, String phone, String power, long newSales, long isLz, long isLiushi, Timestamp xiugaiTime, String level, long allotRate, long allotRateNew, String callcenterNumber, String callcenterName, long isCircle, long circleSize, long execCount, long sumallot, String selectDept, long zuoxi, long fenji, long isExportCsv, String userPassTemp, long execCountTwo, long sumallottwo, Timestamp lastLoginTime, String robotSeats, String outCry, ZjcfDeptnumber zjcfDeptnumber, long deptNum, int todayOrderNum, int weekOrderNum, int monthOrderNum, double todayAmount, double weekAmount, double mothAmount, double weekBonus, double monthBonuss, int todayOrdersj, int monthOrdersj, double todaySjAmount, double mothSjAmount, double monthSum, String sjrate) {
    this.uid = uid;
    this.id = id;
    this.username = username;
    this.name = name;
    this.pwd = pwd;
    this.usertype = usertype;
    this.sex = sex;
    this.dept = dept;
    this.mobile = mobile;
    this.phone = phone;
    this.power = power;
    this.newSales = newSales;
    this.isLz = isLz;
    this.isLiushi = isLiushi;
    this.xiugaiTime = xiugaiTime;
    this.level = level;
    this.allotRate = allotRate;
    this.allotRateNew = allotRateNew;
    this.callcenterNumber = callcenterNumber;
    this.callcenterName = callcenterName;
    this.isCircle = isCircle;
    this.circleSize = circleSize;
    this.execCount = execCount;
    this.sumallot = sumallot;
    this.selectDept = selectDept;
    this.zuoxi = zuoxi;
    this.fenji = fenji;
    this.isExportCsv = isExportCsv;
    this.userPassTemp = userPassTemp;
    this.execCountTwo = execCountTwo;
    this.sumallottwo = sumallottwo;
    this.lastLoginTime = lastLoginTime;
    this.robotSeats = robotSeats;
    this.outCry = outCry;
    this.zjcfDeptnumber = zjcfDeptnumber;
    this.deptNum = deptNum;
    this.todayOrderNum = todayOrderNum;
    this.weekOrderNum = weekOrderNum;
    this.monthOrderNum = monthOrderNum;
    this.todayAmount = todayAmount;
    this.weekAmount = weekAmount;
    this.mothAmount = mothAmount;
    this.weekBonus = weekBonus;
    this.monthBonuss = monthBonuss;
    this.todayOrdersj = todayOrdersj;
    this.monthOrdersj = monthOrdersj;
    this.todaySjAmount = todaySjAmount;
    this.mothSjAmount = mothSjAmount;
    this.monthSum = monthSum;
    this.sjrate = sjrate;
  }

  public ZjcfYonghu() {
  }
}
