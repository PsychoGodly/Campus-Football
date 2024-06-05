package com.applovin.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z60 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w4 f13801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f13802b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f13803c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f13804d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f13805f;

    public /* synthetic */ z60(w4 w4Var, View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f13801a = w4Var;
        this.f13802b = view;
        this.f13803c = frameLayout;
        this.f13804d = viewTreeObserver;
        this.f13805f = onGlobalLayoutListener;
    }

    public final void run() {
        this.f13801a.a(this.f13802b, this.f13803c, this.f13804d, this.f13805f);
    }
}
