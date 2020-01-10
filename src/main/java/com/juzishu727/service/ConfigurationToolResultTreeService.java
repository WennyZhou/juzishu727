package com.juzishu727.service;

import com.juzishu727.bean.ConfigResult;
import com.juzishu727.util.TreeNode;

import java.util.List;

public interface ConfigurationToolResultTreeService {

    List<TreeNode> getTree(ConfigResult result);

    List<TreeNode> getSubTree(ConfigResult result);
}
