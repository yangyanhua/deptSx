package com.ztcf.service;

import com.ztcf.dao.ZjcfDeptnumberDao;
import com.ztcf.entity.ZjcfDeptnumber;

import java.util.Date;
import java.util.List;

public interface ZjcfDeptnumberService {



//查询当天部门人数
    public Long getDeptNumber(Date date, String xsDept);

}
