package com.yunhan.entity;

public class RoomType {
    private int roomID;
    private String roomNO;
    private String clientName;
    private  int clientmessageId;
    private Integer practical;
    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomNO() {
        return roomNO;
    }

    public void setRoomNO(String roomNO) {
        this.roomNO = roomNO;
    }

    public int getClientmessageId() {
        return clientmessageId;
    }

    public void setClientmessageId(int clientmessageId) {
        this.clientmessageId = clientmessageId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getPractical() {
        return practical;
    }

    public void setPractical(Integer practical) {
        this.practical = practical;
    }
}
