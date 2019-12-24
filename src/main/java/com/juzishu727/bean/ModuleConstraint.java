package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

@Data
public class ModuleConstraint extends Page {

    private Integer id;

    private String constPair;

    private String constMaster;

    private String pairClass;

    private String constClass;

    private String constForm;

}
