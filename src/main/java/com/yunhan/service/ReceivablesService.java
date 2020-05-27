package com.yunhan.service;


import com.yunhan.entity.pageCount;
import com.yunhan.entity.Receivables;

import java.util.List;
import java.util.Map;

public interface ReceivablesService {
    List<Map> selectAll(pageCount pageCount, Receivables receivables);
    //    原因不明的出错
//    int selectAllCount(Receivables receivables);
}
