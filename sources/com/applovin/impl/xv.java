package com.applovin.impl;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class xv implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cr f13454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f13455b;

    public /* synthetic */ xv(cr crVar, View view) {
        this.f13454a = crVar;
        this.f13455b = view;
    }

    public final boolean onPreDraw() {
        return this.f13454a.a(this.f13455b);
    }
}
