package com.nbgsoftware.gbrains.data.models;

public class Splash {
    private int imageDrawable;
    private String imageRes;
    private String title;
    private String description;

    public Splash(int imageDrawable, String title, String description) {
        setImageDrawable(imageDrawable);
        setTitle(title);
        setDescription(description);
    }

    public Splash(String imageRes, String title, String description) {
        setImageRes(imageRes);
        setTitle(title);
        setDescription(description);
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
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
