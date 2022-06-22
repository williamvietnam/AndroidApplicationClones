package com.nbgsoftware.gbrains.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.data.models.FeaturedQuestion;
import com.nbgsoftware.gbrains.data.models.TrendPost;
import com.nbgsoftware.gbrains.data.models.response.FeaturedQuestionResponse;
import com.nbgsoftware.gbrains.data.models.response.TrendPostResponse;
import com.nbgsoftware.gbrains.databinding.FragmentMainBinding;
import com.nbgsoftware.gbrains.ui.main.adapters.BannerAdapter;
import com.nbgsoftware.gbrains.ui.main.adapters.FeaturedQuestionAdapter;
import com.nbgsoftware.gbrains.ui.main.adapters.TrendingPostAdapter;

import java.util.List;

/**
 * Author: William Giang Nguyen | Date 12/06/2022
 */
public class MainFragment extends MVPFragment<FragmentMainBinding> implements MainContract.View {

    MainContract.Presenter<MainContract.View> presenter = new MainPresenter<>();

    private BannerAdapter bannerAdapter;
    private TrendingPostAdapter trendingPostAdapter;
    private FeaturedQuestionAdapter featuredQuestionAdapter;

    @Override
    public FragmentMainBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentMainBinding.inflate(inflater, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.onViewCreated();

        presenter.getDataFromAssetsBanner(requireContext());
        presenter.getDataFromAssetsTrendingPost(requireContext());
        presenter.getDataFromAssetsFeaturedQuestion(requireContext());
    }

    @Override
    public void openGbrainsCommunityScreen() {

    }

    @Override
    public void openCreateQuestionScreen() {

    }

    @Override
    public void openCourseScreen() {

    }

    @Override
    public void openQuizScreen() {

    }

    @Override
    public void openCreatePostScreen() {

    }

    @Override
    public void openEcommerceScreen() {

    }

    @Override
    public void openListFriendScreen() {

    }

    @Override
    public void openExpandScreen() {

    }

    @Override
    public void showBanner() {
        //todo
    }

    @Override
    public void showFeaturedQuestions(FeaturedQuestionResponse response) {
        List<FeaturedQuestion> list = response.getFeaturedQuestionList();
        featuredQuestionAdapter = new FeaturedQuestionAdapter(requireContext(), list);
        binding.featuredQuestions.rcv.setAdapter(featuredQuestionAdapter);
    }

    @Override
    public void showTrendingPosts(TrendPostResponse response) {
        List<TrendPost> trendPostList = response.getTrendPostList();
        trendingPostAdapter = new TrendingPostAdapter(trendPostList, requireContext());
        binding.trendingPosts.rcv.setAdapter(trendingPostAdapter);
    }
}
