package com.nbgsoftware.gbrains.data.models.response;

import com.google.gson.annotations.SerializedName;
import com.nbgsoftware.gbrains.data.models.FeaturedQuestion;

import java.util.List;

public class FeaturedQuestionResponse {

    @SerializedName("featured_question")
    private List<FeaturedQuestion> featuredQuestionList;

    public FeaturedQuestionResponse(List<FeaturedQuestion> featuredQuestionList) {
        setFeaturedQuestionList(featuredQuestionList);
    }

    public List<FeaturedQuestion> getFeaturedQuestionList() {
        return featuredQuestionList;
    }

    public void setFeaturedQuestionList(List<FeaturedQuestion> featuredQuestionList) {
        this.featuredQuestionList = featuredQuestionList;
    }
}
