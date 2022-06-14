package com.nbgsoftware.gbrains.custom.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.databinding.LayoutCustomEditTextBinding;

import java.util.Objects;

public class CustomEditText extends ConstraintLayout {

    private LayoutCustomEditTextBinding binding;
    private InterfaceOnClick iOnClick;
    private Context context;

    public CustomEditText(@NonNull Context context) {
        super(context);
        initialize(context, null);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    private void initialize(Context context, AttributeSet attrs) {
        binding = LayoutCustomEditTextBinding.inflate(
                LayoutInflater.from(context),
                this,
                true);

        if (attrs != null) {
            this.context = context;
            final TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.CustomEditText, 0, 0);
            showView(typedArray);
            showText(typedArray);
            textStyle(typedArray);
            maxLength(typedArray);
            inputType(typedArray);
            enableEditText(typedArray);

            typedArray.recycle();
        }

        binding.layoutEditText.setOnClickListener(view -> {
            if (iOnClick != null) {
                iOnClick.onClicked();
            }
        });
    }

    private void showView(@NonNull TypedArray typedArray) {
        // Hide/Show button delete text
        boolean isShowButtonDelete = typedArray.getBoolean(R.styleable.CustomEditText_showButtonDelete, false);
        if (isShowButtonDelete) {
            binding.btnDelete.setVisibility(VISIBLE);
        } else {
            binding.btnDelete.setVisibility(GONE);
        }
        // Hide/Show text unit
        boolean isShowUnit = typedArray.getBoolean(R.styleable.CustomEditText_showUnit, false);
        if (isShowUnit) {
            binding.tvUnit.setVisibility(VISIBLE);
        } else {
            binding.tvUnit.setVisibility(GONE);
        }
    }

    private void showText(@NonNull TypedArray typedArray) {
        String title = typedArray.getString(R.styleable.CustomEditText_textTitleEditText);
        binding.tvTitleInput.setText(title);

        String hint = typedArray.getString(R.styleable.CustomEditText_textHintEditText);
        binding.edtInput.setHint(hint);

        String unit = typedArray.getString(R.styleable.CustomEditText_textUnitEditText);
        binding.tvUnit.setText(unit);
    }

    private void textStyle(@NonNull TypedArray typedArray) {
        String titleStyle = typedArray.getString(R.styleable.CustomEditText_textTitleStyleEditText);
        if (Objects.equals(titleStyle, "bold")) {
            binding.tvTitleInput.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        } else if (Objects.equals(titleStyle, "italic")) {
            binding.tvTitleInput.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        } else if (Objects.equals(titleStyle, "normal")) {
            binding.tvTitleInput.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        } else {
            binding.tvTitleInput.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        }

        String hintStyle = typedArray.getString(R.styleable.CustomEditText_textHintStyleEditText);
        if (Objects.equals(hintStyle, "bold")) {
            binding.edtInput.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        } else if (Objects.equals(hintStyle, "italic")) {
            binding.edtInput.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        } else if (Objects.equals(hintStyle, "normal")) {
            binding.edtInput.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        } else {
            binding.edtInput.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        }

        String unitStyle = typedArray.getString(R.styleable.CustomEditText_textUnitStyleEditText);
        if (Objects.equals(unitStyle, "bold")) {
            binding.tvUnit.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        } else if (Objects.equals(unitStyle, "italic")) {
            binding.tvUnit.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        } else if (Objects.equals(unitStyle, "normal")) {
            binding.tvUnit.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        } else {
            binding.tvUnit.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        }
    }

    private void maxLength(@NonNull TypedArray typedArray) {
        int maxLength = typedArray.getInteger(R.styleable.CustomEditText_maxLengthEdiText, 50);
        binding.edtInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
    }

    private void inputType(@NonNull TypedArray typedArray) {
        String inputType = typedArray.getString(R.styleable.CustomEditText_inputTypeEditText);
        if (Objects.equals(inputType, "number")) {
            binding.edtInput.setInputType(InputType.TYPE_CLASS_NUMBER);
        } else if (Objects.equals(inputType, "phone")) {
            binding.edtInput.setInputType(InputType.TYPE_CLASS_PHONE);
        } else if (Objects.equals(inputType, "textPassword")) {
            binding.edtInput.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        } else if (Objects.equals(inputType, "numberPassword")) {
            binding.edtInput.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        } else if (Objects.equals(inputType, "text")) {
            binding.edtInput.setInputType(InputType.TYPE_CLASS_TEXT);
        } else {
            binding.edtInput.setInputType(InputType.TYPE_CLASS_TEXT);
        }
    }

    private void enableEditText(@NonNull TypedArray typedArray) {
        boolean isEnableEditText = typedArray.getBoolean(R.styleable.CustomEditText_enableEditText, true);
        binding.edtInput.setEnabled(isEnableEditText);
    }

    //----------------------------------------------------------------------------------------------

    public void setText(CharSequence text) {
        binding.edtInput.setText(text);
    }

    public void setText(String text) {
        binding.edtInput.setText(text);
    }

    public String getText() {
        return binding.edtInput.getText().toString().trim();
    }

    public void setTextColor(int color) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            binding.edtInput.setTextColor(context.getResources().getColor(color));
        } else {
            binding.edtInput.setTextColor(context.getResources().getColor(color, context.getTheme()));
        }
    }

    public void textChangeListener(){
        binding.edtInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable text) {
                binding.btnDelete.setVisibility(TextUtils.isEmpty(text.toString().trim()) ? View.GONE : View.VISIBLE);
                binding.edtInput.setBackgroundResource(R.drawable.background_edittext);
                //todo
            }
        });
    }

    public void showTextUnit(boolean isShow, String text){
        if (isShow) {
            binding.tvUnit.setVisibility(VISIBLE);
            binding.tvUnit.setText(text);
        } else {
            binding.tvUnit.setVisibility(GONE);
            binding.tvUnit.setText("");
        }
    }

    public interface InterfaceOnClick {
        void onClicked();
    }
}
