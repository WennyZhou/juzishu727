package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class ModuleBasicInfo extends Page{

    private Integer id;

    private String moduleName;

    private String moduleLabel;

    private String moduleFather;

    private String sortProperty;

    private String  funcDesc;


}
