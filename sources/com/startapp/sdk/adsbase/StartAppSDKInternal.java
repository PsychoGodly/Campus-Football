package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.a0;
import com.startapp.b0;
import com.startapp.e0;
import com.startapp.f0;
import com.startapp.f2;
import com.startapp.g0;
import com.startapp.g6;
import com.startapp.h0;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.m6;
import com.startapp.n3;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.components.x;
import com.startapp.t;
import com.startapp.t7;
import com.startapp.v1;
import com.startapp.z4;
import com.startapp.z8;
import java.lang.Thread;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class StartAppSDKInternal implements g0 {
    public static final Object D = new Object();
    public static volatile InitState E = InitState.UNSET;
    public f0 A;
    public z8 B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public SDKAdPreferences f16807a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16808b = true;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16809c = a0.a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f16810d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16811e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16812f = false;

    /* renamed from: g  reason: collision with root package name */
    public long f16813g;

    /* renamed from: h  reason: collision with root package name */
    public Application f16814h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap<Integer, Integer> f16815i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public Object f16816j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f16817k = new AtomicBoolean();

    /* renamed from: l  reason: collision with root package name */
    public Activity f16818l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16819m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16820n = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16821o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16822p = false;

    /* renamed from: q  reason: collision with root package name */
    public Map<String, String> f16823q;

    /* renamed from: r  reason: collision with root package name */
    public Bundle f16824r = null;

    /* renamed from: s  reason: collision with root package name */
    public AdPreferences f16825s;

    /* renamed from: t  reason: collision with root package name */
    public CacheKey f16826t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16827u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16828v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16829w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16830x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f16831y = false;

    /* renamed from: z  reason: collision with root package name */
    public d f16832z = null;

    /* compiled from: Sta */
    public enum InitState {
        UNSET,
        IMPLICIT,
        EXPLICIT
    }

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16837a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f16838b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f16839c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ SDKAdPreferences f16840d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f16841e;

        public a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
            this.f16837a = context;
            this.f16838b = str;
            this.f16839c = str2;
            this.f16840d = sDKAdPreferences;
            this.f16841e = z10;
        }

        public void run() {
            synchronized (StartAppSDKInternal.D) {
                StartAppSDKInternal.a(StartAppSDKInternal.this, this.f16837a, this.f16838b, this.f16839c, this.f16840d, this.f16841e);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements d.C0170d {
        public c() {
        }

        public void a(Ad ad2, CacheKey cacheKey, boolean z10) {
            StartAppSDKInternal.this.f16826t = cacheKey;
        }
    }

    /* compiled from: Sta */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static final StartAppSDKInternal f16847a = new StartAppSDKInternal();
    }

    public StartAppSDKInternal() {
        Map<Activity, Integer> map = j9.f15982a;
    }

    public static void a(StartAppSDKInternal startAppSDKInternal, Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        startAppSDKInternal.getClass();
        com.startapp.sdk.adsbase.crashreport.b a10 = ComponentLocator.a(context).I.a();
        InitState initState = E;
        InitState initState2 = InitState.EXPLICIT;
        if (initState != initState2) {
            boolean a11 = ComponentLocator.a(context).c().a();
            if (TextUtils.isEmpty(str2)) {
                if (j9.f(context) || a0.c(context)) {
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
            }
            b0 c10 = ComponentLocator.a(context).c();
            if (str != null) {
                str = str.trim();
            }
            if (str2 != null) {
                str2 = str2.trim();
            }
            synchronized (c10.f15623a) {
                c10.f15625c = str;
                c10.f15626d = str2;
                c10.f15624b.edit().putString("c88d4eab540fab77", str).putString("2696a7f502faed4b", str2).commit();
            }
            startAppSDKInternal.f16807a = sDKAdPreferences;
            f2.b(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
            startAppSDKInternal.a(z10);
            if (E == InitState.IMPLICIT && !a11) {
                startAppSDKInternal.b(context, MetaDataRequest.RequestReason.LAUNCH);
            } else if (E == InitState.UNSET) {
                startAppSDKInternal.a(context, MetaDataRequest.RequestReason.LAUNCH);
            }
            E = initState2;
        }
    }

    public static boolean c() {
        boolean z10;
        synchronized (D) {
            z10 = E == InitState.EXPLICIT;
        }
        return z10;
    }

    public static void h(Context context) {
        if (context != null) {
            a(false, (g6) null);
        }
    }

    public boolean b() {
        return this.f16822p;
    }

    public final void d(Context context) {
        Application application;
        if (Build.VERSION.SDK_INT >= 14) {
            Context a10 = h0.a(context);
            if (a10 instanceof Application) {
                application = (Application) a10;
            } else if (context instanceof Application) {
                application = (Application) context;
            } else if (context instanceof Activity) {
                application = ((Activity) context).getApplication();
            } else {
                application = context instanceof Service ? ((Service) context).getApplication() : null;
            }
            if (application != null && this.A == null) {
                f0 f0Var = new f0(this);
                this.A = f0Var;
                application.registerActivityLifecycleCallbacks(f0Var);
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = ComponentLocator.a(context).t().f15849e;
                    if (activityLifecycleCallbacks != null) {
                        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                        return;
                    }
                    throw new RuntimeException();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final boolean e(Context context) {
        e k10 = ComponentLocator.a(context).k();
        if (k10.contains("isma")) {
            if (k10.getBoolean("isma", false)) {
                if (!k10.contains("iscd") || k10.getBoolean("iscd", false)) {
                    return false;
                }
                return true;
            } else if (!k10.contains("iscd") || !k10.getBoolean("iscd", false)) {
                return true;
            } else {
                return false;
            }
        } else if (k10.contains("iscd")) {
            return !k10.getBoolean("iscd", false);
        } else {
            return true;
        }
    }

    public final void f(Context context) {
        if (this.f16827u && !AdsCommonMetaData.f16770h.K()) {
            com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f16928h;
            AdPreferences adPreferences = this.f16825s;
            AdPreferences adPreferences2 = adPreferences != null ? new AdPreferences(adPreferences) : new AdPreferences();
            c cVar = new c();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (dVar.a(placement)) {
                dVar.a(context, (StartAppAd) null, placement, adPreferences2, cVar, false, 0);
            } else {
                cVar.a((Ad) null, (CacheKey) null, false);
            }
        }
    }

    public final void g(Context context) {
        if (a0.a() && (context instanceof Application)) {
            Application application = (Application) context;
            this.f16814h = application;
            if (this.f16817k.compareAndSet(false, true) && this.f16816j == null) {
                g gVar = new g();
                application.registerActivityLifecycleCallbacks(gVar);
                this.f16816j = gVar;
            }
        }
    }

    public final void i(Context context) {
        e e10 = ComponentLocator.a(context).e();
        int i10 = e10.getInt("shared_prefs_app_version_id", -1);
        int i11 = a0.f15596a;
        int i12 = 0;
        try {
            i12 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
        }
        if (i10 > 0 && i12 > i10) {
            this.f16822p = true;
        }
        e.a a10 = e10.edit();
        a10.a("shared_prefs_app_version_id", Integer.valueOf(i12));
        a10.f17013a.putInt("shared_prefs_app_version_id", i12);
        a10.apply();
    }

    public final void j(Context context) {
        ComponentLocator a10 = ComponentLocator.a(context);
        e.a a11 = a10.e().edit();
        Boolean bool = Boolean.FALSE;
        a11.a("periodicInfoEventPaused", bool);
        a11.f17013a.putBoolean("periodicInfoEventPaused", false);
        a11.a("periodicMetadataPaused", bool);
        a11.f17013a.putBoolean("periodicMetadataPaused", false);
        a11.apply();
        b bVar = new b(context, a10);
        if (MetaData.f17070k.f17073b) {
            bVar.a((MetaDataRequest.RequestReason) null, false);
        } else {
            MetaData.f17070k.a((com.startapp.sdk.adsbase.remoteconfig.c) bVar);
        }
    }

    public void b(Context context, MetaDataRequest.RequestReason requestReason) {
        t7.f17299d.a(context, requestReason);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ec, code lost:
        if (r0.isEmpty() == false) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "android.support.customtabs.action.CustomTabsService"
            r1 = 1
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00c9 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = "android.intent.action.VIEW"
            java.lang.String r7 = "http://www.example.com"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x00c9 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r6 = r4.resolveActivity(r5, r3)     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x0021
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = r6.packageName     // Catch:{ all -> 0x00c9 }
            goto L_0x0022
        L_0x0021:
            r6 = r2
        L_0x0022:
            java.util.List r7 = r4.queryIntentActivities(r5, r3)     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00c9 }
            r8.<init>()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x002f:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9     // Catch:{ all -> 0x00c9 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x00c9 }
            r10.<init>()     // Catch:{ all -> 0x00c9 }
            r10.setAction(r0)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ActivityInfo r11 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = r11.packageName     // Catch:{ all -> 0x00c9 }
            r10.setPackage(r11)     // Catch:{ all -> 0x00c9 }
            android.content.pm.ResolveInfo r10 = r4.resolveService(r10, r3)     // Catch:{ all -> 0x00c9 }
            if (r10 == 0) goto L_0x002f
            android.content.pm.ActivityInfo r9 = r9.activityInfo     // Catch:{ all -> 0x00c9 }
            java.lang.String r9 = r9.packageName     // Catch:{ all -> 0x00c9 }
            r8.add(r9)     // Catch:{ all -> 0x00c9 }
            goto L_0x002f
        L_0x0058:
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x0060
            goto L_0x00cd
        L_0x0060:
            int r4 = r8.size()     // Catch:{ all -> 0x00c9 }
            java.lang.String r7 = "com.android.chrome"
            if (r4 != r1) goto L_0x0070
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00c9 }
            r2 = r4
            goto L_0x00cd
        L_0x0070:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 != 0) goto L_0x00c1
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ all -> 0x00b2 }
            r9 = 64
            java.util.List r4 = r4.queryIntentActivities(r5, r9)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x00b6
            int r5 = r4.size()     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0089
            goto L_0x00b6
        L_0x0089:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00b2 }
        L_0x008d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00b6
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00b2 }
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5     // Catch:{ all -> 0x00b2 }
            android.content.IntentFilter r9 = r5.filter     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x009e
            goto L_0x008d
        L_0x009e:
            int r10 = r9.countDataAuthorities()     // Catch:{ all -> 0x00b2 }
            if (r10 == 0) goto L_0x008d
            int r9 = r9.countDataPaths()     // Catch:{ all -> 0x00b2 }
            if (r9 != 0) goto L_0x00ab
            goto L_0x008d
        L_0x00ab:
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00b0
            goto L_0x008d
        L_0x00b0:
            r4 = 1
            goto L_0x00b7
        L_0x00b2:
            r4 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00c9 }
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            if (r4 != 0) goto L_0x00c1
            boolean r4 = r8.contains(r6)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00c1
            r2 = r6
            goto L_0x00cd
        L_0x00c1:
            boolean r4 = r8.contains(r7)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x00cd
            r2 = r7
            goto L_0x00cd
        L_0x00c9:
            r4 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r4)
        L_0x00cd:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 18
            if (r4 < r5) goto L_0x00ef
            if (r2 != 0) goto L_0x00d6
            goto L_0x00ef
        L_0x00d6:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setPackage(r2)
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            java.util.List r0 = r0.queryIntentServices(r4, r3)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            com.startapp.sdk.components.ComponentLocator r13 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r13)
            com.startapp.sdk.adsbase.e r13 = r13.e()
            com.startapp.sdk.adsbase.e$a r13 = r13.edit()
            java.lang.String r0 = "chromeTabs"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r13.a((java.lang.String) r0, r2)
            android.content.SharedPreferences$Editor r2 = r13.f17013a
            r2.putBoolean(r0, r1)
            r13.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.b(android.content.Context):void");
    }

    public SDKAdPreferences c(Context context) {
        if (this.f16807a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) f2.a(context, "shared_prefs_sdk_ad_prefs", SDKAdPreferences.class);
            if (sDKAdPreferences == null) {
                this.f16807a = new SDKAdPreferences();
            } else {
                this.f16807a = sDKAdPreferences;
            }
        }
        return this.f16807a;
    }

    public boolean d() {
        return this.f16820n;
    }

    public void a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        Context a10 = h0.a(context);
        Context context2 = a10 != null ? a10 : context;
        g(context2);
        try {
            ComponentLocator.a(context2).t().a(256);
        } catch (Throwable unused) {
        }
        ComponentLocator.a(context2).h().execute(new a(context2, str, str2, sDKAdPreferences, z10));
    }

    public static StartAppSDKInternal a() {
        return d.f16847a;
    }

    public static void a(Context context) {
        MetaDataRequest.RequestReason requestReason;
        ComponentLocator a10 = ComponentLocator.a(context);
        com.startapp.sdk.adsbase.crashreport.b a11 = a10.I.a();
        e0 d10 = a10.d();
        ((x) d10.f15771a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d10.f15774d = elapsedRealtime;
        d10.f15775e = elapsedRealtime;
        z4 z4Var = new z4(context);
        if (!(z4Var.f17583d == null && z4Var.f17584e == null)) {
            e.a a12 = a10.k().edit();
            Boolean bool = z4Var.f17583d;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                a12.a("isma", Boolean.valueOf(booleanValue));
                a12.f17013a.putBoolean("isma", booleanValue);
            }
            Boolean bool2 = z4Var.f17584e;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                a12.a("iscd", Boolean.valueOf(booleanValue2));
                a12.f17013a.putBoolean("iscd", booleanValue2);
            }
            a12.apply();
        }
        String str = z4Var.f17580a;
        if (!TextUtils.isEmpty(str)) {
            d.f16847a.a(context, (String) null, str, (SDKAdPreferences) null, z4Var.f17581b);
            if (!z4Var.f17582c) {
                StartAppAd.disableSplash();
            }
            if (a10.e().getBoolean("shared_prefs_first_init", true)) {
                i3 i3Var = new i3(j3.f15951d);
                i3Var.f15914d = "ManifestInit";
                i3Var.a();
            }
        } else if (E == InitState.UNSET) {
            E = InitState.IMPLICIT;
            b0 c10 = a10.c();
            StartAppSDKInternal startAppSDKInternal = d.f16847a;
            if (c10.a()) {
                requestReason = MetaDataRequest.RequestReason.LAUNCH;
            } else {
                requestReason = MetaDataRequest.RequestReason.IMPLICIT_LAUNCH;
            }
            startAppSDKInternal.a(context, requestReason);
        }
    }

    public final void a(Context context, MetaDataRequest.RequestReason requestReason) {
        ComponentLocator a10;
        if (Math.random() < 0.0d) {
            Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:4.10.12");
        }
        try {
            a10 = ComponentLocator.a(context);
            t a11 = a10.G.a();
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof t)) {
                Thread.setDefaultUncaughtExceptionHandler(a11);
                a11.f17275a = defaultUncaughtExceptionHandler;
            }
        } catch (Throwable th) {
            i3.a(th);
            return;
        }
        a10.n().a();
        if (!a0.a(context, "android.permission.INTERNET") || !a0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            j9.a(context, 6, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.", true);
        }
        this.f16820n = !j9.d(context);
        a10.a().a(e(context));
        a10.x().c();
        d(context);
        MetaData.c(context);
        Map<Activity, Integer> map = j9.f15982a;
        AdsCommonMetaData.a(context);
        BannerMetaData.a(context);
        SplashMetaData.a(context);
        if (this.f16808b) {
            CacheMetaData.a(context);
        }
        AdInformationMetaData.a(context);
        SimpleTokenUtils.c(context);
        MetaData.f17070k.a((com.startapp.sdk.adsbase.remoteconfig.c) a10.g());
        if (Build.VERSION.SDK_INT >= 9) {
            v1.f17395a = new CookieManager(new m6(context), CookiePolicy.ACCEPT_ALL);
        }
        i(context);
        b(context, requestReason);
        b(context);
        j(context);
        j9.a(context, 4, "StartApp SDK initialized", true);
    }

    public static void a(boolean z10, g6 g6Var) {
        i3 i3Var = new i3(j3.f15957j);
        i3Var.f15920j = z10;
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.N.f16284a;
            if (componentLocator != null) {
                componentLocator.n().a(i3Var, (n3) null);
            } else if (g6Var != null) {
                g6Var.a(Boolean.FALSE);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean a(Activity activity) {
        return this.f16831y || activity.getClass().getName().equals(j9.c((Context) activity));
    }

    public boolean a(String str) {
        String str2;
        Map<String, String> map = this.f16823q;
        if (map == null) {
            str2 = null;
        } else {
            str2 = map.get(str);
        }
        return str2 != null;
    }

    public void a(boolean z10) {
        if (!z10 || !a0.a()) {
            this.f16827u = false;
            com.startapp.sdk.adsbase.cache.d.f16928h.b(AdPreferences.Placement.INAPP_RETURN);
            return;
        }
        this.f16827u = true;
    }

    /* compiled from: Sta */
    public class b implements com.startapp.sdk.adsbase.remoteconfig.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16843a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentLocator f16844b;

        public b(Context context, ComponentLocator componentLocator) {
            this.f16843a = context;
            this.f16844b = componentLocator;
        }

        /* JADX WARNING: Removed duplicated region for block: B:121:0x038d  */
        /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r19, boolean r20) {
            /*
                r18 = this;
                r1 = r18
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r8 = r1.f16843a
                boolean r2 = r0.f16808b
                r9 = 0
                r10 = 1
                if (r2 != 0) goto L_0x000e
                goto L_0x0128
            L_0x000e:
                boolean r2 = r0.f16822p
                if (r2 != 0) goto L_0x005f
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f16922a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.a()
                boolean r2 = r2.f()
                if (r2 != 0) goto L_0x001f
                goto L_0x005f
            L_0x001f:
                boolean r2 = r0.f16809c
                if (r2 == 0) goto L_0x0078
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.d.f16928h
                r2.getClass()
                android.content.Context r3 = com.startapp.h0.a(r8)
                if (r3 == 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r3 = r8
            L_0x0030:
                r2.f16935g = r3
                boolean r4 = r2.f16931c
                if (r4 != 0) goto L_0x0044
                com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f16922a
                com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.a()
                boolean r4 = r4.f()
                if (r4 == 0) goto L_0x0044
                r4 = 1
                goto L_0x0045
            L_0x0044:
                r4 = 0
            L_0x0045:
                if (r4 == 0) goto L_0x0078
                r2.f16932d = r10
                com.startapp.sdk.adsbase.cache.a r4 = new com.startapp.sdk.adsbase.cache.a
                r4.<init>(r2, r3)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r3)
                java.util.concurrent.Executor r2 = r2.j()
                com.startapp.sdk.adsbase.cache.j r5 = new com.startapp.sdk.adsbase.cache.j
                r5.<init>(r3, r4)
                r2.execute(r5)
                goto L_0x0078
            L_0x005f:
                com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.d.f16928h
                r2.f16931c = r10
                com.startapp.sdk.adsbase.cache.b r3 = new com.startapp.sdk.adsbase.cache.b
                r3.<init>(r2)
                com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r8)
                java.util.concurrent.Executor r2 = r2.j()
                com.startapp.sdk.adsbase.cache.i r4 = new com.startapp.sdk.adsbase.cache.i
                r4.<init>(r8, r3)
                r2.execute(r4)
            L_0x0078:
                r0.f(r8)
                if (r20 == 0) goto L_0x0128
                com.startapp.sdk.adsbase.cache.d r0 = com.startapp.sdk.adsbase.cache.d.f16928h
                r0.getClass()
                com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f16922a
                com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.a()
                if (r2 == 0) goto L_0x0128
                java.util.Set r2 = r2.b()
                if (r2 == 0) goto L_0x009e
                int r3 = r2.size()
                if (r3 <= 0) goto L_0x009e
                boolean r3 = com.startapp.sdk.adsbase.cache.CacheMetaData.d()
                if (r3 == 0) goto L_0x009e
                r3 = 1
                goto L_0x009f
            L_0x009e:
                r3 = 0
            L_0x009f:
                if (r3 == 0) goto L_0x0128
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r8)
                com.startapp.sdk.adsbase.e r11 = r3.e()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                int r12 = r3.N()
                com.startapp.sdk.adsbase.AdsCommonMetaData r3 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h
                int r13 = r3.i()
                java.util.Iterator r14 = r2.iterator()
            L_0x00b9:
                boolean r2 = r14.hasNext()
                if (r2 == 0) goto L_0x0128
                java.lang.Object r2 = r14.next()
                r5 = r2
                com.startapp.sdk.adsbase.StartAppAd$AdMode r5 = (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5
                if (r5 != 0) goto L_0x00c9
                goto L_0x00b9
            L_0x00c9:
                java.lang.String r15 = com.startapp.sdk.adsbase.cache.d.a((com.startapp.sdk.adsbase.StartAppAd.AdMode) r5)
                int r7 = r11.getInt(r15, r9)
                if (r7 < r12) goto L_0x00d4
                goto L_0x00b9
            L_0x00d4:
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE
                if (r5 != r6) goto L_0x00f2
                if (r13 <= 0) goto L_0x00ef
                com.startapp.sdk.adsbase.model.AdPreferences r16 = new com.startapp.sdk.adsbase.model.AdPreferences
                r16.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r16
                r16 = r7
                r7 = r17
                r2.a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.d.C0170d) r7)
                goto L_0x011a
            L_0x00ef:
                r16 = r7
                goto L_0x011a
            L_0x00f2:
                r16 = r7
                com.startapp.sdk.adsbase.StartAppAd$AdMode r6 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL
                if (r5 != r6) goto L_0x010e
                r2 = 100
                if (r13 >= r2) goto L_0x011a
                com.startapp.sdk.adsbase.model.AdPreferences r7 = new com.startapp.sdk.adsbase.model.AdPreferences
                r7.<init>()
                r4 = 0
                r17 = 0
                r2 = r0
                r3 = r8
                r5 = r6
                r6 = r7
                r7 = r17
                r2.a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.d.C0170d) r7)
                goto L_0x011a
            L_0x010e:
                com.startapp.sdk.adsbase.model.AdPreferences r6 = new com.startapp.sdk.adsbase.model.AdPreferences
                r6.<init>()
                r4 = 0
                r7 = 0
                r2 = r0
                r3 = r8
                r2.a((android.content.Context) r3, (com.startapp.sdk.adsbase.StartAppAd) r4, (com.startapp.sdk.adsbase.StartAppAd.AdMode) r5, (com.startapp.sdk.adsbase.model.AdPreferences) r6, (com.startapp.sdk.adsbase.cache.d.C0170d) r7)
            L_0x011a:
                com.startapp.sdk.adsbase.e$a r2 = r11.edit()
                int r7 = r16 + 1
                com.startapp.sdk.adsbase.e$a r2 = r2.a((java.lang.String) r15, (int) r7)
                r2.apply()
                goto L_0x00b9
            L_0x0128:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f16844b
                com.startapp.n4<com.startapp.f1> r0 = r0.f17155r
                java.lang.Object r0 = r0.a()
                com.startapp.f1 r0 = (com.startapp.f1) r0
                r0.e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f16844b
                com.startapp.n4<com.startapp.q7> r0 = r0.f17156s
                java.lang.Object r0 = r0.a()
                com.startapp.q7 r0 = (com.startapp.q7) r0
                r0.e()
                com.startapp.sdk.components.ComponentLocator r0 = r1.f16844b
                com.startapp.h8 r0 = r0.v()
                r0.e()
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f16843a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.i4 r0 = r0.o()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                boolean r2 = r2.Y()
                r3 = 60000(0xea60, double:2.9644E-319)
                if (r2 == 0) goto L_0x018c
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                int r2 = r2.D()
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r7 = com.startapp.sdk.adsbase.remoteconfig.d.class
                r2.<init>(r7)
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.f17255d = r5
                com.startapp.sdk.jobs.JobRequest$Network r5 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f17242b = r5
                com.startapp.sdk.jobs.e r5 = new com.startapp.sdk.jobs.e
                r5.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r5
                r0.a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x0199
            L_0x018c:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.d> r5 = com.startapp.sdk.adsbase.remoteconfig.d.class
                r2[r9] = r5
                int r2 = com.startapp.sdk.jobs.JobRequest.a((java.lang.Class<? extends com.startapp.sdk.jobs.b>[]) r2)
                r0.a((int) r2)
            L_0x0199:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f16843a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.i4 r0 = r0.o()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                boolean r5 = r5.X()
                if (r5 == 0) goto L_0x01d7
                com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                int r2 = r5.b(r2)
                long r5 = (long) r2
                long r5 = r5 * r3
                com.startapp.sdk.jobs.e$a r2 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.l6> r3 = com.startapp.l6.class
                r2.<init>(r3)
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r2.f17255d = r3
                com.startapp.sdk.jobs.JobRequest$Network r3 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r2.f17242b = r3
                com.startapp.sdk.jobs.e r3 = new com.startapp.sdk.jobs.e
                r3.<init>(r2)
                com.startapp.sdk.jobs.JobRequest[] r2 = new com.startapp.sdk.jobs.JobRequest[r10]
                r2[r9] = r3
                r0.a((com.startapp.sdk.jobs.JobRequest[]) r2)
                goto L_0x01e4
            L_0x01d7:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.l6> r3 = com.startapp.l6.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.a((java.lang.Class<? extends com.startapp.sdk.jobs.b>[]) r2)
                r0.a((int) r2)
            L_0x01e4:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f16843a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.i4 r0 = r0.o()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                boolean r4 = r3.X()
                if (r4 == 0) goto L_0x022c
                boolean r4 = r3.W()
                if (r4 == 0) goto L_0x022c
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                int r2 = r3.a((android.content.Context) r2)
                long r2 = (long) r2
                long r2 = r4.toMillis(r2)
                com.startapp.sdk.jobs.e$a r4 = new com.startapp.sdk.jobs.e$a
                java.lang.Class<com.startapp.k6> r5 = com.startapp.k6.class
                r4.<init>(r5)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r4.f17255d = r2
                com.startapp.sdk.jobs.JobRequest$Network r2 = com.startapp.sdk.jobs.JobRequest.Network.ANY
                r4.f17242b = r2
                r4.f17243c = r10
                com.startapp.sdk.jobs.e r2 = new com.startapp.sdk.jobs.e
                r2.<init>(r4)
                com.startapp.sdk.jobs.JobRequest[] r3 = new com.startapp.sdk.jobs.JobRequest[r10]
                r3[r9] = r2
                r0.a((com.startapp.sdk.jobs.JobRequest[]) r3)
                goto L_0x0239
            L_0x022c:
                java.lang.Class[] r2 = new java.lang.Class[r10]
                java.lang.Class<com.startapp.k6> r3 = com.startapp.k6.class
                r2[r9] = r3
                int r2 = com.startapp.sdk.jobs.JobRequest.a((java.lang.Class<? extends com.startapp.sdk.jobs.b>[]) r2)
                r0.a((int) r2)
            L_0x0239:
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                android.content.Context r2 = r1.f16843a
                r0.getClass()
                com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)
                com.startapp.sdk.adsbase.e r4 = r3.e()
                java.lang.String r5 = "shared_prefs_first_init"
                boolean r5 = r4.getBoolean(r5, r10)
                if (r5 != 0) goto L_0x0251
                goto L_0x0284
            L_0x0251:
                com.startapp.sdk.adsbase.e$a r5 = r4.edit()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                java.lang.String r7 = "totalSessions"
                r5.a((java.lang.String) r7, r6)
                android.content.SharedPreferences$Editor r6 = r5.f17013a
                r6.putInt(r7, r9)
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.Long r8 = java.lang.Long.valueOf(r6)
                java.lang.String r11 = "firstSessionTime"
                r5.a((java.lang.String) r11, r8)
                android.content.SharedPreferences$Editor r8 = r5.f17013a
                r8.putLong(r11, r6)
                r5.apply()
                java.util.concurrent.Executor r5 = r3.r()
                com.startapp.sdk.adsbase.f r6 = new com.startapp.sdk.adsbase.f
                r6.<init>(r0, r2, r3, r4)
                r5.execute(r6)
            L_0x0284:
                android.content.Context r0 = r1.f16843a
                com.startapp.sdk.adsbase.StartAppSDKInternal.h(r0)
                com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                r0.getClass()
                android.content.Context r0 = r1.f16843a
                java.lang.Object r2 = com.startapp.sdk.adsbase.StartAppSDKInternal.D
                com.startapp.sdk.adsbase.StartAppSDKInternal r2 = com.startapp.sdk.adsbase.StartAppSDKInternal.this
                com.startapp.z8 r3 = r2.B
                if (r3 == 0) goto L_0x0299
                goto L_0x02aa
            L_0x0299:
                com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)
                com.startapp.n4<com.startapp.z8> r0 = r0.f17149l
                java.lang.Object r0 = r0.a()
                com.startapp.z8 r0 = (com.startapp.z8) r0
                r2.B = r0
                r0.b()
            L_0x02aa:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f16844b
                com.startapp.g7 r0 = r0.t()
                boolean r2 = r0.b()     // Catch:{ all -> 0x02c2 }
                if (r2 == 0) goto L_0x02b7
                goto L_0x02c6
            L_0x02b7:
                java.util.concurrent.Executor r2 = r0.f15846b     // Catch:{ all -> 0x02c2 }
                com.startapp.h7 r3 = new com.startapp.h7     // Catch:{ all -> 0x02c2 }
                r3.<init>(r0)     // Catch:{ all -> 0x02c2 }
                r2.execute(r3)     // Catch:{ all -> 0x02c2 }
                goto L_0x02c6
            L_0x02c2:
                r0 = move-exception
                com.startapp.i3.a((java.lang.Throwable) r0)
            L_0x02c6:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f16844b
                com.startapp.c7 r0 = r0.s()
                java.util.List r2 = r0.a()
                r3 = 1024(0x400, float:1.435E-42)
                boolean r0 = r0.a((int) r3)
                if (r0 == 0) goto L_0x0301
                com.startapp.i3 r0 = new com.startapp.i3
                com.startapp.j3 r3 = com.startapp.j3.f15951d
                r0.<init>((com.startapp.j3) r3)
                java.lang.String r3 = "RSC init"
                r0.f15914d = r3
                java.lang.String r3 = "targets: "
                java.lang.StringBuilder r3 = com.startapp.p0.a(r3)
                if (r2 == 0) goto L_0x02f4
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x02f5
            L_0x02f4:
                r2 = 0
            L_0x02f5:
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.f15915e = r2
                r0.a()
            L_0x0301:
                com.startapp.sdk.components.ComponentLocator r0 = r1.f16844b
                com.startapp.b5 r0 = r0.q()
                com.startapp.sdk.adsbase.remoteconfig.MotionMetadata r2 = r0.a()
                if (r2 == 0) goto L_0x031e
                double r3 = java.lang.Math.random()
                double r5 = r2.k()
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 >= 0) goto L_0x031b
                r2 = 1
                goto L_0x031c
            L_0x031b:
                r2 = 0
            L_0x031c:
                r0.f15649f = r2
            L_0x031e:
                android.os.Handler r2 = r0.f15647d
                com.startapp.c5 r3 = new com.startapp.c5
                r3.<init>(r0)
                r2.post(r3)
                com.startapp.sdk.components.ComponentLocator r0 = r1.f16844b
                com.startapp.y r0 = r0.b()
                if (r20 == 0) goto L_0x0332
                r2 = 1
                goto L_0x0333
            L_0x0332:
                r2 = 2
            L_0x0333:
                r0.a(r2)
                com.startapp.sdk.adsbase.remoteconfig.MetaData r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                java.lang.String r0 = r0.x()
                if (r0 == 0) goto L_0x03b1
                java.lang.String r2 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                java.lang.String r3 = "\\."
                java.lang.String[] r4 = r0.split(r3)
                java.lang.String[] r2 = r2.split(r3)
                int r3 = r4.length
                int r5 = r2.length
                int r3 = java.lang.Math.min(r3, r5)
                r5 = 0
            L_0x0353:
                if (r5 >= r3) goto L_0x037c
                r6 = r4[r5]     // Catch:{ NumberFormatException -> 0x0367 }
                int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0367 }
                r7 = r2[r5]     // Catch:{ NumberFormatException -> 0x0367 }
                int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0367 }
                if (r6 <= r7) goto L_0x0364
                goto L_0x0372
            L_0x0364:
                if (r6 >= r7) goto L_0x0379
                goto L_0x0376
            L_0x0367:
                r6 = r4[r5]
                r7 = r2[r5]
                int r6 = r6.compareTo(r7)
                if (r6 <= 0) goto L_0x0374
            L_0x0372:
                int r5 = r5 + r10
                goto L_0x038b
            L_0x0374:
                if (r6 >= 0) goto L_0x0379
            L_0x0376:
                int r5 = r5 + r10
                int r5 = -r5
                goto L_0x038b
            L_0x0379:
                int r5 = r5 + 1
                goto L_0x0353
            L_0x037c:
                int r5 = r4.length
                int r6 = r2.length
                if (r5 <= r6) goto L_0x0383
                int r5 = r3 + 1
                goto L_0x038b
            L_0x0383:
                int r4 = r4.length
                int r2 = r2.length
                if (r4 >= r2) goto L_0x038a
                int r3 = r3 + r10
                int r5 = -r3
                goto L_0x038b
            L_0x038a:
                r5 = 0
            L_0x038b:
                if (r5 <= 0) goto L_0x03b1
                android.content.Context r2 = r1.f16843a
                java.lang.String r3 = "Current SDK version ("
                java.lang.StringBuilder r3 = com.startapp.p0.a(r3)
                java.lang.String r4 = com.startapp.sdk.adsbase.StartAppSDK.getVersion()
                r3.append(r4)
                java.lang.String r4 = ") is outdated. Integrate the most recent version ("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ") in order to improve your ads performance."
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = 5
                com.startapp.j9.a((android.content.Context) r2, (int) r3, (java.lang.String) r0, (boolean) r9)
            L_0x03b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.b.a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean):void");
        }

        public void a(MetaDataRequest.RequestReason requestReason) {
            this.f16844b.b().a(0);
        }
    }
}
