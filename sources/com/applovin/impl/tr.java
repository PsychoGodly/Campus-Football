package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class tr {

    /* renamed from: a  reason: collision with root package name */
    private static WebView f12437a;

    /* renamed from: b  reason: collision with root package name */
    private static String f12438b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12439c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f12440d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private static int f12441e;

    /* renamed from: f  reason: collision with root package name */
    private static String f12442f;

    /* renamed from: g  reason: collision with root package name */
    private static String f12443g;

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicBoolean f12444h = new AtomicBoolean();

    static {
        if (e()) {
            f12438b = (String) sj.a(qj.K, (Object) MaxReward.DEFAULT_LABEL, k.k());
            return;
        }
        f12438b = MaxReward.DEFAULT_LABEL;
        sj.b(qj.K, (Object) null, k.k());
        sj.b(qj.L, (Object) null, k.k());
    }

    public static void a(k kVar) {
        if (!e() && !f12440d.getAndSet(true)) {
            if (x3.d()) {
                AppLovinSdkUtils.runOnUiThread(new u50(kVar));
            } else {
                AppLovinSdkUtils.runOnUiThread(new t50(kVar));
            }
        }
    }

    public static String b() {
        return f12443g;
    }

    public static String c() {
        return f12442f;
    }

    public static int d() {
        return f12441e;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(k kVar) {
        try {
            f(kVar);
            synchronized (f12439c) {
                f12438b = f12437a.getSettings().getUserAgentString();
                sj.b(qj.K, (Object) f12438b, k.k());
                sj.b(qj.L, (Object) Build.VERSION.RELEASE, k.k());
            }
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static void f(k kVar) {
    }

    public static void b(k kVar) {
        if (!f12444h.getAndSet(true)) {
            PackageInfo c10 = c(kVar);
            if (c10 == null) {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("WebViewDataCollector", "Failed to get WebView package info");
                    return;
                }
                return;
            }
            f12441e = c10.versionCode;
            f12442f = c10.versionName;
            f12443g = c10.packageName;
        }
    }

    private static PackageInfo c(k kVar) {
        PackageManager packageManager = k.k().getPackageManager();
        if (x3.i()) {
            return WebView.getCurrentWebViewPackage();
        }
        for (String packageInfo : kVar.c(oj.f10452y4)) {
            try {
                return packageManager.getPackageInfo(packageInfo, 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(k kVar) {
        try {
            synchronized (f12439c) {
                f12438b = WebSettings.getDefaultUserAgent(k.k());
                sj.b(qj.K, (Object) f12438b, k.k());
                sj.b(qj.L, (Object) Build.VERSION.RELEASE, k.k());
            }
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static String a() {
        String str;
        synchronized (f12439c) {
            str = f12438b;
        }
        return str;
    }

    public static boolean e() {
        boolean equals;
        synchronized (f12439c) {
            equals = Build.VERSION.RELEASE.equals((String) sj.a(qj.L, (Object) MaxReward.DEFAULT_LABEL, k.k()));
        }
        return equals;
    }
}
