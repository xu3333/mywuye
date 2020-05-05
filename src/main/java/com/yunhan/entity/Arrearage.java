package com.yunhan.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.function.DoubleBinaryOperator;

public class Arrearage implements Serializable {
    private Integer loucengid;
    private String  loucengno;
    private Integer roomid;
    private String roomno;
    private String roomarea;
    private  Integer clientMessageid;
    private String clientname;
    private String phone;
    private Date endtime;
    private String payproject;
    private Integer practical;
    private Integer price;
    private Integer assessment;
    private String remark;
    public Integer getLoucengid() {
        return loucengid;
    }

    public void setLoucengid(Integer loucengid) {
        this.loucengid = loucengid;
    }

    public String getLoucengno() {
        return loucengno;
    }

    public void setLoucengno(String loucengno) {
        this.loucengno = loucengno;
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

    public String getRoomarea() {
        return roomarea;
    }

    public void setRoomarea(String roomarea) {
        this.roomarea = roomarea;
    }

    public Integer getClientMessageid() {
        return clientMessageid;
    }

    public void setClientMessageid(Integer clientMessageid) {
        this.clientMessageid = clientMessageid;
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

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPayproject() {
        return payproject;
    }

    public void setPayproject(String payproject) {
        this.payproject = payproject;
    }

    public Integer getPractical() {
        return practical;
    }

    public void setPractical(Integer practical) {
        this.practical = practical;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAssessment() {
        return assessment;
    }

    public void setAssessment(Integer assessment) {
        this.assessment = assessment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }




}

