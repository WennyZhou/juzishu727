package com.juzishu727.service.impl;

import com.juzishu727.bean.BasicInfo;
import com.juzishu727.dao.BasicInfoDao;
import com.juzishu727.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BasicInfoServiceImpl implements BasicInfoService {

    @Autowired
    private BasicInfoDao basicInfoDao;

    @Override
    public List<BasicInfo> selectList(BasicInfo info) {
        return basicInfoDao.selectList(info);
    }

    @Override
    public List<BasicInfo> selectAll() {
        return basicInfoDao.selectAll();
    }

    @Override
    public Integer getTotal() {
        return basicInfoDao.getTotal();
    }

    @Override
    public BasicInfo selectById(Integer id) {
        return basicInfoDao.selectById(id);
    }

    @Override
    public void addBasicInfo(BasicInfo info) {
        basicInfoDao.addBasicInfo(info);
    }

    @Override
    public void updateBasicInfo(BasicInfo info) {
        basicInfoDao.updateBasicInfo(info);
    }

    @Override
    public void deleteBasicInfo(Integer id) {
        basicInfoDao.deleteBasicInfo(id);
    }
}
