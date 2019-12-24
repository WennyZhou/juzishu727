package com.juzishu727.service;

import com.juzishu727.util.TreeNode;

import java.util.List;

public interface TreeService {

    List<TreeNode> getTree();

    List<TreeNode> getSubTree(String parent);
}
