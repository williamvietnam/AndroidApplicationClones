package com.nbgsoftware.gbrains.ui.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.databinding.FragmentMainBinding;

public class MainFragment extends MVPFragment<FragmentMainBinding> implements MainContract.View {

    @Override
    public FragmentMainBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
         return FragmentMainBinding.inflate(inflater, container, false);
    }
}
