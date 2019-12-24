package com.juzishu727.dao;

import com.juzishu727.bean.ModuleFeatureParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleFeaParamDao {

    List<ModuleFeatureParam> selectList(ModuleFeatureParam param);

    List<ModuleFeatureParam> selectAll();

    Integer getTotal();

    ModuleFeatureParam selectById(Integer id);

    void addModuleFeaParam(ModuleFeatureParam param);

    void updateModuleFeaParam(ModuleFeatureParam param);

    void deleteModuleFeaParam(Integer id);

}
