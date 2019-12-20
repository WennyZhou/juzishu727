package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class ModuleConfParam extends Page {

    private Integer id;

    private String confParaName;

    private String confParaClass;

    private String confParaLabel;

    private String confParaUnit;

    private String moduleLinked;
}
