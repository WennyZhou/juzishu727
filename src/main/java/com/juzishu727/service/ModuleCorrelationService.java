package com.juzishu727.service;

import com.juzishu727.bean.ModuleCorrelation;

import java.util.List;

public interface ModuleCorrelationService {

    List<ModuleCorrelation> selectList(ModuleCorrelation corr);

    List<ModuleCorrelation> selectAll();

    Integer getTotal();

    ModuleCorrelation selectById(Integer id);

    ModuleCorrelation selectByFatherEqNull();

    List<ModuleCorrelation> selectByFather(ModuleCorrelation corr);

    void addModuleCorrelation(ModuleCorrelation corr);

    void updateModuleCorrelation(ModuleCorrelation corr);

    void deleteModuleCorrelation(Integer id);
}
