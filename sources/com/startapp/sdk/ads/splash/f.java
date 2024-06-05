package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;

/* compiled from: Sta */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f16615a;

    public f(SplashScreen splashScreen) {
        this.f16615a = splashScreen;
    }

    public void run() {
        SplashScreen splashScreen = this.f16615a;
        SplashEventHandler splashEventHandler = splashScreen.f16590b;
        SplashScreen.SplashStartAppAd splashStartAppAd = splashScreen.f16596h;
        if (splashEventHandler.f16575i == SplashEventHandler.SplashState.DISPLAYED && !splashEventHandler.f16572f) {
            splashStartAppAd.close();
            splashEventHandler.f16575i = SplashEventHandler.SplashState.HIDDEN;
            splashEventHandler.b();
        }
    }
}
