package com.yunhan.entity;

import java.util.Date;

public class ComplaintSuggestion {
    private Integer complaintsuggestionid;
    private Integer roomid;
    private String complainant;
    private String complainantnumber;
    private String complainanttype;
    private String complainanttime;
    private String complainanteventdescription;
    private Integer complainantprocessingstate;
    private String dealingwithpeople;
    private String dealingwithtime;
    private String dealingwithremarks;
    private String visitor;
    private String revisitdays;
    private String returnnotes;
    private String degreeofsatisfaction;
    private Integer finishedstate;
    private String roomno;
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public Integer getComplaintsuggestionid() {
        return complaintsuggestionid;
    }

    public void setComplaintsuggestionid(Integer complaintsuggestionid) {
        this.complaintsuggestionid = complaintsuggestionid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getComplainant() {
        return complainant;
    }

    public void setComplainant(String complainant) {
        this.complainant = complainant;
    }

    public String getComplainantnumber() {
        return complainantnumber;
    }

    public void setComplainantnumber(String complainantnumber) {
        this.complainantnumber = complainantnumber;
    }

    public String getComplainanttype() {
        return complainanttype;
    }

    public void setComplainanttype(String complainanttype) {
        this.complainanttype = complainanttype;
    }

    public String getComplainanttime() {
        return complainanttime;
    }

    public void setComplainanttime(String complainanttime) {
        this.complainanttime = complainanttime;
    }

    public String getComplainanteventdescription() {
        return complainanteventdescription;
    }

    public void setComplainanteventdescription(String complainanteventdescription) {
        this.complainanteventdescription = complainanteventdescription;
    }

    public Integer getComplainantprocessingstate() {
        return complainantprocessingstate;
    }

    public void setComplainantprocessingstate(Integer complainantprocessingstate) {
        this.complainantprocessingstate = complainantprocessingstate;
    }

    public String getDealingwithpeople() {
        return dealingwithpeople;
    }

    public void setDealingwithpeople(String dealingwithpeople) {
        this.dealingwithpeople = dealingwithpeople;
    }

    public String getDealingwithtime() {
        return dealingwithtime;
    }

    public void setDealingwithtime(String dealingwithtime) {
        this.dealingwithtime = dealingwithtime;
    }

    public String getDealingwithremarks() {
        return dealingwithremarks;
    }

    public void setDealingwithremarks(String dealingwithremarks) {
        this.dealingwithremarks = dealingwithremarks;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public String getRevisitdays() {
        return revisitdays;
    }

    public void setRevisitdays(String revisitdays) {
        this.revisitdays = revisitdays;
    }

    public String getReturnnotes() {
        return returnnotes;
    }

    public void setReturnnotes(String returnnotes) {
        this.returnnotes = returnnotes;
    }

    public String getDegreeofsatisfaction() {
        return degreeofsatisfaction;
    }

    public void setDegreeofsatisfaction(String degreeofsatisfaction) {
        this.degreeofsatisfaction = degreeofsatisfaction;
    }

    public Integer getFinishedstate() {
        return finishedstate;
    }

    public void setFinishedstate(Integer finishedstate) {
        this.finishedstate = finishedstate;
    }
}
