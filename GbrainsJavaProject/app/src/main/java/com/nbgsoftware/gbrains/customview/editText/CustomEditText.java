package com.nbgsoftware.gbrains.customview.editText;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.nbgsoftware.gbrains.databinding.LayoutCustomEditTextBinding;

public class CustomEditText extends ConstraintLayout {
    private LayoutCustomEditTextBinding binding;

    public CustomEditText(@NonNull Context context) {
        super(context);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
