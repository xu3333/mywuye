package com.yunhan.entity;

import java.io.Serializable;

public class GmdLou implements Serializable {
    private  Integer buildingid;
    private  String buildingname;
    private Integer payitemsid;
    private Integer loucengid;
    private String loucengno;
    private Integer buildingstatus;
    private Integer loucengcount;
    private Integer itemsid;

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getLoucengcount() {
        return loucengcount;
    }

    public void setLoucengcount(Integer loucengcount) {
        this.loucengcount = loucengcount;
    }

    public Integer getBuildingstatus() {
        return buildingstatus;
    }

    public void setBuildingstatus(Integer buildingstatus) {
        this.buildingstatus = buildingstatus;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public Integer getPayitemsid() {
        return payitemsid;
    }

    public void setPayitemsid(Integer payitemsid) {
        this.payitemsid = payitemsid;
    }

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
}
