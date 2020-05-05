package com.yunhan.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.PriorityBlockingQueue;

public class GmdRoom implements Serializable {
    private Integer roomid;
    private String roomno;
    private String clientname;
    private  String roomarea;
    private String housetype;
    private String finish;
    private Integer housestate;
    private  Integer metertid;
    private Integer carportid;
    private  Integer clientmessageid;
    private  Integer loucengid;


    private  String clienttype;
    private String phone;
    private  String certificatetype;
    private  String certificateno;
    private  String gender;
    private Date birthday;
    private String nation;
    private Integer educationid;
    private String natives;
    private  Date addtime;
    private  Integer rmid;
    private  Integer bankid;
    private String meterttype;
    private Integer carportno;
    private Integer carporttid;
    private String carporttname;
    private  String loucengno;
    private  Integer buildingid;
    private  String buildingname;
    private Integer loucengcount;
    private Integer buildingstatus;
    private Integer payitemsid;
     private String patitemsname;
     private Date begintime;
     private String payitemsmoney;
     private Integer itemsid;
     private String itemsname;

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

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getRoomarea() {
        return roomarea;
    }

    public void setRoomarea(String roomarea) {
        this.roomarea = roomarea;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public Integer getHousestate() {
        return housestate;
    }

    public void setHousestate(Integer housestate) {
        this.housestate = housestate;
    }

    public Integer getMetertid() {
        return metertid;
    }

    public void setMetertid(Integer metertid) {
        this.metertid = metertid;
    }

    public Integer getCarportid() {
        return carportid;
    }

    public void setCarportid(Integer carportid) {
        this.carportid = carportid;
    }

    public Integer getClientmessageid() {
        return clientmessageid;
    }

    public void setClientmessageid(Integer clientmessageid) {
        this.clientmessageid = clientmessageid;
    }

    public Integer getLoucengid() {
        return loucengid;
    }

    public void setLoucengid(Integer loucengid) {
        this.loucengid = loucengid;
    }

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    public String getCertificateno() {
        return certificateno;
    }

    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getRmid() {
        return rmid;
    }

    public void setRmid(Integer rmid) {
        this.rmid = rmid;
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public String getMeterttype() {
        return meterttype;
    }

    public void setMeterttype(String meterttype) {
        this.meterttype = meterttype;
    }

    public Integer getCarportno() {
        return carportno;
    }

    public void setCarportno(Integer carportno) {
        this.carportno = carportno;
    }

    public Integer getCarporttid() {
        return carporttid;
    }

    public void setCarporttid(Integer carporttid) {
        this.carporttid = carporttid;
    }

    public String getCarporttname() {
        return carporttname;
    }

    public void setCarporttname(String carporttname) {
        this.carporttname = carporttname;
    }

    public String getLoucengno() {
        return loucengno;
    }

    public void setLoucengno(String loucengno) {
        this.loucengno = loucengno;
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

    public String getPatitemsname() {
        return patitemsname;
    }

    public void setPatitemsname(String patitemsname) {
        this.patitemsname = patitemsname;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public String getPayitemsmoney() {
        return payitemsmoney;
    }

    public void setPayitemsmoney(String payitemsmoney) {
        this.payitemsmoney = payitemsmoney;
    }

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }
}
