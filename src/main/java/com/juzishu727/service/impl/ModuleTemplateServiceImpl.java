package com.juzishu727.service.impl;

import com.juzishu727.bean.Module;
import com.juzishu727.dao.ModuleTemplateDao;
import com.juzishu727.service.ModuleTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModuleTemplateServiceImpl implements ModuleTemplateService {

    @Autowired
    private ModuleTemplateDao moduleTemplateDao;

    @Override
    public List<Module> selectList(Module module) {
        return moduleTemplateDao.selectList(module);
    }

    @Override
    public List<Module> selectAll() {
        return moduleTemplateDao.selectAll();
    }

    @Override
    public Integer getTotal() {
        return moduleTemplateDao.getTotal();
    }

    @Override
    public Module selectById(Integer id) {
        return moduleTemplateDao.selectById(id);
    }

    @Override
    public Module selectByFatherEqNull(Module module) {
        return moduleTemplateDao.selectByFatherEqNull(module);
    }

    @Override
    public List<Module> selectByFather(Module module) {
        return moduleTemplateDao.selectByFather(module);
    }

    @Override
    public void addModule(Module module) {
        moduleTemplateDao.addModule(module);
    }

    @Override
    public void updateModule(Module module) {
        moduleTemplateDao.updateModule(module);
    }

    @Override
    public void deleteModule(Integer id) {
        moduleTemplateDao.deleteModule(id);
    }
}
