package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.aa;
import com.applovin.impl.oj;
import com.applovin.impl.p;
import com.applovin.impl.zp;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a  reason: collision with root package name */
    final k f11460a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f11461b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f11462c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f11463d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f11464e = new AtomicLong();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicLong f11465f = new AtomicLong();

    /* renamed from: g  reason: collision with root package name */
    private Date f11466g;

    /* renamed from: h  reason: collision with root package name */
    private Date f11467h;

    class a extends p {
        a() {
        }

        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    class b implements ComponentCallbacks2 {
        b() {
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i10) {
            SessionTracker.this.f11463d.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (zp.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    SessionTracker(k kVar) {
        this.f11460a = kVar;
        Application application = (Application) k.k();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f11460a.L();
        if (t.a()) {
            this.f11460a.L().a("SessionTracker", "Application Resumed");
        }
        this.f11465f.set(System.currentTimeMillis());
        boolean booleanValue = ((Boolean) this.f11460a.a(oj.C3)).booleanValue();
        long longValue = ((Long) this.f11460a.a(oj.D3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), (Map<String, Object>) null);
        if (!this.f11461b.getAndSet(false)) {
            long millis = TimeUnit.MINUTES.toMillis(longValue);
            if (this.f11467h == null || System.currentTimeMillis() - this.f11467h.getTime() >= millis) {
                this.f11460a.C().trackEvent("resumed");
                if (booleanValue) {
                    this.f11467h = new Date();
                }
            }
            if (!booleanValue) {
                this.f11467h = new Date();
            }
            this.f11460a.F().c(aa.f6354p);
        }
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f11464e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f11465f.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.f11463d.get();
    }

    public boolean isApplicationPaused() {
        return this.f11462c.get();
    }

    public void pauseForClick() {
        this.f11461b.set(true);
    }

    public void resumeForClick() {
        this.f11461b.set(false);
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.f11462c.compareAndSet(false, true)) {
            c();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        if (this.f11462c.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f11460a.L();
        if (t.a()) {
            this.f11460a.L().a("SessionTracker", "Application Paused");
        }
        this.f11464e.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), (Map<String, Object>) null);
        if (!this.f11461b.get()) {
            boolean booleanValue = ((Boolean) this.f11460a.a(oj.C3)).booleanValue();
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f11460a.a(oj.E3)).longValue());
            if (this.f11466g == null || System.currentTimeMillis() - this.f11466g.getTime() >= millis) {
                this.f11460a.C().trackEvent("paused");
                if (booleanValue) {
                    this.f11466g = new Date();
                }
            }
            if (!booleanValue) {
                this.f11466g = new Date();
            }
        }
    }
}
