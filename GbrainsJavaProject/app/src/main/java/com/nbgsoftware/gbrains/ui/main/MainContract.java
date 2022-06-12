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

        void showFeaturedQuestions();

        void showTrendingPosts();
    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V> {
        void getDataFromAssetsFeaturedQuestion();

        void getDataFromAssetsTrendingPost();
    }
}
