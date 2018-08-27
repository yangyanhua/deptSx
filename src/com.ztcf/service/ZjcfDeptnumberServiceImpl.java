package com.ztcf.service;

import com.ztcf.dao.ZjcfDeptnumberDao;
import com.ztcf.entity.ZjcfDeptnumber;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
//查询部门人数
@Service
public class ZjcfDeptnumberServiceImpl implements ZjcfDeptnumberService {
    @Autowired
    private ZjcfDeptnumberDao zjcfDeptnumberDao;



    @Override
    public Long getDeptNumber(Date date, String Dept) {
        return zjcfDeptnumberDao.findDeptNum(date,Dept);
    }

}
