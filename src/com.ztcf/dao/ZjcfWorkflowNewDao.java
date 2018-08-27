package com.ztcf.dao;

import com.ztcf.entity. ZjcfWorkflowNew;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ZjcfWorkflowNewDao {

    //查询销售周期内订单数
    int  findtime11(@Param(value="date")Date date ,@Param(value="xs_dept")String xs_dept);//当天
    int findtime22( @Param(value="date")Date date ,@Param(value="xs_dept")String xs_dept);//当周
    int findtime33( @Param(value="date")Date date ,@Param(value="xs_dept" )String xs_dept);//当月
    //查询销售周期内订单金额
    double findTodayAmout(@Param(value="date")Date date ,@Param(value="xs_dept" )String xs_dept);//当天订单金额
    double findWeekAmout(@Param(value="date")Date date ,@Param(value="xs_dept" )String xs_dept);//当周金额
    double findMonthAmout(@Param(value="date")Date date ,@Param(value="xs_dept" )String xs_dept);//当月金额
    //查询升级单数
    int findTodaySj(@Param(value="date")Date date ,@Param(value="xs_dept")String xs_dept);//当天升级单数
    int findMonthSj(@Param(value="date")Date date ,@Param(value="xs_dept")String xs_dept);//当月升级单数

    //查询升级金额
    double findTodaySjAmount(@Param(value="date")Date date ,@Param(value="xs_dept")String xs_dept);//当天
    double findMonthSjAmount(@Param(value="date")Date date ,@Param(value="xs_dept")String xs_dept);//当月

}
