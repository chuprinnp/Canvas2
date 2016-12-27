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

    public CannonView(Context context) {
        super(context);
        paint.setColor(0xFF0000FF);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int w = getWidth();
        int h = getHeight();
        canvas.drawCircle(w/2, h/2, h/4, paint);
        invalidate();
    }
}
