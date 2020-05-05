package com.yunhan.service;

import com.yunhan.entity.GmdRoom;

import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface GmdService {
    //查询房间档案所有信息
    public List<Map> selectAll(pageCount pageCount, GmdRoom gmdRoom);
    //查询总条数
    public int selectCount(GmdRoom gmdRoom);
    //根据房间id删除房间信息
    public int delRoom(Integer roomid);

    //查询单元号
    public List<GmdRoom> selB(GmdRoom gmdRoom);

    //通过楼宇id查询楼层
    public List<GmdRoom> selBs(Integer buildingid);

    //添加房间
    public int addRoom(GmdRoom gmdRoom);
    //添加房间时查询同一单元同一楼层是否存在
    public int  selAddr(GmdRoom gmdRoom);

    //添加楼层
    public int addLoucy(GmdRoom gmdRoom);

    //修改时查询单元号
    public List<GmdRoom> upSelly(GmdRoom gmdRoom);
    //修改时查询房间信息
    public List<GmdRoom> upSelRoom(GmdRoom gmdRoom);

    //先修改楼层表信息
    public int upRlc(GmdRoom gmdRoom);
    //再修改房间表信息
    public int upRoom(GmdRoom gmdRoom);

    //添加时查询的单元号和楼层号
    public List<GmdRoom> addSellr(GmdRoom gmdRoom);
    //添加时查询客户姓名
    public List<GmdRoom> addSelc(GmdRoom gmdRoom);
    //执行添加并修改房间状态
    public int addBtnroom(GmdRoom gmdRoom);


}
