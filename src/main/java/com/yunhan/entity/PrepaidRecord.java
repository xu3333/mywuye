package com.yunhan.entity;

public class PrepaidRecord {
    private Integer prepaidrecordid;
    private Integer roomid;
    private Double advanceamount;
    private Integer billnumber;
    private String advancedate;
    private String paymentmethod;
    private String remarks;
    private String roomno;
    private String clientname;

    public Integer getPrepaidrecordid() {
        return prepaidrecordid;
    }

    public void setPrepaidrecordid(Integer prepaidrecordid) {
        this.prepaidrecordid = prepaidrecordid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(Double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public Integer getBillnumber() {
        return billnumber;
    }

    public void setBillnumber(Integer billnumber) {
        this.billnumber = billnumber;
    }

    public String getAdvancedate() {
        return advancedate;
    }

    public void setAdvancedate(String advancedate) {
        this.advancedate = advancedate;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
}
