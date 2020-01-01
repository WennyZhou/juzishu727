package com.juzishu727.dao;

import com.juzishu727.bean.Rule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuleDao {

    List<Rule> selectList(Rule rule);

    Integer getTotal();

    Rule selectById(Integer id);

    void addRule(Rule rule);

    void updateRule(Rule rule);

    void deleteRule(Integer id);

}
