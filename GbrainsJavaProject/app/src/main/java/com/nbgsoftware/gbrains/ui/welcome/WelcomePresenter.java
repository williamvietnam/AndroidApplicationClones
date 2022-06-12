package com.nbgsoftware.gbrains.ui.welcome;

import android.content.Context;

import com.google.gson.Gson;
import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;
import com.nbgsoftware.gbrains.data.models.Welcome;
import com.nbgsoftware.gbrains.data.models.response.WelcomeResponse;
import com.nbgsoftware.gbrains.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class WelcomePresenter<V extends WelcomeContract.View>
        extends MVPPresenter<V> implements WelcomeContract.Presenter<V> {

    /**
     * Cách 1: Sử dụng Gson để lấy data từ tệp assets
     */
    @Override
    public void getDataFromAssets(Context context) {
        if (getView() != null) {
            String json = Utils.getJsonFromAssets("welcome.json", context);
            Gson gson = new Gson();
            WelcomeResponse response = gson.fromJson(json, WelcomeResponse.class);
            getView().showData(response);
        }
    }

    /**
     * Cách 2: Lấy data từ tệp tài nguyên có sẵn trong app
     */
    @Override
    public void getDataFromLocalResource() {
        List<Welcome> welcomeList = new ArrayList<>();

        welcomeList.add(new Welcome(
                "Trao đổi và Chia sẻ",
                R.drawable.thumbnail_welcome_1,
                "Xây dựng cộng đồng công nghệ thông tin cùng nhau trao đổi và chia sẻ kiến thức trên nền tảng di động")
        );
        welcomeList.add(new Welcome(
                "Học tập và Kiểm tra",
                R.drawable.thumbnail_welcome_2,
                "Đội ngũ phát triển liên tục cập nhật các bài giảng và bộ câu hỏi kiểm tra kiến thức mới nhất và nhanh nhất")
        );
        welcomeList.add(new Welcome("Học tập như giải trí",
                R.drawable.thumbnail_welcome_3,
                "Hoàn thành xuất sắc bài kiểm tra sẽ được điểm thưởng và xếp hạng trong bảng xếp hạng của cộng đồng Gbrains")
        );

        WelcomeResponse welcomeResponse = new WelcomeResponse(welcomeList);
        if (getView() != null) {
            getView().showData(welcomeResponse);
        }
    }
}
