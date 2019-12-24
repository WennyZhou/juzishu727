package com.juzishu727.dao;

import com.juzishu727.bean.ModuleCorrelation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleCorrelationDao {

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
