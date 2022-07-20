package com.nbgsoftware.gbrains.data.models.response;

import com.google.gson.annotations.SerializedName;
import com.nbgsoftware.gbrains.data.models.TrendPost;

import java.util.List;

public class TrendPostResponse {

    @SerializedName("trending_post")
    private List<TrendPost> trendPostList;

    public TrendPostResponse(List<TrendPost> trendPostList) {
        setTrendPostList(trendPostList);
    }

    public List<TrendPost> getTrendPostList() {
        return trendPostList;
    }

    public void setTrendPostList(List<TrendPost> trendPostList) {
        this.trendPostList = trendPostList;
    }
}
