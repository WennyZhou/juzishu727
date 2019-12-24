package com.juzishu727.service;

import com.juzishu727.bean.ModuleBasicInfo;

import java.util.List;

public interface ModuleBasicInfoService {

    List<ModuleBasicInfo> selectList(ModuleBasicInfo info);

    List<ModuleBasicInfo> selectAll();

    Integer getTotal();

    ModuleBasicInfo selectById(Integer id);

    void addModuleBasicInfo(ModuleBasicInfo info);

    void updateModuleBasicInfo(ModuleBasicInfo info);

    void deleteModuleBasicInfo(Integer id);
}
