package com.yunhan.service.impl;

import com.yunhan.entity.GmdCar;
import com.yunhan.entity.GmdRoom;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.GmdCarMapper;
import com.yunhan.service.GmdCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
//@Service 把类当做容器中的一个组件来使用。
//当使用@Autowired注解则是实例化构造器。因为在自动注入时，是一个接口类型，所以要在容器中找到相应的实现类注入。故@Service加到类上
@Transactional  //事务回滚
public class GmdCarServiceImpl implements GmdCarService {
    @Resource
    //共同点：@Resource和@Autowired都是做bean的注入时使用，其实@Resource并不是Spring的注解，它的包是javax.annotation.Resource，需要导入，但是Spring支持该注解的注入。
    //不同点：@Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired;只按照byType（类型）注入。
    //两种注入方式  1. 用于字段上  2.用于set方法
    private GmdCarMapper gmdCarMapper;

    @Override
    public List<Map> selectAllcar(pageCount pageCount, GmdCar gmdCar) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",gmdCar.getClientname());
        return gmdCarMapper.selectAllcar(map);
    }

    @Override
    public int selectCountcar(GmdCar gmdCar) {
        return gmdCarMapper.selectCountcar(gmdCar);
    }

    @Override
    public int delRoom(Integer carportid)
    {
        return gmdCarMapper.delCar(carportid);
    }

    @Override
    public List<GmdCar> selCarportT(GmdCar gmdCar) {
        return gmdCarMapper.selCarportT(gmdCar);
    }

    @Override
    public int addCar(GmdCar gmdCar) {
        return gmdCarMapper.addCar(gmdCar);
    }

    @Override
    public int delqCar(Integer carportid) {
        return gmdCarMapper.delqCar(carportid);
    }

    @Override
    public int selAddcar(String carportno) {
        return gmdCarMapper.selAddcar(carportno);
    }

    @Override
    public List<GmdCar> selcUp(Integer carportid) {
        return gmdCarMapper.selcUp(carportid);
    }

    @Override
    public int UpCar(GmdCar gmdCar) {
        return gmdCarMapper.UpCar(gmdCar);
    }

    @Override
    public List<GmdCar> selBtncar(Integer carportid) {
        return gmdCarMapper.selBtncar(carportid);
    }

    @Override
    public List<GmdCar> selRc(GmdCar gmdCar) {
        return gmdCarMapper.selRc(gmdCar);
    }

    @Override
    public List<GmdCar> selC(String roomno) {
        return gmdCarMapper.selC(roomno);
    }

    @Override
    public int upBtn(GmdCar gmdCar) {
        return gmdCarMapper.upBtn(gmdCar);
    }

    @Override
    public int upBtncar(GmdCar gmdCar) {
        return gmdCarMapper.upBtncar(gmdCar);
    }

    @Override
    public int upCarp(Integer carportid) {
        return gmdCarMapper.upCarp(carportid);
    }

    @Override
    public int upcCarp(GmdCar gmdCar) {
        return gmdCarMapper.upcCarp(gmdCar);
    }

    @Override
    public int upWei(GmdCar gmdCar) {
        return gmdCarMapper.upWei(gmdCar);
    }
}
