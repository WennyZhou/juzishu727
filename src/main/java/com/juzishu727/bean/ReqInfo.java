package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

/**
 * 客户需求类
 */

@Data
public class ReqInfo extends Page {
    private Integer id;

    private String requirementName;

    private String requirementValue;

}
