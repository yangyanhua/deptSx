package com.ztcf.entity;

import java.io.Serializable;

public class Xsorder implements Serializable {
    private String dept ;
    private String name;
    private Integer num;
    private Integer daynum;
    private Integer weeknum;
    private Integer monthnum;
    private Integer dayamount ;
    private Integer weekamount ;
    private Integer monthamount ;
    private Integer weekbonus;
    private Integer directorbonus;
    private Integer daysjnum;
    private Integer monthsjnum;
    private Integer daysjamount ;
    private Integer monthsjamount ;

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getDaynum() {
        return daynum;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public Integer getMonthnum() {
        return monthnum;
    }

    public Integer getDayamount() {
        return dayamount;
    }

    public Integer getWeekamount() {
        return weekamount;
    }

    public Integer getMonthamount() {
        return monthamount;
    }

    public Integer getWeekbonus() {
        return weekbonus;
    }

    public Integer getDirectorbonus() {
        return directorbonus;
    }

    public Integer getDaysjnum() {
        return daysjnum;
    }

    public Integer getMonthsjnum() {
        return monthsjnum;
    }

    public Integer getDaysjamount() {
        return daysjamount;
    }

    public Integer getMonthsjamount() {
        return monthsjamount;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setDaynum(Integer daynum) {
        this.daynum = daynum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public void setMonthnum(Integer monthnum) {
        this.monthnum = monthnum;
    }

    public void setDayamount(Integer dayamount) {
        this.dayamount = dayamount;
    }

    public void setWeekamount(Integer weekamount) {
        this.weekamount = weekamount;
    }

    public void setMonthamount(Integer monthamount) {
        this.monthamount = monthamount;
    }

    public void setWeekbonus(Integer weekbonus) {
        this.weekbonus = weekbonus;
    }

    public void setDirectorbonus(Integer directorbonus) {
        this.directorbonus = directorbonus;
    }

    public void setDaysjnum(Integer daysjnum) {
        this.daysjnum = daysjnum;
    }

    public void setMonthsjnum(Integer monthsjnum) {
        this.monthsjnum = monthsjnum;
    }

    public void setDaysjamount(Integer daysjamount) {
        this.daysjamount = daysjamount;
    }

    public void setMonthsjamount(Integer monthsjamount) {
        this.monthsjamount = monthsjamount;
    }

    @Override
    public String toString() {
        return "Xsorder{" +
                "dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", daynum=" + daynum +
                ", weeknum=" + weeknum +
                ", monthnum=" + monthnum +
                ", dayamount=" + dayamount +
                ", weekamount=" + weekamount +
                ", monthamount=" + monthamount +
                ", weekbonus=" + weekbonus +
                ", directorbonus=" + directorbonus +
                ", daysjnum=" + daysjnum +
                ", monthsjnum=" + monthsjnum +
                ", daysjamount=" + daysjamount +
                ", monthsjamount=" + monthsjamount +
                '}';
    }

    public Xsorder() {
    }
}
