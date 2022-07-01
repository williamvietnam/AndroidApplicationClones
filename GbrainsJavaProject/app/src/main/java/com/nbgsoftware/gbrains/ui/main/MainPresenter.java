package com.nbgsoftware.gbrains.ui.main;

import android.content.Context;

import com.google.gson.Gson;
import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;
import com.nbgsoftware.gbrains.data.models.response.FeaturedQuestionResponse;
import com.nbgsoftware.gbrains.data.models.response.TrendPostResponse;
import com.nbgsoftware.gbrains.utils.Utils;

public class MainPresenter<V extends MainContract.View>
        extends MVPPresenter<V> implements MainContract.Presenter<V> {

    @Override
    public void getDataForBannerFromFirebase() {

    }

    @Override
    public void getDataForFeaturedQuestionFromFirebase() {

    }

    @Override
    public void getDataForTrendingPostFromFirebase() {

    }

    /**
     * Sử dụng gson để lấy data từ tệp assets banner.json
     */
    @Override
    public void getDataFromAssetsBanner(Context context) {
        //todo
    }

    /**
     * Sử dụng gson để lấy data từ tệp assets trending_post.json
     */
    @Override
    public void getDataFromAssetsTrendingPost(Context context) {
        if (getView() != null) {
            String json = Utils.getJsonFromAssets("trending_post.json", context);
            Gson gson = new Gson();
            TrendPostResponse response = gson.fromJson(json, TrendPostResponse.class);
            getView().showTrendingPosts(response);
        }
    }

    /**
     * Sử dụng gson để lấy data từ tệp assets featured_question.json
     */
    @Override
    public void getDataFromAssetsFeaturedQuestion(Context context) {
        if (getView() != null) {
            String json = Utils.getJsonFromAssets("featured_question.json", context);
            Gson gson = new Gson();
            FeaturedQuestionResponse response = gson.fromJson(json, FeaturedQuestionResponse.class);
            getView().showFeaturedQuestions(response);
        }
    }
}
