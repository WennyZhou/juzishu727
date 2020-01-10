package com.juzishu727.service;

import com.juzishu727.bean.ConfigTask;

import java.util.List;

public interface ConfigTaskService {

    List<ConfigTask> selectList(ConfigTask task);

    List<ConfigTask> selectAll();

    Integer getTotal();

    ConfigTask selectById(Integer id);

    void addConfigTask(ConfigTask task);

    void updateConfigTask(ConfigTask task);

    void deleteConfigTask(Integer id);
}
