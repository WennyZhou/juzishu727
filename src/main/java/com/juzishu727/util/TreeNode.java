package com.juzishu727.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeNode {

    private String text;

    private List<TreeNode> nodes = new ArrayList<>();

}
