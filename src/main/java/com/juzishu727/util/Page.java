package com.juzishu727.util;

import lombok.Data;

@Data
public class Page {

    //每页显示的数据条数
    private int pageNumber;

    //sql语句查询索引
    private int offset;
}
