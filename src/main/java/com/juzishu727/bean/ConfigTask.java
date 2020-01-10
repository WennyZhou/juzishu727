package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class ConfigTask extends Page {

    private Integer id;

    private String projectCode;

    private String taskName;

    private String taskStatus;

    private String taskType;

    private String taskCode;
}
