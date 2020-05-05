package com.yunhan.entity;

public class WXPrice {
    private Integer roomID;
    private String roomNo;
    private String endtime;
    private String clientname;
    private double assessment;
    private String payproject;

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    public String getPayproject() {
        return payproject;
    }

    public void setPayproject(String payproject) {
        this.payproject = payproject;
    }
}
