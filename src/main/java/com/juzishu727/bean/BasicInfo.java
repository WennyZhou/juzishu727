package com.juzishu727.bean;

import com.juzishu727.util.Page;
import lombok.Data;

/**
 * 基本配置信息
 */
@Data
public class BasicInfo  extends Page {
    private Integer id;

    private String propertyName;

    private String propertyLabel;

    private Double propertyValue;

    private String propertyUnit;

}
