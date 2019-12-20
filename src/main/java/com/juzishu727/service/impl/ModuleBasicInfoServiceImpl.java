package com.juzishu727.service.impl;

import com.juzishu727.bean.ModuleBasicInfo;
import com.juzishu727.dao.ModuleBasicInfoDao;
import com.juzishu727.service.ModuleBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModuleBasicInfoServiceImpl implements ModuleBasicInfoService {

    @Autowired
    private ModuleBasicInfoDao moduleBasicInfoDao;

    @Override
    public List<ModuleBasicInfo> selectList(ModuleBasicInfo info) {
        return moduleBasicInfoDao.selectList(info);
    }

    @Override
    public Integer getTotal() {
        return moduleBasicInfoDao.getTotal();
    }

    @Override
    public ModuleBasicInfo selectById(Integer id) {
        return moduleBasicInfoDao.selectById(id);
    }

    @Override
    public void addModuleBasicInfo(ModuleBasicInfo info) {
        moduleBasicInfoDao.addModuleBasicInfo(info);
    }

    @Override
    public void updateModuleBasicInfo(ModuleBasicInfo info) {
        moduleBasicInfoDao.updateModuleBasicInfo(info);
    }

    @Override
    public void deleteModuleBasicInfo(Integer id) {
        moduleBasicInfoDao.deleteModuleBasicInfo(id);
    }
}
