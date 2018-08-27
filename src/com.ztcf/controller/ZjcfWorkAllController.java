package com.ztcf.controller;

import com.ztcf.entity.Model;
import com.ztcf.entity.Model2;
import com.ztcf.entity.ZjcfYonghu;
import com.ztcf.service.ZjcfDeptnumberService;
import com.ztcf.service.ZjcfWorkflowNewService;
import com.ztcf.service.ZjcfYonghuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

//@RestController
@Controller
@RequestMapping("/deptinfo")
public class ZjcfWorkAllController {
    @Autowired
    private ZjcfWorkflowNewService zjcfWorkflowNewservice;
    @Autowired
    private ZjcfYonghuService zjcfYonghuService;
    @Autowired
    private ZjcfDeptnumberService zjcfDeptnumberService;

    //封装多个查询结果
    @RequestMapping("/findAll.do")
    public String findAll(HttpSession session, String datestr,HttpServletResponse response) throws ParseException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     //   Date sysdate=new Date();
      //   String dates = sdf.format(sysdate);
      //  Date date = sdf.parse("2018-07-24");

        if (datestr == null) {
            datestr ="2018-07-24";//设置查询默认时间为"2018-07-24"
        }
      //  Date sysdate = date;
        Date date=sdf.parse(datestr);

        session.setAttribute("sysdate", date);
         /*查询yonghu表信息以及人数 关联查询两张表
        List<ZjcfYonghu> deptList = zjcfYonghuService.servicefindYonghu(date);//关联查询获取人数*/
        //利用ZjcfYonghu实体对象属性方式封装其他查询结果，全部封装为一个list集合方便数据展示
        List<ZjcfYonghu> deptList = zjcfYonghuService.selectYh();//人数作为属性获取
        System.out.println("deptList:" + deptList);

        for (int i = 0; i < deptList.size(); i++) {
            //赋值获取部门人数

            long deptNum=zjcfDeptnumberService.getDeptNumber(date, deptList.get(i).getDept());
            deptList.get(i).setDeptNum(deptNum);

            //赋值当天订单数
            int nTodayNum = zjcfWorkflowNewservice.getTodayNumByDept(date, deptList.get(i).getDept());
            deptList.get(i).setTodayOrderNum(nTodayNum);

            //赋值当周订单数
            int weekNum = zjcfWorkflowNewservice.getWeekNumByDept(date, deptList.get(i).getDept());
            deptList.get(i).setWeekOrderNum(weekNum);

            //当月订单数
            int mothNum = zjcfWorkflowNewservice.getMothNumByDept(date, deptList.get(i).getDept());
            deptList.get(i).setMonthOrderNum(mothNum);

            //当日订单金额
            double todayAmount = zjcfWorkflowNewservice.getTodayAmount(date, deptList.get(i).getDept());
            deptList.get(i).setTodayAmount(todayAmount);

            //当周订单金额
            double weekAmount = zjcfWorkflowNewservice.getWeekAmount(date, deptList.get(i).getDept());
            deptList.get(i).setWeekAmount(weekAmount);

            //当月订单金额
            double mothAmount = zjcfWorkflowNewservice.getMothAmount(date, deptList.get(i).getDept());
            deptList.get(i).setMothAmount(mothAmount);

            //计算周奖 根据当周订单数
            double weekBonus = 0;
            if (weekNum < 3) {
                weekBonus = 0;
                deptList.get(i).setWeekBonus(weekBonus);

            }
            if (weekNum > 3 && weekNum < 5) {

                weekBonus = 100;
                deptList.get(i).setWeekBonus(weekBonus);

            }

            if (weekNum >= 5 && weekNum < 8) {

                weekBonus = 300;
                deptList.get(i).setWeekBonus(weekBonus);

            }
            if (weekNum >= 8 && weekNum < 10) {
                weekBonus = 500;
                deptList.get(i).setWeekBonus(weekBonus);
                // weekBonus.add(500);

            }
            if (weekNum >= 10) {
                weekBonus = 800;
                deptList.get(i).setWeekBonus(weekBonus);
            }
    //IF(F7<3,0,IF(F7<5,100,IF(F7<8,300,IF(F7<10,500,800))))
            //计算主管奖金
            double mothBonus = 0;

            if (mothNum < 10) {
                mothBonus = 0;
                deptList.get(i).setMonthBonuss(mothBonus);
            }
            if (mothNum >= 10 && mothNum < 15) {
                mothBonus = 200;
                deptList.get(i).setMonthBonuss(mothBonus);

            }

            if (mothNum >= 15 && mothNum < 20) {
                mothBonus = 400;
                deptList.get(i).setMonthBonuss(mothBonus);
            }
            if (mothNum >= 20 && mothNum < 25) {
                mothBonus = 600;
                deptList.get(i).setMonthBonuss(mothBonus);

            }
            if (mothNum >= 25 && mothNum < 30) {
                mothBonus = 800;
                deptList.get(i).setMonthBonuss(mothBonus);

            }
            if (mothNum >= 30 && mothNum < 35) {
                mothBonus = 1000;
                deptList.get(i).setMonthBonuss(mothBonus);

            }

            if (mothNum >= 35 && mothNum < 40) {
                mothBonus = 1200;
                deptList.get(i).setMonthBonuss(mothBonus);

            }
            if (mothNum >= 40 && mothNum < 45) {
                mothBonus = 1500;
                deptList.get(i).setMonthBonuss(mothBonus);

            }
            if (mothNum >= 45 && mothNum < 50) {
                mothBonus = 1700;
                deptList.get(i).setMonthBonuss(mothBonus);

            }

            if (mothNum >= 50) {
                mothBonus = 2000;
                deptList.get(i).setMonthBonuss(mothBonus);
            }
//IF(G7<10,0,IF(G7<15,200,IF(G7<20,400,IF(G7<25,600,IF(G7<30,800,IF(G7<35,1000,
// IF(G7<40,1200,IF(G7<45,1500,IF(G7<50,1700,2000)))))))))
            //计算升级单
            //当日升级单数
            int todaysj=zjcfWorkflowNewservice.getTodaySjByDept(date, deptList.get(i).getDept());
            deptList.get(i).setTodayOrdersj(todaysj);

            //当月升级单数
            int monthsj=zjcfWorkflowNewservice.getMonthSjByDept(date, deptList.get(i).getDept());
            deptList.get(i).setMonthOrdersj(monthsj);

            //当日升级单金额
            double todaySjAmount=zjcfWorkflowNewservice.getTodaySjAmount(date, deptList.get(i).getDept());
            deptList.get(i).setTodaySjAmount(todaySjAmount);
            //当月升级单金额
            double monthSjAmount=zjcfWorkflowNewservice.getMonthTodaySjAmount(date, deptList.get(i).getDept());
            deptList.get(i).setMothSjAmount(monthSjAmount);

            //月金额汇总
           double monthSum=monthSjAmount+mothAmount;
            deptList.get(i).setMonthSum(monthSum);

            //升级率
            double percent =(double)monthsj /(double) mothNum;

            System.out.println("percent:" + percent);

            //获取格式化对象
            NumberFormat nt = NumberFormat.getPercentInstance();
            //设置百分数精确度2即保留两位小数
            nt.setMinimumFractionDigits(2);
            String sjrate =nt.format(percent);
            if((double)mothNum==0){
                sjrate="error";
            }
            deptList.get(i).setSjrate(sjrate);


        }
                session.setAttribute("deptList", deptList);




       // response.sendRedirect("/datagrid1.jsp");



                return "datagrid1" ;

            }

     }


  


