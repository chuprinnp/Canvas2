package com.example.falyanguzov.canvas2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by falyanguzov on 27.12.2016.
 */
public class CannonView extends View {
    private Paint paint = new Paint();
    private float x=1;
    private int direction = 1;

    public CannonView(Context context) {
        super(context);
        paint.setColor(0xFF0000FF);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int w = getWidth();
        float velocity = w/5.0f/60;
        int h = getHeight();
        if(x<=0 || x>=w)
            direction *=-1;
        x += velocity*direction;
        canvas.drawCircle(x, h/2, h/4, paint);
        invalidate();
    }
}
