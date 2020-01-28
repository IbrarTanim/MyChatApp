package com.rokan.mychat.pojo;

public class Comment {

    private int commentProfilePic;
    private String nameTitle;
    private String commentTitle;
    private String timeStamp;


    public Comment(int commentProfilePic, String nameTitle, String commentTitle, String timeStamp) {
        this.commentProfilePic = commentProfilePic;
        this.nameTitle = nameTitle;
        this.commentTitle = commentTitle;
        this.timeStamp = timeStamp;
    }

    public int getCommentProfilePic() {
        return commentProfilePic;
    }

    public void setCommentProfilePic(int commentProfilePic) {
        this.commentProfilePic = commentProfilePic;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
