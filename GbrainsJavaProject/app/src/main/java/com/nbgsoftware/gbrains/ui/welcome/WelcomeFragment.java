package com.nbgsoftware.gbrains.ui.welcome;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;

import com.nbgsoftware.gbrains.adapters.SlideWelcomeAdapter;
import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.data.models.response.WelcomeResponse;
import com.nbgsoftware.gbrains.databinding.FragmentWelcomeBinding;

public class WelcomeFragment extends MVPFragment<FragmentWelcomeBinding> implements WelcomeContract.View {

    WelcomeContract.Presenter<WelcomeContract.View> presenter = new WelcomePresenter<>();
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };

    @Override
    public FragmentWelcomeBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentWelcomeBinding.inflate(inflater, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        presenter.onAttach(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.onViewCreated();
        presenter.getData(requireContext());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showData(WelcomeResponse response) {
        SlideWelcomeAdapter adapter = new SlideWelcomeAdapter(response, requireContext());
        binding.viewPager2.setAdapter(adapter);
        binding.indicator3.setViewPager(binding.viewPager2);

        binding.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

            }
        });
    }
}
