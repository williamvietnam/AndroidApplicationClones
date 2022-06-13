package com.nbgsoftware.gbrains.ui.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.databinding.FragmentMainBinding;

/**
 * Author: William Giang Nguyen | Date 12/06/2022
 * */
public class MainFragment extends MVPFragment<FragmentMainBinding> implements MainContract.View {

    @Override
    public FragmentMainBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
         return FragmentMainBinding.inflate(inflater, container, false);
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

    }

    @Override
    public void showFeaturedQuestions() {
        //todo
    }

    @Override
    public void showTrendingPosts() {
        //todo
    }
}
