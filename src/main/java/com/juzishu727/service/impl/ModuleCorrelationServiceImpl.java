package com.juzishu727.service.impl;

import com.juzishu727.bean.ModuleCorrelation;
import com.juzishu727.dao.ModuleCorrelationDao;
import com.juzishu727.service.ModuleCorrelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModuleCorrelationServiceImpl implements ModuleCorrelationService {

    @Autowired
    private ModuleCorrelationDao moduleCorrelationDao;

    @Override
    public List<ModuleCorrelation> selectList(ModuleCorrelation corr) {
        return moduleCorrelationDao.selectList(corr);
    }

    @Override
    public List<ModuleCorrelation> selectAll() {
        return moduleCorrelationDao.selectAll();
    }

    @Override
    public Integer getTotal() {
        return moduleCorrelationDao.getTotal();
    }

    @Override
    public ModuleCorrelation selectById(Integer id) {
        return moduleCorrelationDao.selectById(id);
    }

    @Override
    public ModuleCorrelation selectByFatherEqNull() {
        return moduleCorrelationDao.selectByFatherEqNull();
    }

    @Override
    public List<ModuleCorrelation> selectByFather(ModuleCorrelation corr) {
        return moduleCorrelationDao.selectByFather(corr);
    }

    @Override
    public void addModuleCorrelation(ModuleCorrelation corr) {
        moduleCorrelationDao.addModuleCorrelation(corr);
    }

    @Override
    public void updateModuleCorrelation(ModuleCorrelation corr) {
        moduleCorrelationDao.updateModuleCorrelation(corr);
    }

    @Override
    public void deleteModuleCorrelation(Integer id) {
        moduleCorrelationDao.deleteModuleCorrelation(id);
    }
}
