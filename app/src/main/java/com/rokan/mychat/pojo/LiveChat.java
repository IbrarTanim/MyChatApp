package com.rokan.mychat.pojo;

public class LiveChat {

    private int LivProfilePic;
    private String nameTitle;
    private String chatText;
    private String chatTime;


    public LiveChat(int livProfilePic, String nameTitle, String chatText, String chatTime) {
        LivProfilePic = livProfilePic;
        this.nameTitle = nameTitle;
        this.chatText = chatText;
        this.chatTime = chatTime;
    }

    public int getLivProfilePic() {
        return LivProfilePic;
    }

    public void setLivProfilePic(int livProfilePic) {
        LivProfilePic = livProfilePic;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText;
    }

    public String getChatTime() {
        return chatTime;
    }

    public void setChatTime(String chatTime) {
        this.chatTime = chatTime;
    }
}
