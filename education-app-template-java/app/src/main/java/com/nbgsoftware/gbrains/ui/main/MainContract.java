package com.nbgsoftware.gbrains.ui.main;

import android.content.Context;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;
import com.nbgsoftware.gbrains.data.models.response.FeaturedQuestionResponse;
import com.nbgsoftware.gbrains.data.models.response.TrendPostResponse;

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

        void showFeaturedQuestions(FeaturedQuestionResponse response);

        void showTrendingPosts(TrendPostResponse response);
    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V> {
        void getDataForBannerFromFirebase();

        void getDataForFeaturedQuestionFromFirebase();

        void getDataForTrendingPostFromFirebase();

        void getDataFromAssetsBanner(Context context);

        void getDataFromAssetsFeaturedQuestion(Context context);

        void getDataFromAssetsTrendingPost(Context context);
    }
}
