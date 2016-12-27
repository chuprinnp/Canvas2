package com.example.falyanguzov.canvas2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by falyanguzov on 27.12.2016.
 */
public class CannonView extends View {
    private Paint paint = new Paint();
    private float x=1;
    private int direction = 1;
    private int w;
    private float velocity;
    private int h;
    private boolean isFirstFrame = true;
    private float y;

    public CannonView(Context context) {
        super(context);
        paint.setColor(0xFF0000FF);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.w = getWidth();
        velocity = this.w / 5.0f / 60;
        this.h = getHeight();
        isFirstFrame = false;
        x = this.w/2.0f;
        y = this.h/2.0f;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(x<=0 || x>=w)
            direction *=-1;
        x += velocity*direction;
        canvas.drawCircle(x, y, h/4, paint);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        return super.onTouchEvent(event);
    }
}
