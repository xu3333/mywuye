package com.yunhan.service;

import com.yunhan.entity.GmdCar;
import com.yunhan.entity.GmdClient;
import com.yunhan.entity.GmdRoom;
import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface GmdClientService {
    //查询房间档案所有信息
    public List<Map> selectAll(pageCount pageCount, GmdClient gmdClient);
    //查询总条数
    public int selectCount(GmdClient gmdClient);

    //查询学历表
    public List<GmdClient> seleducation(GmdClient gmdClient);

    //添加客户信息
    public int addClient(GmdClient gmdClient);
    //添加紧急联系人信息
    public int addRelat(GmdClient gmdClient);
    //添加银行信息
    public int addBank(GmdClient gmdClient);
    //根据房间id删除房间信息
    public int delClient(Integer clientmessageid);
    //修改时根据id查询所有信息
    public List<GmdClient> selUpClient(Integer clientmessageid);
    //通过id修改信息
    public int upClient(GmdClient gmdClient);
    //通过id查询银行信息
    public List<GmdClient> selBank(GmdClient gmdClient);
    //通过id修改紧急联系人
    public int upRelation(GmdClient gmdClient);
    //添加客户信息时查询客户是否存在
    public int selAddc(GmdClient gmdClient);
}
