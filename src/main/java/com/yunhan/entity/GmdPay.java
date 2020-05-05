package com.yunhan.entity;

        import java.io.Serializable;

public class GmdPay  implements Serializable {
    private Integer payitemsid;
    private String patitemsname;
    private String metertid;
    private String payitemstid;
    private double payitemsmoney;
    private String begintime;
    private Integer itemsid;

    private String meterttype;

    private String patitemstname;

    private String itemsname;

    public double getPayitemsmoney() {
        return payitemsmoney;
    }

    public void setPayitemsmoney(double payitemsmoney) {
        this.payitemsmoney = payitemsmoney;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public Integer getPayitemsid() {
        return payitemsid;
    }

    public void setPayitemsid(Integer payitemsid) {
        this.payitemsid = payitemsid;
    }

    public String getPatitemsname() {
        return patitemsname;
    }

    public void setPatitemsname(String patitemsname) {
        this.patitemsname = patitemsname;
    }

    public String getMetertid() {
        return metertid;
    }

    public void setMetertid(String metertid) {
        this.metertid = metertid;
    }

    public String getPayitemstid() {
        return payitemstid;
    }

    public void setPayitemstid(String payitemstid) {
        this.payitemstid = payitemstid;
    }



    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public String getMeterttype() {
        return meterttype;
    }

    public void setMeterttype(String meterttype) {
        this.meterttype = meterttype;
    }

    public String getPatitemstname() {
        return patitemstname;
    }

    public void setPatitemstname(String patitemstname) {
        this.patitemstname = patitemstname;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }
}
