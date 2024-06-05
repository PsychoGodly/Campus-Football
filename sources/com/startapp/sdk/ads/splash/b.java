package com.startapp.sdk.ads.splash;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.startapp.k2;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.w4;
import java.io.Serializable;

/* compiled from: Sta */
public class b extends k2 {

    /* renamed from: w  reason: collision with root package name */
    public SplashConfig f16608w = null;

    /* renamed from: x  reason: collision with root package name */
    public SplashScreen f16609x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f16610y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16611z = false;

    public boolean a(int i10, KeyEvent keyEvent) {
        if (this.f16610y) {
            if (i10 == 25) {
                if (!this.f16611z) {
                    this.f16611z = true;
                    SplashScreen splashScreen = this.f16609x;
                    splashScreen.f16595g = true;
                    splashScreen.f16590b.f16573g = true;
                    Toast.makeText(this.f15996b, "Test Mode", 0).show();
                    return true;
                }
            } else if (i10 == 24 && this.f16611z) {
                this.f15996b.finish();
                return true;
            }
        }
        return i10 == 4;
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
        AdPreferences adPreferences;
        if (this.f16608w != null) {
            Serializable serializableExtra = this.f15995a.getSerializableExtra("AdPreference");
            if (serializableExtra != null) {
                adPreferences = (AdPreferences) serializableExtra;
            } else {
                adPreferences = new AdPreferences();
            }
            this.f16610y = this.f15995a.getBooleanExtra("testMode", false);
            SplashScreen splashScreen = new SplashScreen(this.f15996b, this.f16608w, adPreferences);
            this.f16609x = splashScreen;
            SplashEventHandler splashEventHandler = splashScreen.f16590b;
            w4.a(splashEventHandler.f16567a).a(splashEventHandler.f16577k, new IntentFilter("com.startapp.android.adInfoWasClickedBroadcastListener"));
            if (!splashScreen.c()) {
                splashScreen.f16594f.post(splashScreen.f16598j);
            } else {
                splashScreen.f16594f.postDelayed(splashScreen.f16598j, 100);
            }
        }
    }

    public void g() {
        SplashEventHandler.SplashState splashState;
        SplashScreen splashScreen = this.f16609x;
        if (splashScreen != null) {
            splashScreen.f16594f.removeCallbacks(splashScreen.f16598j);
            SplashEventHandler splashEventHandler = splashScreen.f16590b;
            SplashEventHandler.SplashState splashState2 = splashEventHandler.f16575i;
            if (splashState2 != SplashEventHandler.SplashState.DISPLAYED && splashState2 != (splashState = SplashEventHandler.SplashState.DO_NOT_DISPLAY)) {
                splashEventHandler.f16575i = splashState;
                if (splashEventHandler.f16570d) {
                    splashEventHandler.b();
                }
            }
        }
    }

    public void h() {
    }

    public void a(Bundle bundle) {
        this.f16608w = (SplashConfig) this.f15995a.getSerializableExtra("SplashConfig");
    }
}
