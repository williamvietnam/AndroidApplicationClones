package com.nbgsoftware.gbrains.ui.main;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;

public interface MainContract {
    interface View extends MVPContract.View {
        void openGbrainsCommunityScreen();

        void openCreateQuestionScreen();

        void openCourseScreen();

        void openQuizScreen();

        void openCreatePostScreen();

        void openEcommerceScreen();

        void openListFriendScreen();

        void openExpandScreen();

        void showBanner();

        void showFeaturedQuestions();

        void showTrendingPosts();
    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V> {
        void getDataForBannerFromFirebase();

        void getDataForFeaturedQuestionFromFirebase();

        void getDataForTrendingPostFromFirebase();

        void getDataFromAssetsBanner();

        void getDataFromAssetsFeaturedQuestion();

        void getDataFromAssetsTrendingPost();
    }
}
