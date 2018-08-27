package com.ztcf.service;
import com.ztcf.dao.ZjcfYonghuDao;
import com.ztcf.entity.ZjcfYonghu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ZjcfYonghuServiceImpl implements ZjcfYonghuService {
    @Autowired
   private ZjcfYonghuDao zjcfYonghuDao;
    //查询yonghu部门领导信息


    @Override
    public List<ZjcfYonghu> selectYh() {
        return zjcfYonghuDao.selectYh();
    }

    @Override
    public List<ZjcfYonghu> servicefindYonghu(Date date) {
        return zjcfYonghuDao.selectYHandNumm(date);
    }


}
