package com.juzishu727.service.impl;

import com.juzishu727.bean.Rule;
import com.juzishu727.dao.RuleDao;
import com.juzishu727.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RuleServiceImpl implements RuleService {

    @Autowired
    private RuleDao ruleDao;

    @Override
    public List<Rule> selectList(Rule rule) {
        return ruleDao.selectList(rule);
    }

    @Override
    public Integer getTotal() {
        return ruleDao.getTotal();
    }

    @Override
    public Rule selectById(Integer id) {
        return ruleDao.selectById(id);
    }

    @Override
    public void addRule(Rule rule) {
        ruleDao.addRule(rule);
    }

    @Override
    public void updateRule(Rule rule) {
        ruleDao.updateRule(rule);
    }

    @Override
    public void deleteRule(Integer id) {
        ruleDao.deleteRule(id);
    }
}
