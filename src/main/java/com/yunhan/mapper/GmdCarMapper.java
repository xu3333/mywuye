package com.yunhan.mapper;

import com.yunhan.entity.GmdCar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface GmdCarMapper {
    //查询房间档案所有信息
    public List<Map> selectAllcar(Map<String,Object> map);
    //查询总条数
    public int selectCountcar(GmdCar gmdCar);
    //根据房间id禁用房间信息
    public int delCar(Integer carportid);
    //根据id启用房间信息
    public int delqCar(Integer carportid);
    //根据id查询车位类型表
    public List<GmdCar> selCarportT(GmdCar gmdCar);
    //添加车位
    public int addCar(GmdCar gmdCar);
    //判断车位是否存在
    public int selAddcar(String carportno);
    //修改时查询
    public List<GmdCar> selcUp(Integer carportid);
    //执行修改
    public int UpCar(GmdCar gmdCar);

    //查询车位编号与车位类型
    public List<GmdCar> selBtncar(Integer carportid);

    //查询房间
    public List<GmdCar> selRc(GmdCar gmdCar);

    //通过客户id查询房间
    public List<GmdCar> selC(String roomno);
    //执行修改车位绑定
    public int upBtn(GmdCar gmdCar);


    //执行车位绑定时修改客户信息里的车位id
    public int upBtncar(GmdCar gmdCar);


    //修改车位信息
    public int upCarp(Integer carportid);
    //车位状态修改时间
    public int upcCarp(GmdCar gmdCar);
    //点击提交时把客户状态恢复未使用状态
    public int upWei(GmdCar gmdCar);





}
