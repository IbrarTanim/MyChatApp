package com.rokan.mychat.pojo;

public class PhotoBlogs {

    int photoBlogProfilePic;
    int circulerBlogProfilePic;
    String view;
    String comment;
    String like;
    String title;


    public PhotoBlogs(int photoBlogProfilePic, int circulerBlogProfilePic, String view, String comment, String like, String title) {
        this.photoBlogProfilePic = photoBlogProfilePic;
        this.circulerBlogProfilePic = circulerBlogProfilePic;
        this.view = view;
        this.comment = comment;
        this.like = like;
        this.title = title;
    }

    public int getPhotoBlogProfilePic() {
        return photoBlogProfilePic;
    }

    public void setPhotoBlogProfilePic(int photoBlogProfilePic) {
        this.photoBlogProfilePic = photoBlogProfilePic;
    }

    public int getCirculerBlogProfilePic() {
        return circulerBlogProfilePic;
    }

    public void setCirculerBlogProfilePic(int circulerBlogProfilePic) {
        this.circulerBlogProfilePic = circulerBlogProfilePic;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
