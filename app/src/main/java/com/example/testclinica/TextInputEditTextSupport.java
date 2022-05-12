package com.example.testclinica;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

import com.google.android.material.textfield.TextInputEditText;

public class TextInputEditTextSupport extends TextInputEditText {

    public TextInputEditTextSupport(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            clearFocus();
            ViewUtil.hideKeyboardFrom(getContext(),this);
            return true;
        }
        return false;
    }
}