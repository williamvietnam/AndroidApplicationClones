package com.nbgsoftware.gbrains.custom.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.databinding.LayoutCustomButtonViewBinding;
import com.nbgsoftware.gbrains.databinding.LayoutCustomEditTextBinding;

public class CustomButtonView extends ConstraintLayout {

    private LayoutCustomButtonViewBinding binding;
    private InterfaceOnClick iOnClick;
    private Context context;

    public CustomButtonView(@NonNull Context context) {
        super(context);
        initialize(context, null);
    }

    public CustomButtonView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs);
    }

    public CustomButtonView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    private void initialize(Context context, AttributeSet attrs){
        binding = LayoutCustomButtonViewBinding.inflate(
                LayoutInflater.from(context),
                this,
                true);

        if (attrs != null){
            this.context = context;
            final TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.CustomEditText, 0, 0);

            //Todo

            typedArray.recycle();
        }

        binding.layoutButton.setOnClickListener(view -> {
            if (iOnClick != null) {
                iOnClick.onClicked();
            }
        });
    }

    //Các phương thức private viết tại đây


    //-----------------------------------------------------------------------------------------------

    //Các phương thức public viết tại đây


    public interface InterfaceOnClick{
        void onClicked();
    }
}
