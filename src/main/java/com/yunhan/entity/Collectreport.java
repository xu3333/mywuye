package com.yunhan.entity;
import java.io.Serializable;
import java.util.Date;

public class Collectreport implements Serializable {
    private String roomno;
    private String clientname;
    private String buildingname;
    private String patitemsname;
    private String paymenttype;
    private Date collectdate;
    private String tollgatherer;
    private String testh;
    private String Cbegin;
    private String Cend;

    public String getCbegin() {
        return Cbegin;
    }

    public void setCbegin(String cbegin) {
        Cbegin = cbegin;
    }

    public String getCend() {
        return Cend;
    }

    public void setCend(String cend) {
        Cend = cend;
    }


    public String getTesth() {
        return testh;
    }

    public void setTesth(String testh) {
        this.testh = testh;
    }

    public String getTollgatherer() {
        return tollgatherer;
    }
    public void setTollgatherer(String tollgatherer) {
        this.tollgatherer = tollgatherer;
    }
    public String getClientname() {
        return clientname;
    }
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }
    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getPatitemsname() {
        return patitemsname;
    }

    public void setPatitemsname(String patitemsname) {
        this.patitemsname = patitemsname;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public Date getCollectdate() {
        return collectdate;
    }

    public void setCollectdate(Date collectdate) {
        this.collectdate = collectdate;
    }



}
