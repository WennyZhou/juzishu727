package com.juzishu727.service.impl;

import com.juzishu727.bean.Module;
import com.juzishu727.dao.ModuleDao;
import com.juzishu727.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleDao moduleDao;

    @Override
    public List<Module> selectList(Module module) {
        return moduleDao.selectList(module);
    }

    @Override
    public List<Module> selectAll() {
        return moduleDao.selectAll();
    }

    @Override
    public Integer getTotal() {
        return moduleDao.getTotal();
    }

    @Override
    public Module selectById(Integer id) {
        return moduleDao.selectById(id);
    }

    @Override
    public Module selectByFatherEqNull() {
        return moduleDao.selectByFatherEqNull();
    }

    @Override
    public List<Module> selectByFather(Module module) {
        return moduleDao.selectByFather(module);
    }

    @Override
    public void addModule(Module module) {
        moduleDao.addModule(module);
    }

    @Override
    public void updateModule(Module module) {
        moduleDao.updateModule(module);
    }

    @Override
    public void deleteModule(Integer id) {
        moduleDao.deleteModule(id);
    }
}
