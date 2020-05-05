package com.yunhan.entity;

import java.io.Serializable;

public class MeterCharge implements Serializable {
    private Integer meterID;
    private int auditStatus;
    private int roomID;
    private String roomNo;
    private String clientName;
    private int payitemsId;
    private String patitemsName;
    private int payitemsmoney;
    private String meterReadTime;
    private int utility;
    private String meterReadStatus;
    private String chargeStandard;
    private double total;
    private String remark;
    public String getPatitemsName() {
        return patitemsName;
    }

    public int getPayitemsmoney() {
        return payitemsmoney;
    }

    public void setPayitemsmoney(int payitemsmoney) {
        this.payitemsmoney = payitemsmoney;
    }

    public void setPatitemsName(String patitemsName) {
        this.patitemsName = patitemsName;
    }
    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public Integer getMeterID() {
        return meterID;
    }

    public void setMeterID(Integer meterID) {
        this.meterID = meterID;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getPayitemsId() {
        return payitemsId;
    }

    public void setPayitemsId(int payitemsId) {
        this.payitemsId = payitemsId;
    }

    public String getMeterReadTime() {
        return meterReadTime;
    }

    public void setMeterReadTime(String meterReadTime) {
        this.meterReadTime = meterReadTime;
    }

    public int getUtility() {
        return utility;
    }

    public void setUtility(int utility) {
        this.utility = utility;
    }

    public String getMeterReadStatus() {
        return meterReadStatus;
    }

    public void setMeterReadStatus(String meterReadStatus) {
        this.meterReadStatus = meterReadStatus;
    }

    public String getChargeStandard() {
        return chargeStandard;
    }

    public void setChargeStandard(String chargeStandard) {
        this.chargeStandard = chargeStandard;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MeterCharge{" +
                "meterID=" + meterID +
                ", auditStatus=" + auditStatus +
                ", roomID=" + roomID +
                ", roomNo='" + roomNo + '\'' +
                ", clientName='" + clientName + '\'' +
                ", payitemsId=" + payitemsId +
                ", patitemsName='" + patitemsName + '\'' +
                ", payitemsmoney=" + payitemsmoney +
                ", meterReadTime='" + meterReadTime + '\'' +
                ", utility=" + utility +
                ", meterReadStatus='" + meterReadStatus + '\'' +
                ", chargeStandard='" + chargeStandard + '\'' +
                ", total=" + total +
                ", remark='" + remark + '\'' +
                '}';
    }
}
