package com.applovin.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v60 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w4 f12712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f12713b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12714c;

    public /* synthetic */ v60(w4 w4Var, View view, FrameLayout frameLayout) {
        this.f12712a = w4Var;
        this.f12713b = view;
        this.f12714c = frameLayout;
    }

    public final void onGlobalLayout() {
        this.f12712a.a(this.f12713b, this.f12714c);
    }
}
