package com.ztcf.entity;

import java.io.Serializable;

public class Model2 implements Serializable {
    private String xsDept;
    private double upamount;
    private int counts;

    public void setUpamount(double upamount) {
        this.upamount = upamount;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public double getUpamount() {
        return upamount;
    }

    public int getCounts() {
        return counts;
    }

    public String getXsDept() {
        return xsDept;
    }

    public void setXsDept(String xsDept) {
        this.xsDept = xsDept;
    }

    @Override
    public String toString() {
        return "Model2{" +
                "xsDept='" + xsDept + '\'' +
                ", upamount=" + upamount +
                ", counts=" + counts +
                '}';
    }

    public Model2() {
    }
}