package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import com.startapp.y7;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f16614a;

    public e(SplashScreen splashScreen) {
        this.f16614a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f16614a;
        SplashEventHandler splashEventHandler = splashScreen.f16590b;
        Runnable runnable = splashScreen.f16599k;
        AtomicReference<CacheKey> atomicReference = splashScreen.f16592d;
        splashEventHandler.f16569c = true;
        if (splashEventHandler.f16575i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            y7 y7Var = new y7(splashEventHandler, runnable, atomicReference);
            synchronized (MetaData.f17063d) {
                if (MetaData.f17070k.f17073b) {
                    y7Var.a((MetaDataRequest.RequestReason) null, false);
                } else {
                    MetaData.f17070k.a((c) y7Var);
                }
            }
            return;
        }
        splashEventHandler.c();
    }
}
