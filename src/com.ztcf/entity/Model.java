package com.ztcf.entity;

import java.io.Serializable;

public class Model implements Serializable {

    private String xsDept;
    private int counts;
    private double monthBonus;

    public void setMonthBonus(double monthBonus) {
        this.monthBonus = monthBonus;
    }

    public double getMonthBonus() {
        return monthBonus;
    }

    public String getXsDept() {
        return xsDept;
    }

    public void setXsDept(String xsDept) {
        this.xsDept = xsDept;
    }

    public int getCounts() {
        return counts;
    }
    public void setCounts(int counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "Model{" +
                "xsDept='" + xsDept + '\'' +
                ", counts=" + counts +
                ", monthBonus=" + monthBonus +
                '}';
    }

    public Model() {
    }
}