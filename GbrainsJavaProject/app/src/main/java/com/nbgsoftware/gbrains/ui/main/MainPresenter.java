package com.nbgsoftware.gbrains.ui.main;

import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;

public class MainPresenter<V extends MainContract.View> extends MVPPresenter<V> implements MainContract.Presenter<V>{

    /**
     * Sử dụng gson để lấy data từ tệp assets featured_question.json
     * */
    @Override
    public void getDataFromAssetsFeaturedQuestion(){
        //todo
    }

    /**
     * Sử dụng gson để lấy data từ tệp assets trending_post.json
     * */
    @Override
    public void getDataFromAssetsTrendingPost(){
        //todo
    }
}
