package com.example.drawingtrees;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;


import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.drawingtrees.Views.LabeledInput;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);

        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.midnightBlue, null));

        LabeledInput widthInput = new LabeledInput(this, "Width: ");
        LabeledInput lengthInput = new LabeledInput(this, "Length: ");
        AppCompatButton submit = new AppCompatButton(this);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        submit.setText("ENTER");
        submit.setTextSize(18);
        submit.setLayoutParams(params);
        submit.setOnClickListener(view -> {

            Intent changeActivity = new Intent(this, TreeActivity.class);

            int width = parseInt(widthInput.getText());
            int length = parseInt(lengthInput.getText());
            changeActivity.putExtra("width", width);
            changeActivity.putExtra("length", length);

            startActivity(changeActivity);

        });

        mainLayout.addView(widthInput);
        mainLayout.addView(lengthInput);
        mainLayout.addView(submit);
        setContentView(mainLayout);
    }
}