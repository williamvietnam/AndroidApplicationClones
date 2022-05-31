package com.nbgsoftware.gbrains.ui.container;

import com.nbgsoftware.gbrains.base.BaseActivity;
import com.nbgsoftware.gbrains.databinding.ActivityContainerBinding;

public class ContainerActivity extends BaseActivity<ActivityContainerBinding> {

    @Override
    protected ActivityContainerBinding getActivityBinding() {
        return ActivityContainerBinding.inflate(getLayoutInflater());
    }
}