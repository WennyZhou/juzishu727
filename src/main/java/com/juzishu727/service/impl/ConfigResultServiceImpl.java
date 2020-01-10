package com.juzishu727.service.impl;

import com.juzishu727.bean.ConfigResult;
import com.juzishu727.dao.ConfigResultDao;
import com.juzishu727.service.ConfigResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ConfigResultServiceImpl implements ConfigResultService {

    @Autowired
    private ConfigResultDao configResultDao;

    @Override
    public List<ConfigResult> selectList(ConfigResult result) {
        return configResultDao.selectList(result);
    }

    @Override
    public List<ConfigResult> selectAll() {
        return configResultDao.selectAll();
    }

    @Override
    public Integer getTotal() {
        return configResultDao.getTotal();
    }

    @Override
    public ConfigResult selectById(Integer id) {
        return configResultDao.selectById(id);
    }

    @Override
    public ConfigResult selectByFatherEqNull() {
        return configResultDao.selectByFatherEqNull();
    }

    @Override
    public List<ConfigResult> selectByFather(ConfigResult result) {
        return configResultDao.selectByFather(result);
    }

    @Override
    public void addConfigResult(ConfigResult result) {
        configResultDao.addConfigResult(result);
    }

    @Override
    public void updateConfigResult(ConfigResult result) {
        configResultDao.updateConfigResult(result);
    }

    @Override
    public void deleteConfigResult(ConfigResult result) {
        configResultDao.deleteConfigResult(result);
    }
}
