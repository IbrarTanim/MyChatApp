package com.rokan.mychat.utilities;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

public class ShadowBackground {


    public static Bitmap drawShadow(Bitmap bitmap, int leftRightThk, int bottomThk, int padTop) {
        int w = bitmap.getWidth();
        int h = bitmap.getHeight();

        int newW = w - (leftRightThk * 2);
        int newH = h - (bottomThk + padTop);

        Bitmap.Config conf = Bitmap.Config.ARGB_8888;
        Bitmap bmp = Bitmap.createBitmap(w, h, conf);
        Bitmap sbmp = Bitmap.createScaledBitmap(bitmap, newW, newH, false);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Canvas c = new Canvas(bmp);

        // Left
        int leftMargin = (leftRightThk + 7) / 2;
        Shader lshader = new LinearGradient(0, 0, leftMargin, 0, Color.TRANSPARENT, Color.BLACK, Shader.TileMode.CLAMP);
        paint.setShader(lshader);
        c.drawRect(0, padTop, leftMargin, newH, paint);

        // Right
        Shader rshader = new LinearGradient(w - leftMargin, 0, w, 0, Color.BLACK, Color.TRANSPARENT, Shader.TileMode.CLAMP);
        paint.setShader(rshader);
        c.drawRect(newW, padTop, w, newH, paint);

        // Bottom
        Shader bshader = new LinearGradient(0, newH, 0, bitmap.getHeight(), Color.BLACK, Color.TRANSPARENT, Shader.TileMode.CLAMP);
        paint.setShader(bshader);
        c.drawRect(leftMargin - 3, newH, newW + leftMargin + 3, bitmap.getHeight(), paint);
        c.drawBitmap(sbmp, leftRightThk, 0, null);

        return bmp;
    }
}