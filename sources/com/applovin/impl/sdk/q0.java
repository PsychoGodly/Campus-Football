package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f12020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppLovinUserService.OnConsentDialogDismissListener f12021b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f12022c;

    public /* synthetic */ q0(j jVar, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener, Activity activity) {
        this.f12020a = jVar;
        this.f12021b = onConsentDialogDismissListener;
        this.f12022c = activity;
    }

    public final void run() {
        this.f12020a.a(this.f12021b, this.f12022c);
    }
}
