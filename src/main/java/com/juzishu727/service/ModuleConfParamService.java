package com.juzishu727.service;


import com.juzishu727.bean.ModuleConfParam;

import java.util.List;

public interface ModuleConfParamService {

    List<ModuleConfParam> selectList(ModuleConfParam param);

    Integer getTotal();

    ModuleConfParam selectById(Integer id);

    void addModuleConfParam(ModuleConfParam param);

    void updateModuleConfParam(ModuleConfParam param);

    void deleteModuleConfParam(Integer id);
}
