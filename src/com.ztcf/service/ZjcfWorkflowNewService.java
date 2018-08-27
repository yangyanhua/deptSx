package com.ztcf.service;

import com.ztcf.entity.ZjcfWorkflowNew;


import java.util.Date;
import java.util.List;

public interface ZjcfWorkflowNewService {






    //查询当天订单数
    int getTodayNumByDept(Date date, String xsdept);

    //查询当周订单数
    int getWeekNumByDept(Date date, String xsdept);
    //查询当月订单数
    int getMothNumByDept(Date date, String xsdept);

    //查询当天订单金额
    double  getTodayAmount(Date date, String xsdept);

    //查询当周订单金额
    double getWeekAmount(Date date, String xsdept);
    //查询当月订单金额
    double getMothAmount(Date date, String xsdept);

    //查询当天升级单数
    int getTodaySjByDept(Date date, String xsdept);
    //查询当月升级单数
    int getMonthSjByDept(Date date, String dept);
    //查询当天升级单金额
    double getTodaySjAmount(Date date, String dept);
    //查询当月升级单金额
    double getMonthTodaySjAmount(Date date, String dept);

}