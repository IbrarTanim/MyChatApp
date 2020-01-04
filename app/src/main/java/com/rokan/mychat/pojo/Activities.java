package com.rokan.mychat.pojo;

public class Activities {

    int activitiesProfilePic;
    String name;
    String time;

    public Activities(int activitiesProfilePic, String name, String time) {
        this.activitiesProfilePic = activitiesProfilePic;
        this.name = name;
        this.time = time;
    }

    public int getActivitiesProfilePic() {
        return activitiesProfilePic;
    }

    public void setActivitiesProfilePic(int activitiesProfilePic) {
        this.activitiesProfilePic = activitiesProfilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
