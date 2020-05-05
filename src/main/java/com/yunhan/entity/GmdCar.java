package com.yunhan.entity;

import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.io.Serializable;

public class GmdCar implements Serializable {
    private Integer carportid;
    private Integer carportno;
    private Integer carporttid;
    private Integer cartportstatus;
    private String carporttname;

    private Integer clientmessageid;
    private String clientname;
    private String phone;

    private Integer roomid;
    private String roomno;

    private Integer itemsid;
    private String itemsname;

    private String cbegintime;
    private String cendtime;

    public String getCbegintime() {
        return cbegintime;
    }

    public void setCbegintime(String cbegintime) {
        this.cbegintime = cbegintime;
    }

    public String getCendtime() {
        return cendtime;
    }

    public void setCendtime(String cendtime) {
        this.cendtime = cendtime;
    }

    public Integer getCarportid() {
        return carportid;
    }

    public void setCarportid(Integer carportid) {
        this.carportid = carportid;
    }

    public Integer getCarportno() {
        return carportno;
    }

    public void setCarportno(Integer carportno) {
        this.carportno = carportno;
    }

    public Integer getCarporttid() {
        return carporttid;
    }

    public void setCarporttid(Integer carporttid) {
        this.carporttid = carporttid;
    }

    public Integer getCartportstatus() {
        return cartportstatus;
    }

    public void setCartportstatus(Integer cartportstatus) {
        this.cartportstatus = cartportstatus;
    }

    public String getCarporttname() {
        return carporttname;
    }

    public void setCarporttname(String carporttname) {
        this.carporttname = carporttname;
    }

    public Integer getClientmessageid() {
        return clientmessageid;
    }

    public void setClientmessageid(Integer clientmessageid) {
        this.clientmessageid = clientmessageid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }
}
