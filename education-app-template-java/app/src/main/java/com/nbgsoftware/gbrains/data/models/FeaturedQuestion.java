package com.nbgsoftware.gbrains.data.models;

import com.google.gson.annotations.SerializedName;

public class FeaturedQuestion {
    @SerializedName("id")
    private int id;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("user_name")
    private String userName;

    @SerializedName("topic")
    private String topic;

    @SerializedName("content")
    private String content;

    @SerializedName("total_view")
    private Integer totalView;

    @SerializedName("total_follow")
    private Integer totalFollow;

    @SerializedName("total_answer")
    private Integer totalAnswer;

    public FeaturedQuestion(int id, String avatar, String userName, String topic, String content,
                            Integer totalView, Integer totalFollow, Integer totalAnswer) {
        setId(id);
        setAvatar(avatar);
        setUserName(userName);
        setTopic(topic);
        setContent(content);
        setTotalView(totalView);
        setTotalFollow(totalFollow);
        setTotalAnswer(totalAnswer);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTotalView() {
        return totalView;
    }

    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }

    public Integer getTotalFollow() {
        return totalFollow;
    }

    public void setTotalFollow(Integer totalFollow) {
        this.totalFollow = totalFollow;
    }

    public Integer getTotalAnswer() {
        return totalAnswer;
    }

    public void setTotalAnswer(Integer totalAnswer) {
        this.totalAnswer = totalAnswer;
    }
}
