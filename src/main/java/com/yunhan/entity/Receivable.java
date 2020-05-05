package com.yunhan.entity;

public class Receivable {
    private Integer meterid;
    private String precinct;
    private Integer payitemsid;
    private Double payitemsmoney;
    private String remark;
    private Integer num;
    private Integer clientmessageid;
    private Double assessment;

    public Integer getClientmessageid() {
        return clientmessageid;
    }

    public void setClientmessageid(Integer clientmessageid) {
        this.clientmessageid = clientmessageid;
    }

    public Double getAssessment() {
        return assessment;
    }

    public void setAssessment(Double assessment) {
        this.assessment = assessment;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getMeterid() {
        return meterid;
    }

    public void setMeterid(Integer meterid) {
        this.meterid = meterid;
    }

    public String getPrecinct() {
        return precinct;
    }

    public void setPrecinct(String precinct) {
        this.precinct = precinct;
    }

    public Integer getPayitemsid() {
        return payitemsid;
    }

    public void setPayitemsid(Integer payitemsid) {
        this.payitemsid = payitemsid;
    }

    public Double getPayitemsmoney() {
        return payitemsmoney;
    }

    public void setPayitemsmoney(Double payitemsmoney) {
        this.payitemsmoney = payitemsmoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
