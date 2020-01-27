package com.rokan.mychat.pojo;

public class ActiveUser {

    private int LivProfilePic;
    private String nameTitle;

    public ActiveUser(int livProfilePic, String nameTitle) {
        LivProfilePic = livProfilePic;
        this.nameTitle = nameTitle;
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
}
