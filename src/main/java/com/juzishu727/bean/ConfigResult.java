package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class ConfigResult extends Page {

    private Integer id;

    private String instanceName;

    private String instanceLabel;

    private String father;

}
