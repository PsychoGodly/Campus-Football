package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n90 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f9954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f9955b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f9956c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f9957d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f9958f;

    public /* synthetic */ n90(WeakReference weakReference, b bVar, k kVar, Context context, boolean z10) {
        this.f9954a = weakReference;
        this.f9955b = bVar;
        this.f9956c = kVar;
        this.f9957d = context;
        this.f9958f = z10;
    }

    public final void run() {
        zp.a(this.f9954a, this.f9955b, this.f9956c, this.f9957d, this.f9958f);
    }
}
