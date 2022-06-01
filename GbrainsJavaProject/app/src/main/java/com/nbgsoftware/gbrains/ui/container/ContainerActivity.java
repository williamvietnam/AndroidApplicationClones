package com.nbgsoftware.gbrains.ui.container;

import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.base.BaseActivity;
import com.nbgsoftware.gbrains.databinding.ActivityContainerBinding;

public class ContainerActivity extends BaseActivity<ActivityContainerBinding> {

    @Override
    protected ActivityContainerBinding getActivityBinding() {
        return ActivityContainerBinding.inflate(getLayoutInflater());
    }

    @Override
    public void initializeView() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        assert navHostFragment != null;
        NavController navController = navHostFragment.getNavController();
    }
}