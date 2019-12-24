package com.juzishu727.dao;

import com.juzishu727.bean.ModuleConstraint;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleConstraintDao {

    List<ModuleConstraint> selectList(ModuleConstraint constr);

    List<ModuleConstraint> selectAll();

    Integer getTotal();

    ModuleConstraint selectById(Integer id);

    void addModuleConstraint(ModuleConstraint constr);

    void updateModuleConstraint(ModuleConstraint constr);

    void deleteModuleConstraint(Integer id);

}
