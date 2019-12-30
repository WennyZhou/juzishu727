package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class Module extends Page {

    private Integer id;

    private String moduleName;

    private String moduleLabel;

    private String father;

    private String ifVirtual;

    private String ifKey;

    private String ifStandard;
}
