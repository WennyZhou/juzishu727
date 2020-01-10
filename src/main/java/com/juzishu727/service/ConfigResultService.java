package com.juzishu727.service;

import com.juzishu727.bean.ConfigResult;

import java.util.List;

public interface ConfigResultService {

    List<ConfigResult> selectList(ConfigResult result);

    List<ConfigResult> selectAll();

    Integer getTotal();

    ConfigResult selectById(Integer id);

    ConfigResult selectByFatherEqNull();

    List<ConfigResult> selectByFather(ConfigResult result);

    void addConfigResult(ConfigResult result);

    void updateConfigResult(ConfigResult result);

    void deleteConfigResult(ConfigResult result);
}
