package com.nbgsoftware.gbrains.data.models.response;

import com.google.gson.annotations.SerializedName;
import com.nbgsoftware.gbrains.data.models.Welcome;

import java.util.List;

public class WelcomeResponse {

    @SerializedName("welcome")
    private List<Welcome> welcomeList;

    public WelcomeResponse(List<Welcome> welcomeList) {
        setWelcomeList(welcomeList);
    }

    public List<Welcome> getWelcomeList() {
        return welcomeList;
    }

    public void setWelcomeList(List<Welcome> welcomeList) {
        this.welcomeList = welcomeList;
    }
}
