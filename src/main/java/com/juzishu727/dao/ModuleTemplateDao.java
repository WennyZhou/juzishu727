package com.juzishu727.dao;

import com.juzishu727.bean.Module;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleTemplateDao {

    List<Module> selectList(Module module);


    List<Module> selectAll();

    Integer getTotal();

    Module selectById(Integer id);

    Module selectByFatherEqNull(Module module);

    List<Module> selectByFather(Module module);

    void addModule(Module module);

    void updateModule(Module module);

    void deleteModule(Integer id);

}
