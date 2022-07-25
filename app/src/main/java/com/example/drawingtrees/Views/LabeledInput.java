package com.example.drawingtrees.Views;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.example.drawingtrees.R;

public class LabeledInput extends LinearLayout {
    private String inputText;

    public LabeledInput(Context context, String labelValue) {
        super(context);

        setOrientation(VERTICAL);
        setPadding(8,8,8,8);

        AppCompatTextView label = new AppCompatTextView(context);
        AppCompatEditText input = new AppCompatEditText(context);

        inputText = input.getText().toString();

        LayoutParams params = new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT
        );

        label.setText(labelValue);
        label.setTextSize(18);
        label.setLayoutParams(params);
        label.setTextColor(ResourcesCompat.getColor(getResources(), R.color.Cream, null));

        input.setLines(1);
        input.setLayoutParams(params);
        input.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.sunriseYellow, null));
        input.setTextColor(ResourcesCompat.getColor(getResources(), R.color.Cream, null));


        addView(label);
        addView(input);
        setLayoutParams(params);
    }

    public String getText() {
        return inputText;
    }
}
