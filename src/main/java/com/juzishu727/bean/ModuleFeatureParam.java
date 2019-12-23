package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class ModuleFeatureParam extends Page {

    private Integer id;

    private String feaParaName;

    private String feaParaClass;

    private String feaParaLabel;

    private String feaParaDataClass;

    private String feaParaValueClass;

    private String feaParaRange;

    private String feaParaUnit;

    private String moduleLinked;
}
