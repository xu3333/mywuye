package com.yunhan.service;

import com.yunhan.entity.Receivable;
import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface ReceivableService {
    List<Map> selectAll(pageCount pageCount,Receivable receivable);
    int selectCount(Receivable receivable);
}
