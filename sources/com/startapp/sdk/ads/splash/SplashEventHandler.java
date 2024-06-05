package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.h0;
import com.startapp.i3;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.w4;
import com.startapp.z7;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class SplashEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16567a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Activity> f16568b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16569c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16570d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16571e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16572f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16573g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16574h;

    /* renamed from: i  reason: collision with root package name */
    public SplashState f16575i;

    /* renamed from: j  reason: collision with root package name */
    public SplashHtml f16576j;

    /* renamed from: k  reason: collision with root package name */
    public final BroadcastReceiver f16577k;

    /* compiled from: Sta */
    public enum SplashState {
        LOADING,
        RECEIVED,
        DISPLAYED,
        HIDDEN,
        DO_NOT_DISPLAY
    }

    /* compiled from: Sta */
    public class a implements z7 {
        public a() {
        }

        public void a() {
            SplashEventHandler.this.b();
        }
    }

    /* compiled from: Sta */
    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            SplashEventHandler.this.f16572f = true;
        }
    }

    public SplashEventHandler(Activity activity) {
        this.f16569c = false;
        this.f16570d = true;
        this.f16571e = false;
        this.f16572f = false;
        this.f16573g = false;
        this.f16574h = false;
        this.f16575i = SplashState.LOADING;
        this.f16576j = null;
        this.f16577k = new b();
        this.f16567a = h0.b(activity);
        this.f16568b = new WeakReference<>(activity);
    }

    public void a(Runnable runnable, CacheKey cacheKey) {
        AdRulesResult a10 = AdaptMetaData.f16908a.a().a(AdPreferences.Placement.INAPP_SPLASH, (String) null);
        if (a10.b()) {
            a(runnable);
            return;
        }
        this.f16575i = SplashState.DO_NOT_DISPLAY;
        if (cacheKey != null) {
            com.startapp.sdk.adsbase.a.a(com.startapp.sdk.adsbase.a.a(d.f16928h.a(cacheKey)), (String) null, 0, a10.a());
        }
        c();
    }

    public void b() {
        if (!this.f16571e) {
            this.f16571e = true;
            w4.a(this.f16567a).a(new Intent("com.startapp.android.splashHidden"));
        }
        try {
            w4.a(this.f16567a).a(this.f16577k);
        } catch (Throwable th) {
            i3.a(th);
        }
        Activity activity = (Activity) this.f16568b.get();
        if (activity != null && !activity.isFinishing()) {
            try {
                activity.finish();
            } catch (Throwable th2) {
                i3.a(th2);
            }
        }
    }

    public final void c() {
        SplashHtml splashHtml = this.f16576j;
        a aVar = new a();
        if (splashHtml == null) {
            b();
            return;
        }
        splashHtml.callback = aVar;
        splashHtml.a();
    }

    public void d() {
        this.f16569c = true;
    }

    public void a() {
        this.f16575i = SplashState.DO_NOT_DISPLAY;
        a((Runnable) null);
    }

    public final void a(Runnable runnable) {
        if (!this.f16569c) {
            return;
        }
        if (this.f16574h || runnable == null) {
            SplashState splashState = this.f16575i;
            if (splashState == SplashState.RECEIVED && runnable != null) {
                this.f16570d = false;
                runnable.run();
            } else if (splashState != SplashState.LOADING) {
                c();
            }
        }
    }

    public SplashEventHandler(Activity activity, SplashHtml splashHtml) {
        this(activity);
        this.f16576j = splashHtml;
    }
}
