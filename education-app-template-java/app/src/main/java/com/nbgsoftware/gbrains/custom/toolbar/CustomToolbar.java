package com.nbgsoftware.gbrains.custom.toolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.databinding.LayoutCustomToolbarBinding;

public class CustomToolbar extends LinearLayout {

    private Context context;
    private LayoutCustomToolbarBinding binding;
    private IOnIconLeftClick iLeftClick;
    private IOnIconRightClick iRightClick;

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
        this.context = context;
        binding = LayoutCustomToolbarBinding.inflate(
                LayoutInflater.from(context),
                this,
                true);

        binding.buttonLeft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (iLeftClick!= null){
                    iLeftClick.onIconLeftClick();
                }
            }
        });

        binding.buttonRight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (iRightClick != null){
                    iRightClick.onIconRightClick();
                }
            }
        });

        if (attrs != null) {
            final TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.CustomToolbar, 0, 0);

            setUpTextToolbar(typedArray);
            setUpButtonLeftToolbar(typedArray);
            setUpButtonRightToolbar(typedArray);

            typedArray.recycle();
        }
    }

    private void setUpTextToolbar(@NonNull TypedArray typedArray) {
        String textToolbar = typedArray.getString(R.styleable.CustomToolbar_textToolbar);
        binding.tvNameToolbar.setText(textToolbar);

        float textSize = typedArray.getFloat(R.styleable.CustomToolbar_textToolbarSize, com.intuit.ssp.R.dimen._23ssp);
        binding.tvNameToolbar.setTextSize(textSize);

        int textColor = typedArray.getInt(R.styleable.CustomToolbar_textToolbarColor, R.color.primary);
        binding.tvNameToolbar.setTextColor(textColor);
    }

    private void setUpButtonLeftToolbar(@NonNull TypedArray typedArray) {
        boolean isShowButtonLeft = typedArray.getBoolean(R.styleable.CustomToolbar_showButtonLeft, false);
        if (isShowButtonLeft) {
            binding.buttonLeft.setVisibility(VISIBLE);
        } else {
            binding.buttonLeft.setVisibility(GONE);
        }

        int srcLeft = typedArray.getResourceId(R.styleable.CustomToolbar_srcLeft, R.drawable.ic_back);
        binding.buttonLeft.setImageResource(srcLeft);
    }

    private void setUpButtonRightToolbar(@NonNull TypedArray typedArray) {
        boolean isShowButtonRight = typedArray.getBoolean(R.styleable.CustomToolbar_showButtonRight, false);
        if (isShowButtonRight) {
            binding.buttonRight.setVisibility(VISIBLE);
        } else {
            binding.buttonRight.setVisibility(GONE);
        }

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

    public void setUpTextToolbar(String textToolbar) {
        binding.tvNameToolbar.setText(textToolbar);
    }

    public interface IOnIconRightClick {
        void onIconRightClick();
    }

    public interface IOnIconLeftClick {
        void onIconLeftClick();
    }
}
