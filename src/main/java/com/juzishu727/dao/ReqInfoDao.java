package com.juzishu727.dao;

import com.juzishu727.bean.ReqInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReqInfoDao {

    List<ReqInfo> selectList(ReqInfo info);

    Integer getTotal();

    ReqInfo selectById(Integer id);

    void addReqInfo(ReqInfo info);

    void updateReqInfo(ReqInfo info);

    void deleteReqInfo(Integer id);
}
