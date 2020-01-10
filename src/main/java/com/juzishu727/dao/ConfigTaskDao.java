package com.juzishu727.dao;

import com.juzishu727.bean.ConfigTask;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfigTaskDao {

    List<ConfigTask> selectList(ConfigTask task);

    List<ConfigTask> selectAll();

    Integer getTotal();

    ConfigTask selectById(Integer id);

    void addConfigTask(ConfigTask task);

    void updateConfigTask(ConfigTask task);

    void deleteConfigTask(Integer id);

}
