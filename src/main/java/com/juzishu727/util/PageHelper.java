package com.juzishu727.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PageHelper<T> {

    //返回数据集合
    private List<T> rows = new ArrayList<>();

    //返回数据总条数
    private Integer total;
}
