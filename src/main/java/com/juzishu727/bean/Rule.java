package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class Rule extends Page {

    private Integer id;

    private String ruleLabel;

    private String moduleLink;

    private String startChar;

    private String paraName;

    private String comparator;

    private String paraValue;

    private String logSymbol;

    private String linkRule;

    private String result;
}
