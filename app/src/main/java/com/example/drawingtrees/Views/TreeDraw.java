package com.example.drawingtrees.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.example.drawingtrees.Tree;


public class TreeDraw extends View {

    int width;
    int length;
    Tree drawTree = new Tree(0);
    Paint paint = new Paint();



    public TreeDraw(Context context) { super(context); }

    public TreeDraw(Context context, int width, int length) {
        super(context);

        this.width = width;
        this.length = length;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setStrokeWidth(10);
        draw(canvas, width/2, length, 90);
    }

    private void draw(Canvas canvas, int width, int length, int angle) {
        int endX = (int)(width + Math.cos(Math.toRadians(angle)) * length);
        int endY = (int)(length + Math.sin(Math.toRadians(angle)) * length);
        canvas.drawLine(width, length, endX, endY, paint);
        draw(canvas, endX, endY, 120);
        draw(canvas, endX, endY, 60);
    }
}
