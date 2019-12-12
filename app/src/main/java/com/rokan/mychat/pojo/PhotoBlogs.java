package com.rokan.mychat.pojo;

public class PhotoBlogs {

    int photoBlogProfilePic;
    String love;
    String view;
    String comment;
    String like;
    String userName;
    String title;


    public PhotoBlogs(int photoBlogProfilePic, String love, String view, String comment, String like, String userName, String title) {
        this.photoBlogProfilePic = photoBlogProfilePic;
        this.love = love;
        this.view = view;
        this.comment = comment;
        this.like = like;
        this.userName = userName;
        this.title = title;
    }


    public int getPhotoBlogProfilePic() {
        return photoBlogProfilePic;
    }

    public void setPhotoBlogProfilePic(int photoBlogProfilePic) {
        this.photoBlogProfilePic = photoBlogProfilePic;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
