package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.adview.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ot implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b5 f10539a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10540b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f10541c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f10542d;

    public /* synthetic */ ot(b5 b5Var, a aVar, Activity activity, String str) {
        this.f10539a = b5Var;
        this.f10540b = aVar;
        this.f10541c = activity;
        this.f10542d = str;
    }

    public final void run() {
        this.f10539a.a(this.f10540b, this.f10541c, this.f10542d);
    }
}
