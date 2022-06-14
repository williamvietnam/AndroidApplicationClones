package com.nbgsoftware.gbrains.custom.toolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.databinding.LayoutCustomToolbarBinding;

public class CustomToolbar extends LinearLayout {

    private LayoutCustomToolbarBinding binding;
    private Context context;

    public CustomToolbar(Context context) {
        super(context);
        initialize(context, null);
    }

    public CustomToolbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs);
    }

    public CustomToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    private void initialize(Context context, AttributeSet attrs) {
        binding = LayoutCustomToolbarBinding.inflate(
                LayoutInflater.from(context),
                this,
                true);

        if (attrs != null) {
            this.context = context;
            final TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.CustomToolbar, 0, 0);

            setTextToolbar(typedArray);

            typedArray.recycle();
        }
    }

    private void setTextToolbar(@NonNull TypedArray typedArray){
        String textToolbar = typedArray.getString(R.styleable.CustomToolbar_textToolbar);
        binding.tvNameToolbar.setText(textToolbar);
    }
    //----------------------------------------------------------------------------------------------

    public void setBackgroundToolbar(int resource) {
        binding.getRoot().setBackgroundResource(resource);
    }

    public void showButtonLeft(boolean isShow, int resource) {
        if (isShow) {
            binding.buttonLeft.setVisibility(VISIBLE);
            binding.buttonLeft.setImageResource(resource);
        } else {
            binding.buttonLeft.setVisibility(GONE);
        }
    }

    public void showButtonRight(boolean isShow, int resource) {
        if (isShow) {
            binding.cvRight.setVisibility(VISIBLE);
            binding.buttonRight.setImageResource(resource);
        } else {
            binding.cvRight.setVisibility(GONE);
        }
    }

    public void setTextToolbar(String textToolbar) {
        binding.tvNameToolbar.setText(textToolbar);
    }
}
