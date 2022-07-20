package com.nbgsoftware.gbrains.data.models;

import com.google.gson.annotations.SerializedName;

public class TrendPost {
    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("content")
    private String content;

    @SerializedName("topic")
    private String topic;

    @SerializedName("date")
    private String date;

    @SerializedName("total_view")
    private Integer totalView;

    @SerializedName("total_share")
    private Integer totalShare;

    public TrendPost(int id, String title, String thumbnail, String content, String topic,
                     String date, Integer totalView, Integer totalShare) {
        setId(id);
        setTitle(title);
        setThumbnail(thumbnail);
        setContent(content);
        setTopic(topic);
        setDate(date);
        setTotalView(totalView);
        setTotalShare(totalShare);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTotalView() {
        return totalView;
    }

    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }

    public Integer getTotalShare() {
        return totalShare;
    }

    public void setTotalShare(Integer totalShare) {
        this.totalShare = totalShare;
    }
}
