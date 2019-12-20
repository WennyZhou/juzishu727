package com.juzishu727.service.impl;

import com.juzishu727.bean.ModuleConfParam;
import com.juzishu727.dao.ModuleConfParamDao;
import com.juzishu727.service.ModuleConfParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModuleConfParamServiceImpl implements ModuleConfParamService {

    @Autowired
    private ModuleConfParamDao moduleConfParamDao;

    @Override
    public List<ModuleConfParam> selectList(ModuleConfParam param) {
        return moduleConfParamDao.selectList(param);
    }

    @Override
    public Integer getTotal() {
        return moduleConfParamDao.getTotal();
    }

    @Override
    public ModuleConfParam selectById(Integer id) {
        return moduleConfParamDao.selectById(id);
    }

    @Override
    public void addModuleConfParam(ModuleConfParam param) {
        moduleConfParamDao.addModuleConfParam(param);
    }

    @Override
    public void updateModuleConfParam(ModuleConfParam param) {
        moduleConfParamDao.updateModuleConfParam(param);
    }

    @Override
    public void deleteModuleConfParam(Integer id) {
        moduleConfParamDao.deleteModuleConfParam(id);
    }
}
