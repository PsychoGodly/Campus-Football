package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class q1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s1 f14858a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14859b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f14860c = AppLovinMediationProvider.ADMOB;

    public /* synthetic */ q1(s1 s1Var, Context context, String str) {
        this.f14858a = s1Var;
        this.f14859b = context;
    }

    public final void run() {
        this.f14858a.t(this.f14859b, this.f14860c);
    }
}
