package com.juzishu727.dao;

import com.juzishu727.bean.ConfigResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfigResultDao {

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
