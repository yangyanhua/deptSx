package test;

import com.ztcf.dao.ZjcfWorkflowNewDao;
import com.ztcf.entity.ZjcfDeptnumber;
import com.ztcf.entity.ZjcfWorkflowNew;
import com.ztcf.entity.ZjcfYonghu;
import com.ztcf.service.ZjcfDeptnumberService;
import com.ztcf.service.ZjcfWorkflowNewService;
import com.ztcf.service.ZjcfYonghuService;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RunWith(SpringJUnit4ClassRunner.class) // 指定spring 整合junit测试的一个类对象
@ContextConfiguration("classpath:applicationContext.xml") // 指定工厂配置文件的位置
public class Testzt extends TestCase{

        @Autowired
        private ZjcfWorkflowNewService zjcfWorkflowNewService;
         @Autowired
         private ZjcfWorkflowNewDao zjcfWorkflowNewDao;
        @Autowired
        private SqlSessionFactory sqlSessionFactory;
        @Autowired
        private ZjcfYonghuService zjcfYonghuService;
        @Autowired
        private ZjcfDeptnumberService zjcfDeptnumberService;

        //测试连接,以及workflownew
        @Test
        public void testSeqsession(){
          //  SqlSession seq = sqlSessionFactory.openSession();
            //System.out.println(seq);
           // Date date = new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = sdf.parse("2018-07-30");
            } catch (ParseException e) {
                e.printStackTrace();
            }

            int list = zjcfWorkflowNewService.getTodayNumByDept(date,"市场七部一处");
            System.out.println("date+++++++:"+list);
           //List list = zjcfWorkflowNewService.servicefindsjj(date);
         //  System.out.println(list);


        }

        //测试yonghu
    @Test
    public void testYonghu(){

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2018-07-30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<ZjcfYonghu> list = zjcfYonghuService.servicefindYonghu(date);
        System.out.println(list);

    }
     //测试deptnumber
    @Test
     public void testdeptNumber(){

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //String date = sdf.format("2018-08-10");
        Date date1=null;
        try {
            date1=sdf.parse("2018-08-10");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //List<ZjcfDeptnumber> list = zjcfDeptnumberService.serviceFindnum();
       // System.out.println(list);

    }
    @Test
    public void testSj(){
       // List list = zjcfWorkflowNewService.servicefindsj();
      //  System.out.println(list);


    /*   float num= (float)2/3;
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
         String s = df.format(num);//返回的是String类型
       System.out.println("ssssss"+df);
*/

       //这里的数后面加“D”是表明它是Double类型，否则相除的话取整，无法正常使用
       double percent = 50.5D / 150D;

        //输出一下，确认你的小数无误
        System.out.println("小数：" + percent);

        //获取格式化对象
        NumberFormat nt = NumberFormat.getPercentInstance();

        //设置百分数精确度2即保留两位小数
        nt.setMinimumFractionDigits(2);

        //最后格式化并输出
        System.out.println("百分数：" + nt.format(percent));



}

        @Test
    public void testSelected(){
           // kh.getIsExistsWeChat()==1?"selected":""
         /*   int a=1;
            int b=2;
            String s1 = a == 1 ? "selected" : "";
            String s2 = b == 1 ? "selected" : "";
            System.out.println("s1:"+s1+"--------"+"s2:"+s2);*/
         //时区测试
            Calendar cal = Calendar.getInstance();
            TimeZone timeZone = cal.getTimeZone();
            System.out.println(timeZone.getID());
            System.out.println(timeZone.getDisplayName());




        }

}


