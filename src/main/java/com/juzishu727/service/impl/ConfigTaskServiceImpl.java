package com.juzishu727.service.impl;

import com.juzishu727.bean.ConfigTask;
import com.juzishu727.dao.ConfigTaskDao;
import com.juzishu727.service.ConfigTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ConfigTaskServiceImpl implements ConfigTaskService {

    @Autowired
    private ConfigTaskDao configTaskDao;

    @Override
    public List<ConfigTask> selectList(ConfigTask task) {
        return configTaskDao.selectList(task);
    }

    @Override
    public List<ConfigTask> selectAll() {
        return configTaskDao.selectAll();
    }

    @Override
    public Integer getTotal() {
        return configTaskDao.getTotal();
    }

    @Override
    public ConfigTask selectById(Integer id) {
        return configTaskDao.selectById(id);
    }

    @Override
    public void addConfigTask(ConfigTask task) {
        configTaskDao.addConfigTask(task);
    }

    @Override
    public void updateConfigTask(ConfigTask task) {
        configTaskDao.updateConfigTask(task);
    }

    @Override
    public void deleteConfigTask(Integer id) {
        configTaskDao.deleteConfigTask(id);
    }
}
