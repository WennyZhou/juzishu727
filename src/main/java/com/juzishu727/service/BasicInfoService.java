package com.juzishu727.service;

import com.juzishu727.bean.BasicInfo;

import java.util.List;

public interface BasicInfoService {

    List<BasicInfo> selectList(BasicInfo info);

    List<BasicInfo> selectAll();

    Integer getTotal();

    BasicInfo selectById(Integer id);

    void addBasicInfo(BasicInfo info);

    void updateBasicInfo(BasicInfo info);

    void deleteBasicInfo(Integer id);
}
