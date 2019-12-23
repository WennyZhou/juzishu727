package com.juzishu727.service;


import com.juzishu727.bean.ModuleFeatureParam;

import java.util.List;

public interface ModuleFeaParamService {

    List<ModuleFeatureParam> selectList(ModuleFeatureParam param);

    Integer getTotal();

    ModuleFeatureParam selectById(Integer id);

    void addModuleFeaParam(ModuleFeatureParam param);

    void updateModuleFeaParam(ModuleFeatureParam param);

    void deleteModuleFeaParam(Integer id);
}
