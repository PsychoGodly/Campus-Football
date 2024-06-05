package com.applovin.impl;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u60 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w4 f12532a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12533b;

    public /* synthetic */ u60(w4 w4Var, FrameLayout frameLayout) {
        this.f12532a = w4Var;
        this.f12533b = frameLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f12532a.a(this.f12533b, view, motionEvent);
    }
}
