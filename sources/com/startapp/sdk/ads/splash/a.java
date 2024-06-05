package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;

/* compiled from: Sta */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f16605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CacheKey f16606b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashEventHandler f16607c;

    public a(SplashEventHandler splashEventHandler, Runnable runnable, CacheKey cacheKey) {
        this.f16607c = splashEventHandler;
        this.f16605a = runnable;
        this.f16606b = cacheKey;
    }

    public void run() {
        SplashEventHandler splashEventHandler = this.f16607c;
        splashEventHandler.f16574h = true;
        if (splashEventHandler.f16575i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            splashEventHandler.a(this.f16605a, this.f16606b);
        }
    }
}
