package com.yunhan.entity;

public class Bill {
    private int billid;
    private int roomID;
    private String endtime;
    private  String payproject;
    private int  practical;
    private int price;
    private int assessment;
    private String remark;
    private String homeNO;
    private String meterReadTime;
    private String patitemsName;
    private int utility;
    private int payitemsmoney;

    public int getBillid() {
        return billid;
    }

    public void setBillid(int billid) {
        this.billid = billid;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getPayproject() {
        return payproject;
    }

    public void setPayproject(String payproject) {
        this.payproject = payproject;
    }

    public int getPractical() {
        return practical;
    }

    public void setPractical(int practical) {
        this.practical = practical;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHomeNO() {
        return homeNO;
    }

    public void setHomeNO(String homeNO) {
        this.homeNO = homeNO;
    }

    public String getMeterReadTime() {
        return meterReadTime;
    }

    public void setMeterReadTime(String meterReadTime) {
        this.meterReadTime = meterReadTime;
    }

    public String getPatitemsName() {
        return patitemsName;
    }

    public void setPatitemsName(String patitemsName) {
        this.patitemsName = patitemsName;
    }

    public int getUtility() {
        return utility;
    }

    public void setUtility(int utility) {
        this.utility = utility;
    }

    public int getPayitemsmoney() {
        return payitemsmoney;
    }

    public void setPayitemsmoney(int payitemsmoney) {
        this.payitemsmoney = payitemsmoney;
    }
}
