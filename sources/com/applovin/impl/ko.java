package com.applovin.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.ug;

final class ko extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ug.a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f9062a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private final PointF f9063b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private final a f9064c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9065d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f9066e;

    /* renamed from: f  reason: collision with root package name */
    private volatile float f9067f;

    public interface a {
        void a(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public ko(Context context, a aVar, float f10) {
        this.f9064c = aVar;
        this.f9065d = f10;
        this.f9066e = new GestureDetector(context, this);
        this.f9067f = 3.1415927f;
    }

    public void a(float[] fArr, float f10) {
        this.f9067f = -f10;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f9062a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f9062a.x) / this.f9065d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f9062a;
        float f12 = (y10 - pointF.y) / this.f9065d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = (double) this.f9067f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f9063b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f9064c.a(this.f9063b);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f9064c.onSingleTapUp(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9066e.onTouchEvent(motionEvent);
    }
}
