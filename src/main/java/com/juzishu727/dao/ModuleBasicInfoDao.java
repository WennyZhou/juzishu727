package com.juzishu727.dao;

import com.juzishu727.bean.ModuleBasicInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleBasicInfoDao {

    List<ModuleBasicInfo> selectList(ModuleBasicInfo info);

    Integer getTotal();

    ModuleBasicInfo selectById(Integer id);

    void addModuleBasicInfo(ModuleBasicInfo info);

    void updateModuleBasicInfo(ModuleBasicInfo info);

    void deleteModuleBasicInfo(Integer id);

}
