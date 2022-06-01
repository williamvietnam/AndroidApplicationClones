package com.nbgsoftware.gbrains.ui.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nbgsoftware.gbrains.base.BaseFragment;
import com.nbgsoftware.gbrains.databinding.FragmentMainBinding;

public class MainFragment extends BaseFragment<FragmentMainBinding> implements MainContract.View {


    @Override
    public FragmentMainBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
         return FragmentMainBinding.inflate(inflater, container, false);
    }

    @Override
    public void initializeView() {

    }
}
