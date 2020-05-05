package com.yunhan.service.impl;

import com.yunhan.entity.GmdRoom;
import com.yunhan.entity.Users;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.GmdMapper;
import com.yunhan.service.GmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
//@Service 把类当做容器中的一个组件来使用。
//当使用@Autowired注解则是实例化构造器。因为在自动注入时，是一个接口类型，所以要在容器中找到相应的实现类注入。故@Service加到类上
@Transactional
public class GmdServiceImpl implements GmdService {
    @Autowired
    private GmdMapper gmdMapper;
    @Override
    public List<Map> selectAll(pageCount pageCount,GmdRoom gmdRoom) {

        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",gmdRoom.getClientname());
        return gmdMapper.selectAll(map);
    }

    @Override
    public int selectCount(GmdRoom gmdRoom) {
        return gmdMapper.selectCount(gmdRoom);
    }

    @Override
    public int delRoom(Integer roomid) {
        return gmdMapper.delRoom(roomid);
    }

    @Override
    public List<GmdRoom> selB(GmdRoom gmdRoom) {
        return gmdMapper.selB(gmdRoom);
    }

    @Override
    public List<GmdRoom> selBs(Integer buildingid) {
        return gmdMapper.selBs(buildingid);
    }

    @Override
    public int addRoom(GmdRoom gmdRoom) {
        return gmdMapper.addRoom(gmdRoom);
    }

    @Override
    public int selAddr(GmdRoom gmdRoom) {
        return gmdMapper.selAddr(gmdRoom);
    }

    @Override
    public int addLoucy(GmdRoom gmdRoom) {
        return gmdMapper.addLoucy(gmdRoom);
    }

    @Override
    public List<GmdRoom> upSelly(GmdRoom gmdRoom) {
        return gmdMapper.upSelly(gmdRoom);
    }

    @Override
    public List<GmdRoom> upSelRoom(GmdRoom gmdRoom) {
        return gmdMapper.upSelRoom(gmdRoom);
    }

    @Override
    public int upRlc(GmdRoom gmdRoom) {
        return gmdMapper.upRlc(gmdRoom);
    }

    @Override
    public int upRoom(GmdRoom gmdRoom) {
        return gmdMapper.upRoom(gmdRoom);
    }

    @Override
    public List<GmdRoom> addSellr(GmdRoom gmdRoom) {
        return gmdMapper.addSellr(gmdRoom);
    }

    @Override
    public List<GmdRoom> addSelc(GmdRoom gmdRoom) {
        return gmdMapper.addSelc(gmdRoom);
    }

    @Override
    public int addBtnroom(GmdRoom gmdRoom) {
        return gmdMapper.addBtnroom(gmdRoom);
    }
}

