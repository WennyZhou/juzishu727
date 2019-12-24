package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class ModuleCorrelation extends Page {

    private Integer id;

    private String moduleName;

    private String father;

    private String corrClass;

    private String corrForm;

}
