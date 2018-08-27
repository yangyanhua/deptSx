package com.ztcf.dao;

import com.ztcf.entity.ZjcfYonghu;

import java.util.Date;
import java.util.List;

public interface ZjcfYonghuDao {

//查询zjcfyonghu 部门经理

   List<ZjcfYonghu> selectYh();

   List<ZjcfYonghu> selectYHandNumm(Date date);
}
