package com.ztcf.service;

import com.ztcf.dao.ZjcfYonghuDao;
import com.ztcf.entity.ZjcfYonghu;

import java.util.Date;
import java.util.List;

public interface ZjcfYonghuService {
    //单表查询
    List<ZjcfYonghu> selectYh();

    //带日期参数查询
    List<ZjcfYonghu> servicefindYonghu(Date date);
}
