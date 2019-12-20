package com.juzishu727.dao;

import com.juzishu727.bean.ModuleConfParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleConfParamDao {

    List<ModuleConfParam> selectList(ModuleConfParam param);

    Integer getTotal();

    ModuleConfParam selectById(Integer id);

    void addModuleConfParam(ModuleConfParam param);

    void updateModuleConfParam(ModuleConfParam param);

    void deleteModuleConfParam(Integer id);

}
