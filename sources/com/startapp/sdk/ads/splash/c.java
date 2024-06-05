package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.d;

/* compiled from: Sta */
public class c implements d.C0170d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f16612a;

    public c(SplashScreen splashScreen) {
        this.f16612a = splashScreen;
    }

    public void a(Ad ad2, CacheKey cacheKey, boolean z10) {
        this.f16612a.f16592d.set(cacheKey);
        if (z10) {
            SplashScreen splashScreen = this.f16612a;
            SplashEventHandler splashEventHandler = splashScreen.f16590b;
            Runnable runnable = splashScreen.f16599k;
            if (splashEventHandler.f16575i == SplashEventHandler.SplashState.LOADING) {
                splashEventHandler.f16575i = SplashEventHandler.SplashState.RECEIVED;
            }
            splashEventHandler.a(runnable);
            return;
        }
        SplashScreen splashScreen2 = this.f16612a;
        if (splashScreen2.f16596h != null) {
            SplashEventHandler splashEventHandler2 = splashScreen2.f16590b;
            splashEventHandler2.f16575i = SplashEventHandler.SplashState.DO_NOT_DISPLAY;
            splashEventHandler2.a((Runnable) null);
        }
    }
}
