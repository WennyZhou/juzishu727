package com.juzishu727.service;

import com.juzishu727.bean.ModuleConstraint;

import java.util.List;

public interface ModuleConstraintService {
    List<ModuleConstraint> selectList(ModuleConstraint constr);

    List<ModuleConstraint> selectAll();

    Integer getTotal();

    ModuleConstraint selectById(Integer id);

    void addModuleConstraint(ModuleConstraint constr);

    void updateModuleConstraint(ModuleConstraint constr);

    void deleteModuleConstraint(Integer id);
}
