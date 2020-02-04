package com.rokan.mychat.pojo;

public class Transaction {

    private String nameTitle;
    private String credit;
    private String chatTime;

    public Transaction(String nameTitle, String credit, String chatTime) {
        this.nameTitle = nameTitle;
        this.credit = credit;
        this.chatTime = chatTime;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getChatTime() {
        return chatTime;
    }

    public void setChatTime(String chatTime) {
        this.chatTime = chatTime;
    }
}
