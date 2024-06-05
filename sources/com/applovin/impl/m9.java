package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.g;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;

abstract class m9 {

    /* renamed from: a  reason: collision with root package name */
    final k f9327a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f9328b;

    /* renamed from: c  reason: collision with root package name */
    final b f9329c;

    /* renamed from: d  reason: collision with root package name */
    final ViewGroup f9330d;

    /* renamed from: e  reason: collision with root package name */
    final FrameLayout.LayoutParams f9331e;

    m9(b bVar, Activity activity, k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f9331e = layoutParams;
        this.f9329c = bVar;
        this.f9327a = kVar;
        this.f9328b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f9330d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(g gVar) {
        if (gVar != null && gVar.getParent() == null) {
            a(this.f9329c.l(), (this.f9329c.y0() ? 3 : 5) | 48, gVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b.d dVar, int i10, g gVar) {
        gVar.a(dVar.f11504a, dVar.f11508e, dVar.f11507d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f11506c;
        layoutParams.setMargins(i11, dVar.f11505b, i11, 0);
        layoutParams.gravity = i10;
        this.f9330d.addView(gVar, layoutParams);
    }

    public void a(View view) {
        this.f9330d.removeView(view);
    }
}
