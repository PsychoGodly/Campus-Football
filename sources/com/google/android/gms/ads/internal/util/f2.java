package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class f2 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f14799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f14800b;

    public /* synthetic */ f2(g2 g2Var, Activity activity) {
        this.f14799a = g2Var;
        this.f14800b = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return g2.n(this.f14800b, view, windowInsets);
    }
}
