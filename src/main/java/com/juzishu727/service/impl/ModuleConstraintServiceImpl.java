package com.juzishu727.service.impl;

import com.juzishu727.bean.ModuleConstraint;
import com.juzishu727.dao.ModuleConstraintDao;
import com.juzishu727.service.ModuleConstraintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ModuleConstraintServiceImpl implements ModuleConstraintService {

    @Autowired
    private ModuleConstraintDao moduleConstraintDao;

    @Override
    public List<ModuleConstraint> selectList(ModuleConstraint constr) {
        return moduleConstraintDao.selectList(constr);
    }

    @Override
    public List<ModuleConstraint> selectAll() {
        return moduleConstraintDao.selectAll();
    }

    @Override
    public Integer getTotal() {
        return moduleConstraintDao.getTotal();
    }

    @Override
    public ModuleConstraint selectById(Integer id) {
        return moduleConstraintDao.selectById(id);
    }

    @Override
    public void addModuleConstraint(ModuleConstraint constr) {
        moduleConstraintDao.addModuleConstraint(constr);
    }

    @Override
    public void updateModuleConstraint(ModuleConstraint constr) {
        moduleConstraintDao.updateModuleConstraint(constr);
    }

    @Override
    public void deleteModuleConstraint(Integer id) {
        moduleConstraintDao.deleteModuleConstraint(id);
    }
}
