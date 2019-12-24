package com.juzishu727.service;

import com.juzishu727.bean.ReqInfo;

import java.util.List;

public interface ReqInfoService {

    List<ReqInfo> selectList(ReqInfo info);

    List<ReqInfo> selectAll();

    Integer getTotal();

    ReqInfo selectById(Integer id);

    void addReqInfo(ReqInfo info);

    void updateReqInfo(ReqInfo info);

    void deleteReqInfo(Integer id);
}
