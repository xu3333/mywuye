package com.yunhan.mapper;

import com.yunhan.entity.Receivables;

import java.util.List;
import java.util.Map;
public interface ReceivablesMapper {
    List<Map> selectAll(Map<String,Object> map);

//    原因不明的出错
//    int selectAllCount(Receivables receivables);
}
