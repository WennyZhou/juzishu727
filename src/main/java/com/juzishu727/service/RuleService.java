package com.juzishu727.service;

import com.juzishu727.bean.Rule;

import java.util.List;

public interface RuleService {
    List<Rule> selectList(Rule rule);

    Integer getTotal();

    List<Rule> selectAll(Rule rule);

    Rule selectById(Integer id);

    void addRule(Rule rule);

    void updateRule(Rule rule);

    void deleteRule(Integer id);
}
