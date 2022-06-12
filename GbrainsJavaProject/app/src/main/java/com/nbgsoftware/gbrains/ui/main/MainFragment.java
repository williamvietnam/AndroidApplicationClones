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

    //Banner quảng cáo các tính năng, bài giảng đánh giá cao (auto run chạy từ trái sang phải)

    /**
     * Menu Nav center:
     * 1. Cộng đồng Gbrains (chứa các bài đăng câu hỏi về công nghệ thông tin kèm câu trả lời tương tự stackoverflow)
     * 2. Tạo câu hỏi đăng trên phần cộng đồng Gbrains
     * 3. Các khóa học trực tuyến (gồm video và bài viết học thuật) --> video sẽ do đội ngũ phát triển tự làm rồi chia sẻ còn bài viết thì các cá nhân dev sử dụng app cũng có thể viết và chia sẻ
     * 4. Bài kiểm tra trắc nghiệm (tích hợp các chức năng luyện thuật toán)
     * 5. Viết các bài viết học thuật chia sẻ lên số 3
     * 6. Thương mại điện tử (bán các thức do các user tham gia cộng đồng Gbrains đăng)
     * 7. Danh sách bạn bè, click vào user có thể xem dc profile của bạn bà, call video và chatting
     * 8. Nút mở rộng xem tất cả các chức năng của app (nếu sau này dev thêm nhiều chức năng sẽ click vào đây để xem và sử dụng thêm)
     * */

    // các bài viết học thuật thịnh hành (Danh sách nằm ngang)

    // các câu hỏi nổi bật trên cộng đồng gbrains (Danh sách dọc)

    /**
     * Bottom Nav:
     * 1. Cộng đồng Gbrains (chứa các bài đăng câu hỏi về công nghệ thông tin kèm câu trả lời tương tự stackoverflow)
     * 2. Tạo câu hỏi đăng trên phần cộng đồng Gbrains
     * 3. Các khóa học trực tuyến
     * 4. Bài kiểm tra trắc nghiệm (tích hợp các chức năng luyện thuật toán)
     * 5. Hồ sơ cá nhân
     * */
}
