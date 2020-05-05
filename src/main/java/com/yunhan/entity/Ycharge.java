package com.yunhan.entity;

import java.util.Date;

public class Ycharge {
    private Integer clientmessageid;
    private Integer assessment;
    private Date collectdata;
    private String tollgatherer;
    private String paymenttype;
    private String roomno;
     private String clientname;
     private  String payproject;

    public Integer getClientmessageid() {
        return clientmessageid;
    }

    public void setClientmessageid(Integer clientmessageid) {
        this.clientmessageid = clientmessageid;
    }

    public Integer getAssessment() {
        return assessment;
    }

    public void setAssessment(Integer assessment) {
        this.assessment = assessment;
    }

    public Date getCollectdata() {
        return collectdata;
    }

    public void setCollectdata(Date collectdata) {
        this.collectdata = collectdata;
    }

    public String getTollgathere() {
        return tollgatherer;
    }

    public void setTollgathere(String tollgathere) {
        this.tollgatherer = tollgathere;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getPayproject() {
        return payproject;
    }

    public void setPayproject(String payproject) {
        this.payproject = payproject;
    }
}
