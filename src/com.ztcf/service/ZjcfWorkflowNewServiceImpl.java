package com.ztcf.service;

import com.ztcf.dao.ZjcfWorkflowNewDao;
import com.ztcf.entity.ZjcfWorkflowNew;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ZjcfWorkflowNewServiceImpl implements ZjcfWorkflowNewService {
    @Autowired
    private ZjcfWorkflowNewDao zjcfWorkflowNewDao;









    public int getTodayNumByDept(Date date ,String xsDept)
    {
        return zjcfWorkflowNewDao.findtime11(date,xsDept);


    }
    public int getWeekNumByDept(Date date ,String xsDept){
        return zjcfWorkflowNewDao.findtime22(date,xsDept);

    }
    @Override
    public int getMothNumByDept(Date date, String xsDept) {
        return zjcfWorkflowNewDao.findtime33(date,xsDept);
    }
    public double getTodayAmount(Date date, String xsDept){
        return zjcfWorkflowNewDao.findTodayAmout(date,xsDept);
    }

    @Override
    public double getWeekAmount(Date date, String xsDept) {
       return zjcfWorkflowNewDao.findWeekAmout(date,xsDept);
    }

    @Override
    public double getMothAmount(Date date, String xsDept) {
       return zjcfWorkflowNewDao.findMonthAmout(date,xsDept);
    }

    @Override
    public int getTodaySjByDept(Date date, String xsDept) {
        return zjcfWorkflowNewDao.findTodaySj(date,xsDept);
    }

    @Override
    public int getMonthSjByDept(Date date, String xsDept) {
        return zjcfWorkflowNewDao.findMonthSj(date,xsDept);
    }

    @Override
    public double getTodaySjAmount(Date date, String xsDept) {

        return zjcfWorkflowNewDao.findTodaySjAmount(date,xsDept);
    }

    @Override
    public double getMonthTodaySjAmount(Date date, String xsDept) {
        return zjcfWorkflowNewDao.findMonthSjAmount(date,xsDept);
    }




}
