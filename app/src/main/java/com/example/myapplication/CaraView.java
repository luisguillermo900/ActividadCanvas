package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class CaraView extends View {

    private Paint paint;

    public CaraView(Context context) {
        super(context);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        float centerX = getWidth() / 2;
        float centerY = getHeight() / 2;
        float faceRadius = 200;

        //paint.setColor(Color.YELLOW)

        canvas.drawCircle(centerX, centerY, faceRadius, paint);

        //ojos
        float eyeRadius = 30;
        float eyeOffsetX = 70;
        float eyeOffsetY = 60;

        paint.setColor(Color.BLACK);
        canvas.drawCircle(centerX - eyeOffsetX, centerY - eyeOffsetY, eyeRadius, paint);
        canvas.drawCircle(centerX + eyeOffsetX, centerY - eyeOffsetY, eyeRadius, paint);

        //boca
        paint.setColor(Color.RED);
        RectF mouthRect = new RectF(centerX - 100, centerY, centerX + 100, centerY + 100);
        canvas.drawArc(mouthRect, 0, 180, false, paint);
    }
}
