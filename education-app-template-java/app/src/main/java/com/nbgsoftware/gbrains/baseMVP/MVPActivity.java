package com.nbgsoftware.gbrains.baseMVP;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.nbgsoftware.gbrains.GbrainsApp;
import com.nbgsoftware.gbrains.di.component.ActivityComponent;
import com.nbgsoftware.gbrains.di.component.DaggerActivityComponent;
import com.nbgsoftware.gbrains.di.module.ActivityModule;
import com.nbgsoftware.gbrains.utils.NetworkUtils;

public abstract class MVPActivity<VB extends ViewBinding>
        extends AppCompatActivity implements BaseActivityView {

    public VB binding;

    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((GbrainsApp) getApplication()).getComponent())
                .build();

        binding = getActivityBinding();
        setContentView(binding.getRoot());
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }


    @Override
    public void showMessage(String message) {
        if (message != null) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showMessage(int resId) {
        showMessage(getString(resId));
    }

    @Override
    public boolean isNetworkConnected() {
        return NetworkUtils.isNetworkConnected(getApplicationContext());
    }

    @Override
    public void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        View view = this.getCurrentFocus();
        if (view == null) {
            view = findViewById(android.R.id.content).getRootView();
        }

        if (view != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public abstract VB getActivityBinding();
}
