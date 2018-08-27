package com.ztcf.controller;

import com.ztcf.entity.ZjcfYonghu;
import com.ztcf.service.ZjcfDeptnumberService;
import com.ztcf.service.ZjcfWorkflowNewService;
import com.ztcf.service.ZjcfYonghuService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
//@Controller
@RequestMapping("/deptinfo")
public class ExportController {
    @Autowired
    private ZjcfWorkflowNewService zjcfWorkflowNewservice;
    @Autowired
    private ZjcfYonghuService zjcfYonghuService;
    @Autowired
    private ZjcfDeptnumberService zjcfDeptnumberService;

    //封装多个查询结果
    @RequestMapping("/findlist.do")
    public List findlist(HttpSession session, String datestr) throws ParseException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // date=new Date();
        // String date1 = sdf.format("2018-08-05");
       //date = sdf.parse("2018-07-24");

        if (datestr == null) {
            datestr = "2018-07-24";
        }
      //  Date sysdate = date;
        Date date=sdf.parse(datestr);

        session.setAttribute("sysdate", date);
        // 查询yonghu表信息以及人数 关联查询两张表
        //利用ZjcfYonghu实体对象属性方式封装其他查询结果，全部封装为一个list集合方便数据展示
        List<ZjcfYonghu> deptList = zjcfYonghuService.servicefindYonghu(date);

        System.out.println("deptList:" + deptList);

        for (int i = 0; i < deptList.size(); i++) {
          //查询部门人数
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
            deptList.get(i).setSjrate(sjrate);


        }
                session.setAttribute("deptList", deptList);




       // response.sendRedirect("/datagrid1.jsp");



                return deptList ;

            }
    @RequestMapping("/export.do")
       public  void export(HttpSession session,String content,String fields, HttpServletResponse response, String datestr) throws ParseException, IOException {
         /*  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           // date=new Date();
           if (date1 == null) {
               date1 = sdf.format("2018-07-24");
           }
*/

       //导出Excel
        HSSFWorkbook work = new HSSFWorkbook();
        //创建工作excel库
        HSSFSheet usersheet = work.createSheet("部门销售表");

        //建立标题行
        HSSFRow titleRow = usersheet.createRow(0);
        //拆分数组以逗号的形式才分
        String[] split = content.split(",");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            //创建标题 有几个属性就创建几个
            HSSFCell cell = titleRow.createCell(i);
            cell.setCellValue(s);
        }
        //创建数据行
        //查询数据库所有的用户信息
      List<ZjcfYonghu>  list=findlist(session,datestr);

        //以逗号形式拆分fields属性名
        String[] strings = fields.split(",");

        for (int i = 1; i <=list.size(); i++) {
            //创建数据行
            HSSFRow datarow = usersheet.createRow(i);

            for (int j = 0; j < strings.length; j++) {
                //创建单元格
                HSSFCell cell = datarow.createCell(j);
                //通过拼凑方法名,调用反射的形式获取属性值
                String Myname = "get"+strings[j].substring(0,1).toUpperCase()+strings[j].substring(1);
                //方法名已经拿到,在拿方法对象

                try {
                   //反射获得方法对象
                    Method declaredMethod = ZjcfYonghu.class.getDeclaredMethod(Myname, null);
                  // int com.ztcf.entity.ZjcfYonghu.getWeekOrderNum()
                    System.out.println("这是declaredMethod"+declaredMethod);

                    System.out.println("这是list|i-1:"+list.get(i-1)+"这是次数："+i);
                    //拿到属性值结果
                    Object result = declaredMethod.invoke(list.get(i-1));

                    System.out.println("这是declaredMethod.invoke（index）的result："+result+"这是次数："+i);
                    //判断返回值的类型
                    if(result instanceof Date){
                        //设置宽度
                        usersheet.setColumnWidth(j,40*256);
                        //设置日期格式
                        DataFormat dataFormat = work.createDataFormat();
                        short format = dataFormat.getFormat("yyyy年MM月dd日");

                        CellStyle cellStyle = work.createCellStyle();
                        //居中
                        cellStyle.setAlignment(HorizontalAlignment.CENTER);
                        cellStyle.setDataFormat(format);
                        cell.setCellStyle(cellStyle);
                        //设置内容  如果是时间内容就强转
                        cell.setCellValue((Date)result);
                    }else {
                        cell.setCellValue(result.toString());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }

            }

        }
        //设置响应头
        response.setContentType("application/vnd.ms-excel");
        String fileName="部门销售统计表.xls";
        //当前行为方式   告诉浏览器是下载 还是 打开新窗口临时加载
        response.setHeader("content-disposition","attachment;fileName="+new String(fileName.getBytes("utf-8"),"iso-8859-1"));

        //写出excle
        try {
            work.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }



       }
     }


  


