package com.juzishu727.service;

import com.juzishu727.bean.Module;

import java.util.List;

public interface ModuleService {

    List<Module> selectList(Module module);


    List<Module> selectAll();

    Integer getTotal();

    Module selectById(Integer id);

    Module selectByFatherEqNull();

    List<Module> selectByFather(Module module);

    void addModule(Module module);

    void updateModule(Module module);

    void deleteModule(Integer id);

}
