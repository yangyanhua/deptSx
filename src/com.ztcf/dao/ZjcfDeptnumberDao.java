package com.ztcf.dao;

import com.ztcf.entity.ZjcfDeptnumber;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ZjcfDeptnumberDao {



     //查询当天部门人数
     long findDeptNum(@Param(value="SysDate")Date SysDate ,@Param(value="Dept")String Dept);//当天人数

}
