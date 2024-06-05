package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.x3;
import com.applovin.sdk.AppLovinSdkUtils;

public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final long f6377a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6378b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6379c;

    /* renamed from: d  reason: collision with root package name */
    private final ClickRecognitionState f6380d;

    /* renamed from: e  reason: collision with root package name */
    private long f6381e;

    /* renamed from: f  reason: collision with root package name */
    private PointF f6382f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6383g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f6384h;

    /* renamed from: i  reason: collision with root package name */
    private final OnClickListener f6385i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(k kVar, oj ojVar, Context context, OnClickListener onClickListener) {
        this.f6377a = ((Long) kVar.a(oj.f10448y0)).longValue();
        this.f6378b = ((Integer) kVar.a(oj.f10456z0)).intValue();
        this.f6379c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.E0)).intValue());
        this.f6380d = ClickRecognitionState.values()[((Integer) kVar.a(ojVar)).intValue()];
        this.f6384h = context;
        this.f6385i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f6385i.onClick(view, motionEvent);
        this.f6383g = true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f6383g && this.f6380d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f6383g && this.f6380d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f6380d == ClickRecognitionState.DISABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6381e;
                float a10 = a(this.f6382f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f6383g) {
                    long j10 = this.f6377a;
                    if ((j10 < 0 || elapsedRealtime < j10) && ((i10 = this.f6378b) < 0 || a10 < ((float) i10))) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f6380d != ClickRecognitionState.ACTION_DOWN) {
            this.f6381e = SystemClock.elapsedRealtime();
            this.f6382f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f6383g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((double) ((f10 * f10) + (f11 * f11))));
    }

    private float a(float f10) {
        return f10 / this.f6384h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f6379c <= 0) {
            return true;
        }
        Point b10 = x3.b(this.f6384h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f6379c;
        float f10 = (float) i10;
        if (rawX < f10 || rawY < f10 || rawX > ((float) (b10.x - i10)) || rawY > ((float) (b10.y - i10))) {
            return false;
        }
        return true;
    }
}
