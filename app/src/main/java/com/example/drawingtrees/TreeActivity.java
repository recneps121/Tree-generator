package com.example.drawingtrees;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.drawingtrees.Views.TreeDraw;

public class TreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        Intent fromMainIntent = getIntent();

        int Width = fromMainIntent.getIntExtra("Width", 0);
        int Length = fromMainIntent.getIntExtra("Length", 0);

        GradientDrawable sunriseBackground = new GradientDrawable(
                GradientDrawable.Orientation.BOTTOM_TOP,
                new int[] {
                        ResourcesCompat.getColor(getResources(), R.color.sunriseYellow, null),
                        ResourcesCompat.getColor(getResources(), R.color.midnightBlue, null)}
                );

        TreeDraw tree = new TreeDraw(this);
        tree.setBackground(sunriseBackground);

        mainLayout.addView(tree);

        setContentView(mainLayout);
    }
}