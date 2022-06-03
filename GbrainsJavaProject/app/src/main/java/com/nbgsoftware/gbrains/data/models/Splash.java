package com.nbgsoftware.gbrains.data.models;

public class Splash {
    private String imageRes;
    private String title;
    private String description;

    public Splash(String imageRes, String title, String description) {
        setImageRes(imageRes);
        setTitle(title);
        setDescription(description);
    }

    public String getImageRes() {
        return imageRes;
    }

    public void setImageRes(String imageRes) {
        this.imageRes = imageRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
