package com.yunhan.entity;

public class ChargeInfo {
    private Integer chargeid;
    private String chargetype;
    private double price;
    private double total;
    private Integer payitemsid;

    public Integer getChargeid() {
        return chargeid;
    }

    public void setChargeid(Integer chargeid) {
        this.chargeid = chargeid;
    }

    public String getChargetype() {
        return chargetype;
    }

    public void setChargetype(String chargetype) {
        this.chargetype = chargetype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getPayitemsid() {
        return payitemsid;
    }

    public void setPayitemsid(Integer payitemsid) {
        this.payitemsid = payitemsid;
    }
}
