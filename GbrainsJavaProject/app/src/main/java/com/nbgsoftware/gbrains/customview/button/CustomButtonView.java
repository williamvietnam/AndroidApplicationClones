package com.nbgsoftware.gbrains.customview.button;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.nbgsoftware.gbrains.databinding.LayoutCustomButtonViewBinding;

public class CustomButtonView extends ConstraintLayout {
    private LayoutCustomButtonViewBinding binding;

    public CustomButtonView(@NonNull Context context) {
        super(context);
    }

    public CustomButtonView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButtonView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomButtonView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
