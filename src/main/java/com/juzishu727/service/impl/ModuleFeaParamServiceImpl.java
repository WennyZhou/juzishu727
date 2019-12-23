package com.juzishu727.service.impl;

import com.juzishu727.bean.ModuleFeatureParam;
import com.juzishu727.dao.ModuleFeaParamDao;
import com.juzishu727.service.ModuleFeaParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModuleFeaParamServiceImpl implements ModuleFeaParamService {

    @Autowired
    private ModuleFeaParamDao moduleFeaParamDao;

    @Override
    public List<ModuleFeatureParam> selectList(ModuleFeatureParam param) {
        return moduleFeaParamDao.selectList(param);
    }

    @Override
    public Integer getTotal() {
        return moduleFeaParamDao.getTotal();
    }

    @Override
    public ModuleFeatureParam selectById(Integer id) {
        return moduleFeaParamDao.selectById(id);
    }

    @Override
    public void addModuleFeaParam(ModuleFeatureParam param) {
        moduleFeaParamDao.addModuleFeaParam(param);
    }

    @Override
    public void updateModuleFeaParam(ModuleFeatureParam param) {
        moduleFeaParamDao.updateModuleFeaParam(param);
    }

    @Override
    public void deleteModuleFeaParam(Integer id) {
        moduleFeaParamDao.deleteModuleFeaParam(id);
    }
}
