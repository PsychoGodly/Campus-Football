package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* compiled from: Sta */
public class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BannerListener f16163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16164b;

    public n0(BannerListener bannerListener, View view, Context context) {
        this.f16163a = bannerListener;
        this.f16164b = view;
    }

    public void run() {
        try {
            this.f16163a.onImpression(this.f16164b);
        } catch (Throwable th) {
            j9.a((Object) this.f16163a, th);
        }
    }
}
