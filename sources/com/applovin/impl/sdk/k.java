package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.b5;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.im;
import com.applovin.impl.ir;
import com.applovin.impl.ke;
import com.applovin.impl.kj;
import com.applovin.impl.kn;
import com.applovin.impl.le;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.e;
import com.applovin.impl.mediation.f;
import com.applovin.impl.mg;
import com.applovin.impl.oj;
import com.applovin.impl.pe;
import com.applovin.impl.pj;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q;
import com.applovin.impl.qe;
import com.applovin.impl.qj;
import com.applovin.impl.rm;
import com.applovin.impl.rn;
import com.applovin.impl.rr;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.sm;
import com.applovin.impl.te;
import com.applovin.impl.th;
import com.applovin.impl.ue;
import com.applovin.impl.v;
import com.applovin.impl.w4;
import com.applovin.impl.wf;
import com.applovin.impl.xl;
import com.applovin.impl.xn;
import com.applovin.impl.xp;
import com.applovin.impl.yc;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import com.applovin.sdk.AppLovinUserSegment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class k {
    public static k A0;
    protected static Context B0;
    private static final long C0 = System.currentTimeMillis();
    private static final boolean D0;
    private static volatile q E0;
    private static final Object F0 = new Object();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    private String f11654a;

    /* renamed from: a0  reason: collision with root package name */
    private final AtomicReference f11655a0 = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f11656b;

    /* renamed from: b0  reason: collision with root package name */
    private final AtomicReference f11657b0 = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    private long f11658c;

    /* renamed from: c0  reason: collision with root package name */
    private final AtomicReference f11659c0 = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    private long f11660d;

    /* renamed from: d0  reason: collision with root package name */
    private final AtomicReference f11661d0 = new AtomicReference();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11662e = new AtomicBoolean();

    /* renamed from: e0  reason: collision with root package name */
    private final AtomicReference f11663e0 = new AtomicReference();

    /* renamed from: f  reason: collision with root package name */
    private AppLovinSdkSettings f11664f;

    /* renamed from: f0  reason: collision with root package name */
    private final AtomicReference f11665f0 = new AtomicReference();

    /* renamed from: g  reason: collision with root package name */
    private AppLovinUserSegment f11666g;

    /* renamed from: g0  reason: collision with root package name */
    private final AtomicReference f11667g0 = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    private AppLovinTargetingData f11668h;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public List f11669h0;

    /* renamed from: i  reason: collision with root package name */
    private String f11670i;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public final Object f11671i0 = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final AtomicReference f11672j = new AtomicReference();

    /* renamed from: j0  reason: collision with root package name */
    private final AtomicBoolean f11673j0 = new AtomicBoolean(true);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicReference f11674k = new AtomicReference();
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public final AtomicBoolean f11675k0 = new AtomicBoolean();

    /* renamed from: l  reason: collision with root package name */
    private final AtomicReference f11676l = new AtomicReference();
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11677l0 = false;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicReference f11678m = new AtomicReference();

    /* renamed from: m0  reason: collision with root package name */
    private boolean f11679m0 = false;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicReference f11680n = new AtomicReference();

    /* renamed from: n0  reason: collision with root package name */
    private boolean f11681n0 = false;

    /* renamed from: o  reason: collision with root package name */
    private volatile AppLovinSdk f11682o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f11683o0 = false;

    /* renamed from: p  reason: collision with root package name */
    private final t f11684p = new t(this);

    /* renamed from: p0  reason: collision with root package name */
    private boolean f11685p0 = false;

    /* renamed from: q  reason: collision with root package name */
    private final o f11686q = new o(this);

    /* renamed from: q0  reason: collision with root package name */
    private int f11687q0 = 0;

    /* renamed from: r  reason: collision with root package name */
    private final AtomicReference f11688r = new AtomicReference();

    /* renamed from: r0  reason: collision with root package name */
    private String f11689r0;

    /* renamed from: s  reason: collision with root package name */
    private final AtomicReference f11690s = new AtomicReference();

    /* renamed from: s0  reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f11691s0;

    /* renamed from: t  reason: collision with root package name */
    private final AtomicReference f11692t = new AtomicReference();

    /* renamed from: t0  reason: collision with root package name */
    private final Object f11693t0 = new Object();

    /* renamed from: u  reason: collision with root package name */
    private final AtomicReference f11694u = new AtomicReference();
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public AppLovinSdkConfiguration f11695u0 = new SdkConfigurationImpl((List<String>) null, this);

    /* renamed from: v  reason: collision with root package name */
    private final AtomicReference f11696v = new AtomicReference();

    /* renamed from: v0  reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f11697v0;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicReference f11698w = new AtomicReference();

    /* renamed from: w0  reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f11699w0;

    /* renamed from: x  reason: collision with root package name */
    private final AtomicReference f11700x = new AtomicReference();

    /* renamed from: x0  reason: collision with root package name */
    private final AtomicBoolean f11701x0 = new AtomicBoolean(false);

    /* renamed from: y  reason: collision with root package name */
    private final AtomicReference f11702y = new AtomicReference();

    /* renamed from: y0  reason: collision with root package name */
    private final xl f11703y0 = new kn(this, true, "scheduleAdLoadIntegrationError", new e1(this));

    /* renamed from: z  reason: collision with root package name */
    private final AtomicReference f11704z = new AtomicReference();

    /* renamed from: z0  reason: collision with root package name */
    private final xl f11705z0 = new kn(this, true, "sdkInit", new b1(this));

    class a implements f4.c {
        a() {
        }

        public void a(f4.b bVar) {
        }
    }

    class b implements im.b {

        class a implements f4.c {
            a() {
            }

            public void a(f4.b bVar) {
                k.this.L();
                if (t.a()) {
                    t L = k.this.L();
                    L.a("AppLovinSdk", "Unified flow completed with status: " + bVar);
                }
                if (bVar.b()) {
                    k.this.L();
                    if (t.a()) {
                        k.this.L().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
                    }
                    k.this.S0();
                    k.this.P0();
                    return;
                }
                k.this.d("Initializing SDK in MAX environment...");
            }
        }

        b() {
        }

        public void a(JSONObject jSONObject) {
            boolean z10 = jSONObject != null && jSONObject.length() > 0;
            k.this.c(jSONObject);
            e.b(k.this);
            c4.a(jSONObject, z10, k.this);
            k.this.P().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k kVar = k.this;
            List unused = kVar.f11669h0 = kVar.a(jSONObject);
            if (z10) {
                List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", MaxReward.DEFAULT_LABEL));
                k kVar2 = k.this;
                AppLovinSdkConfiguration unused2 = kVar2.f11695u0 = new SdkConfigurationImpl(explode, kVar2);
            }
            k.this.n0().a(jSONObject);
            k.this.b(jSONObject);
            bc.b(((Boolean) k.this.a(oj.f10334j6)).booleanValue());
            bc.a(((Boolean) k.this.a(oj.f10342k6)).booleanValue());
            if (!k.this.D0()) {
                k.this.d("Initializing SDK in non-MAX environment...");
            } else if (k.this.t().e() == g4.a.UNIFIED) {
                Activity p02 = k.this.p0();
                if (k.this.f11675k0.compareAndSet(false, true)) {
                    k.this.t().a();
                    k.this.t().b(p02, new a());
                } else {
                    k.this.d("Initializing SDK in MAX environment...");
                }
            } else {
                k.this.d("Initializing SDK in MAX environment...");
            }
            if (!((Boolean) k.this.a(oj.f10355m3)).booleanValue() || z10 || !c4.a(k.k())) {
                k.this.O0();
                return;
            }
            k.this.L();
            if (t.a()) {
                k.this.L().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.T0();
        }
    }

    class c implements im.b {
        c() {
        }

        public void a(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.length() > 0) {
                k.this.c(jSONObject);
            }
            k.this.f11662e.set(false);
            k.this.O0();
        }
    }

    class d implements wf.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ wf f11710a;

        d(wf wfVar) {
            this.f11710a = wfVar;
        }

        public void a() {
            k.this.L();
            if (t.a()) {
                k.this.L().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f11671i0) {
                if (!k.this.f11677l0) {
                    k.this.S0();
                }
            }
            this.f11710a.b(this);
        }

        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(x0.f12096a);
            D0 = true;
        } catch (Throwable unused) {
            D0 = false;
        }
    }

    public k(Context context) {
        this.f11664f = new AppLovinSdkSettings(context);
        this.f11658c = System.currentTimeMillis();
        this.f11677l0 = true;
        if (B0()) {
            B0 = context.getApplicationContext();
            if (context instanceof Activity) {
                this.f11656b = new WeakReference((Activity) context);
            }
            if (A0 == null) {
                A0 = this;
            } else {
                t.h("AppLovinSdk", "Multiple SDK instances detected");
            }
        } else {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
        }
    }

    public static boolean B0() {
        return D0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F0() {
        if (!l0().d()) {
            L();
            if (t.a()) {
                L().a("AppLovinSdk", "Timing out adapters init...");
            }
            l0().e();
            M0();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G0() {
        sm l02 = l0();
        int i10 = this.f11687q0 + 1;
        this.f11687q0 = i10;
        l02.a((xl) new im(i10, this, new c()), sm.b.CORE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H0() {
        if (D0()) {
            r.b(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I0() {
        synchronized (this.f11671i0) {
            boolean a10 = c4.a(k());
            if (!((Boolean) a(oj.f10363n3)).booleanValue() || a10) {
                S0();
            }
            if (((Boolean) a(oj.f10355m3)).booleanValue() && !a10) {
                L();
                if (t.a()) {
                    L().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                T0();
            }
            if (t().e() == g4.a.TERMS) {
                if (D0()) {
                    L();
                    if (t.a()) {
                        L().a("AppLovinSdk", "MAX mediation detected... Generating consent flow...");
                    }
                    t().a();
                    t().b(p0(), new a());
                } else {
                    L();
                    if (t.a()) {
                        t L2 = L();
                        L2.a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + this.f11670i);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J0() {
        synchronized (this.f11693t0) {
            if (this.f11691s0 == null) {
                this.f11703y0.run();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K0() {
        synchronized (this.f11693t0) {
            if (this.f11691s0 == null) {
                this.f11701x0.set(true);
                this.f11705z0.run();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L0() {
        c(qj.I);
    }

    private w N0() {
        if (!th.f(B0)) {
            return null;
        }
        try {
            return new w(this);
        } catch (Throwable th) {
            t.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void O0() {
        Long l10 = (Long) a(oj.f10427v3);
        if (l10.longValue() >= 0 && this.f11662e.compareAndSet(false, true)) {
            ir.a(l10.longValue(), false, this, new d1(this));
        }
    }

    private void Q0() {
        Context context = B0;
        t L2 = L();
        sj i02 = i0();
        f4 t10 = t();
        a(context);
        f0();
        h();
        l();
        X();
        N().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        if (TextUtils.isEmpty(this.f11654a)) {
            t.h("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            t.h("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable(MaxReward.DEFAULT_LABEL)));
        }
        if (this.f11654a.length() != 86 && zp.c(this)) {
            t.h("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + this.f11654a + ") : " + Log.getStackTraceString(new Throwable(MaxReward.DEFAULT_LABEL)));
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(this.f11654a)) {
            t.h("AppLovinSdk", "Cross Promo SDK has been deprecated and is no longer supported");
            if (zp.c(this)) {
                throw new RuntimeException("Cross Promo SDK has been deprecated and is no longer supported");
            }
            return;
        }
        if (zp.i()) {
            t.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!zp.b(this)) {
            t.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (zp.k(context)) {
            this.f11664f.setVerboseLogging(true);
        }
        h0().a(oj.f10343l, (Object) Boolean.valueOf(this.f11664f.isVerboseLoggingEnabled()));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        qj qjVar = qj.f10999c;
        if (TextUtils.isEmpty((String) i02.a(qjVar, (Object) null, defaultSharedPreferences))) {
            this.f11681n0 = true;
            i02.b(qjVar, (Object) Boolean.toString(true), defaultSharedPreferences);
        } else {
            i02.b(qjVar, (Object) Boolean.toString(false), defaultSharedPreferences);
        }
        qj qjVar2 = qj.f11000d;
        if (((Boolean) i02.a(qjVar2, Boolean.FALSE)).booleanValue()) {
            if (t.a()) {
                L2.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f11683o0 = true;
        } else {
            if (t.a()) {
                L2.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            i02.b(qjVar2, Boolean.TRUE);
            i02.b(qj.f11011o, Boolean.valueOf(t10.k()));
        }
        qj qjVar3 = qj.f11001e;
        String str = (String) i02.a(qjVar3, (Object) null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE > zp.f(str)) {
                i02.b(qjVar3, AppLovinSdk.VERSION);
                return;
            }
            return;
        }
        i02.b(qjVar3, AppLovinSdk.VERSION);
    }

    private Map R() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(oj.f10404s4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    /* access modifiers changed from: private */
    public void R0() {
        Q0();
        if (this.f11664f.isExceptionHandlerEnabled() && ((Boolean) a(oj.f10447y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        int parseInt = StringUtils.parseInt(this.f11664f.getExtraParameters().get("initialization_delay_ms"), ((Integer) a(oj.f10396r4)).intValue());
        sm l02 = l0();
        kn knVar = new kn(this, true, "scheduleAdLoadIntegrationErrorAuto", new a1(this));
        sm.b bVar = sm.b.CORE;
        long j10 = (long) parseInt;
        l02.a((xl) knVar, bVar, j10);
        l0().a((xl) new kn(this, true, "scheduleSdkInit", new y0(this)), bVar, j10);
    }

    /* access modifiers changed from: private */
    public void T0() {
        wf X2 = X();
        X2.a((wf.a) new d(X2));
    }

    public static long j() {
        return C0;
    }

    public static Context k() {
        return B0;
    }

    public String A() {
        return this.f11689r0;
    }

    public boolean A0() {
        boolean z10;
        synchronized (this.f11671i0) {
            z10 = this.f11677l0;
        }
        return z10;
    }

    public o B() {
        return this.f11686q;
    }

    public EventServiceImpl C() {
        Object obj = this.f11676l.get();
        if (obj == null) {
            synchronized (this.f11676l) {
                obj = this.f11676l.get();
                if (obj == null) {
                    obj = new EventServiceImpl(this);
                    this.f11676l.set(obj);
                }
            }
        }
        if (obj == this.f11676l) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public AtomicBoolean C0() {
        return this.f11701x0;
    }

    public p D() {
        Object obj = this.G.get();
        if (obj == null) {
            synchronized (this.G) {
                obj = this.G.get();
                if (obj == null) {
                    obj = new p(this);
                    this.G.set(obj);
                }
            }
        }
        if (obj == this.G) {
            obj = null;
        }
        return (p) obj;
    }

    public boolean D0() {
        return StringUtils.containsIgnoreCase(Q(), AppLovinMediationProvider.MAX);
    }

    public q E() {
        Object obj = this.I.get();
        if (obj == null) {
            synchronized (this.I) {
                obj = this.I.get();
                if (obj == null) {
                    obj = new q(this);
                    this.I.set(obj);
                }
            }
        }
        if (obj == this.I) {
            obj = null;
        }
        return (q) obj;
    }

    public boolean E0() {
        return zp.a("com.unity3d.player.UnityPlayerActivity");
    }

    public ba F() {
        Object obj = this.f11694u.get();
        if (obj == null) {
            synchronized (this.f11694u) {
                obj = this.f11694u.get();
                if (obj == null) {
                    obj = new ba(this);
                    this.f11694u.set(obj);
                }
            }
        }
        if (obj == this.f11694u) {
            obj = null;
        }
        return (ba) obj;
    }

    public yc G() {
        Object obj = this.f11657b0.get();
        if (obj == null) {
            synchronized (this.f11657b0) {
                obj = this.f11657b0.get();
                if (obj == null) {
                    obj = new yc(this);
                    this.f11657b0.set(obj);
                }
            }
        }
        if (obj == this.f11657b0) {
            obj = null;
        }
        return (yc) obj;
    }

    public Activity H() {
        WeakReference weakReference = this.f11656b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public AppLovinSdkInitializationConfiguration I() {
        return this.f11691s0;
    }

    public long J() {
        return this.f11658c;
    }

    public s K() {
        Object obj = this.S.get();
        if (obj == null) {
            synchronized (this.S) {
                obj = this.S.get();
                if (obj == null) {
                    obj = new s(this);
                    this.S.set(obj);
                }
            }
        }
        if (obj == this.S) {
            obj = null;
        }
        return (s) obj;
    }

    public t L() {
        return this.f11684p;
    }

    public com.applovin.impl.mediation.d M() {
        Object obj = this.f11665f0.get();
        if (obj == null) {
            synchronized (this.f11665f0) {
                obj = this.f11665f0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.d(this);
                    this.f11665f0.set(obj);
                }
            }
        }
        if (obj == this.f11665f0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public void M0() {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if ((!t().j() || t().e() != g4.a.UNIFIED) && (sdkInitializationListener = this.f11697v0) != null) {
            if (y0()) {
                this.f11697v0 = null;
                this.f11699w0 = null;
                N().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else if (this.f11699w0 != sdkInitializationListener) {
                N().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) a(oj.f10423v)).booleanValue()) {
                    this.f11697v0 = null;
                } else {
                    this.f11699w0 = sdkInitializationListener;
                }
            } else {
                return;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new f1(this, sdkInitializationListener), Math.max(0, ((Long) a(oj.f10431w)).longValue()));
        }
    }

    public e N() {
        Object obj = this.Z.get();
        if (obj == null) {
            synchronized (this.Z) {
                obj = this.Z.get();
                if (obj == null) {
                    obj = new e(this);
                    this.Z.set(obj);
                }
            }
        }
        if (obj == this.Z) {
            obj = null;
        }
        return (e) obj;
    }

    public f O() {
        Object obj = this.Y.get();
        if (obj == null) {
            synchronized (this.Y) {
                obj = this.Y.get();
                if (obj == null) {
                    obj = new f(this);
                    this.Y.set(obj);
                }
            }
        }
        if (obj == this.Y) {
            obj = null;
        }
        return (f) obj;
    }

    public pe P() {
        Object obj = this.f11661d0.get();
        if (obj == null) {
            synchronized (this.f11661d0) {
                obj = this.f11661d0.get();
                if (obj == null) {
                    obj = new pe(this);
                    this.f11661d0.set(obj);
                }
            }
        }
        if (obj == this.f11661d0) {
            obj = null;
        }
        return (pe) obj;
    }

    public void P0() {
        o().a();
    }

    public String Q() {
        String str = (String) a(qj.I);
        if (StringUtils.isValidString(str)) {
            return str;
        }
        return this.f11670i;
    }

    public MediationServiceImpl S() {
        Object obj = this.f11655a0.get();
        if (obj == null) {
            synchronized (this.f11655a0) {
                obj = this.f11655a0.get();
                if (obj == null) {
                    obj = new MediationServiceImpl(this);
                    this.f11655a0.set(obj);
                }
            }
        }
        if (obj == this.f11655a0) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public void S0() {
        synchronized (this.f11671i0) {
            this.f11677l0 = true;
            l0().f();
            d();
        }
    }

    public te T() {
        Object obj = this.f11696v.get();
        if (obj == null) {
            synchronized (this.f11696v) {
                obj = this.f11696v.get();
                if (obj == null) {
                    obj = new te(this);
                    this.f11696v.set(obj);
                }
            }
        }
        if (obj == this.f11696v) {
            obj = null;
        }
        return (te) obj;
    }

    public ue U() {
        Object obj = this.f11659c0.get();
        if (obj == null) {
            synchronized (this.f11659c0) {
                obj = this.f11659c0.get();
                if (obj == null) {
                    obj = new ue();
                    this.f11659c0.set(obj);
                }
            }
        }
        if (obj == this.f11659c0) {
            obj = null;
        }
        return (ue) obj;
    }

    public void U0() {
        t.h("AppLovinSdk", "Resetting SDK state...");
        ba F2 = F();
        aa aaVar = aa.f6350l;
        long b10 = F2.b(aaVar);
        h0().a();
        h0().e();
        F().a();
        F().b(aaVar, b10 + 1);
        if (this.f11673j0.compareAndSet(true, false)) {
            S0();
        } else {
            this.f11673j0.set(true);
        }
    }

    public u V() {
        Object obj = this.f11663e0.get();
        if (obj == null) {
            synchronized (this.f11663e0) {
                obj = this.f11663e0.get();
                if (obj == null) {
                    obj = new u(this);
                    this.f11663e0.set(obj);
                }
            }
        }
        if (obj == this.f11663e0) {
            obj = null;
        }
        return (u) obj;
    }

    public void V0() {
        if (!StringUtils.isValidString(this.f11689r0)) {
            this.f11689r0 = AppLovinMediationProvider.MAX;
            L();
            if (t.a()) {
                L().a("AppLovinSdk", "Detected mediation provider: MAX");
            }
        }
    }

    public AppLovinNativeAdService W() {
        Object obj = this.f11674k.get();
        if (obj == null) {
            synchronized (this.f11674k) {
                obj = this.f11674k.get();
                if (obj == null) {
                    obj = new AppLovinNativeAdService(this);
                    this.f11674k.set(obj);
                }
            }
        }
        if (obj == this.f11674k) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public void W0() {
        v().n();
    }

    public wf X() {
        Object obj = this.K.get();
        if (obj == null) {
            synchronized (this.K) {
                obj = this.K.get();
                if (obj == null) {
                    obj = new wf(k());
                    this.K.set(obj);
                }
            }
        }
        if (obj == this.K) {
            obj = null;
        }
        return (wf) obj;
    }

    public void X0() {
        a((Map) null);
    }

    public mg Y() {
        Object obj = this.R.get();
        if (obj == null) {
            synchronized (this.R) {
                obj = this.R.get();
                if (obj == null) {
                    obj = new mg(this);
                    this.R.set(obj);
                }
            }
        }
        if (obj == this.R) {
            obj = null;
        }
        return (mg) obj;
    }

    public com.applovin.impl.sdk.network.b Z() {
        Object obj = this.W.get();
        if (obj == null) {
            synchronized (this.W) {
                obj = this.W.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.network.b(this);
                    this.W.set(obj);
                }
            }
        }
        if (obj == this.W) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public Object a(oj ojVar) {
        return h0().a(ojVar);
    }

    public PostbackServiceImpl a0() {
        Object obj = this.V.get();
        if (obj == null) {
            synchronized (this.V) {
                obj = this.V.get();
                if (obj == null) {
                    obj = new PostbackServiceImpl(this);
                    this.V.set(obj);
                }
            }
        }
        if (obj == this.V) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public List b(oj ojVar) {
        return h0().b(ojVar);
    }

    public w b0() {
        Object obj = this.A.get();
        if (obj == null) {
            synchronized (this.A) {
                obj = this.A.get();
                if (obj == null) {
                    obj = N0();
                    if (obj == null) {
                        obj = this.A;
                    }
                    this.A.set(obj);
                }
            }
        }
        if (obj == this.A) {
            obj = null;
        }
        return (w) obj;
    }

    public List c(oj ojVar) {
        return h0().c(ojVar);
    }

    public String c0() {
        return t0().a();
    }

    public String d0() {
        return this.f11654a;
    }

    public kj e0() {
        Object obj = this.M.get();
        if (obj == null) {
            synchronized (this.M) {
                obj = this.M.get();
                if (obj == null) {
                    obj = new kj(this);
                    this.M.set(obj);
                }
            }
        }
        if (obj == this.M) {
            obj = null;
        }
        return (kj) obj;
    }

    public SessionTracker f0() {
        Object obj = this.H.get();
        if (obj == null) {
            synchronized (this.H) {
                obj = this.H.get();
                if (obj == null) {
                    obj = new SessionTracker(this);
                    this.H.set(obj);
                }
            }
        }
        if (obj == this.H) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public c g() {
        Object obj = this.E.get();
        if (obj == null) {
            synchronized (this.E) {
                obj = this.E.get();
                if (obj == null) {
                    obj = new c(this);
                    this.E.set(obj);
                }
            }
        }
        if (obj == this.E) {
            obj = null;
        }
        return (c) obj;
    }

    public AppLovinSdkSettings g0() {
        return this.f11664f;
    }

    public v h() {
        Object obj = this.X.get();
        if (obj == null) {
            synchronized (this.X) {
                obj = this.X.get();
                if (obj == null) {
                    obj = new v(this);
                    this.X.set(obj);
                }
            }
        }
        if (obj == this.X) {
            obj = null;
        }
        return (v) obj;
    }

    public pj h0() {
        Object obj = this.f11690s.get();
        if (obj == null) {
            synchronized (this.f11690s) {
                obj = this.f11690s.get();
                if (obj == null) {
                    obj = new pj(this);
                    this.f11690s.set(obj);
                }
            }
        }
        if (obj == this.f11690s) {
            obj = null;
        }
        return (pj) obj;
    }

    public AppLovinAdServiceImpl i() {
        Object obj = this.f11672j.get();
        if (obj == null) {
            synchronized (this.f11672j) {
                obj = this.f11672j.get();
                if (obj == null) {
                    obj = new AppLovinAdServiceImpl(this);
                    this.f11672j.set(obj);
                }
            }
        }
        if (obj == this.f11672j) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public sj i0() {
        Object obj = this.B.get();
        if (obj == null) {
            synchronized (this.B) {
                obj = this.B.get();
                if (obj == null) {
                    obj = new sj(this);
                    this.B.set(obj);
                }
            }
        }
        if (obj == this.B) {
            obj = null;
        }
        return (sj) obj;
    }

    public AppLovinTargetingDataImpl j0() {
        return (AppLovinTargetingDataImpl) this.f11668h;
    }

    public Map k0() {
        if (j0() == null) {
            return null;
        }
        return C0().get() ? j0().getAllData() : j0().getJsonData();
    }

    public ArrayService l() {
        Object obj = this.T.get();
        if (obj == null) {
            synchronized (this.T) {
                obj = this.T.get();
                if (obj == null) {
                    obj = new ArrayService(this);
                    this.T.set(obj);
                }
            }
        }
        if (obj == this.T) {
            obj = null;
        }
        return (ArrayService) obj;
    }

    public sm l0() {
        Object obj = this.f11688r.get();
        if (obj == null) {
            synchronized (this.f11688r) {
                obj = this.f11688r.get();
                if (obj == null) {
                    obj = new sm(this);
                    this.f11688r.set(obj);
                }
            }
        }
        if (obj == this.f11688r) {
            obj = null;
        }
        return (sm) obj;
    }

    public f m() {
        Object obj = this.N.get();
        if (obj == null) {
            synchronized (this.N) {
                obj = this.N.get();
                if (obj == null) {
                    obj = new f(this);
                    this.N.set(obj);
                }
            }
        }
        if (obj == this.N) {
            obj = null;
        }
        return (f) obj;
    }

    public rn m0() {
        Object obj = this.P.get();
        if (obj == null) {
            synchronized (this.P) {
                obj = this.P.get();
                if (obj == null) {
                    obj = new rn(this);
                    this.P.set(obj);
                }
            }
        }
        if (obj == this.P) {
            obj = null;
        }
        return (rn) obj;
    }

    public CmpServiceImpl n() {
        Object obj = this.f11680n.get();
        if (obj == null) {
            synchronized (this.f11680n) {
                obj = this.f11680n.get();
                if (obj == null) {
                    obj = new CmpServiceImpl(this);
                    this.f11680n.set(obj);
                }
            }
        }
        if (obj == this.f11680n) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public xn n0() {
        Object obj = this.f11667g0.get();
        if (obj == null) {
            synchronized (this.f11667g0) {
                obj = this.f11667g0.get();
                if (obj == null) {
                    obj = new xn(this);
                    this.f11667g0.set(obj);
                }
            }
        }
        if (obj == this.f11667g0) {
            obj = null;
        }
        return (xn) obj;
    }

    public h o() {
        Object obj = this.L.get();
        if (obj == null) {
            synchronized (this.L) {
                obj = this.L.get();
                if (obj == null) {
                    obj = new h(this);
                    this.L.set(obj);
                }
            }
        }
        if (obj == this.L) {
            obj = null;
        }
        return (h) obj;
    }

    public long o0() {
        if (this.f11660d == 0) {
            return -1;
        }
        return System.currentTimeMillis() - this.f11660d;
    }

    public String p() {
        return t0().b();
    }

    public Activity p0() {
        Activity b10 = a(k()).b();
        if (b10 != null) {
            return b10;
        }
        return H();
    }

    public AppLovinSdkConfiguration q() {
        return this.f11695u0;
    }

    public String q0() {
        return t0().c();
    }

    public b4 r() {
        Object obj = this.f11692t.get();
        if (obj == null) {
            synchronized (this.f11692t) {
                obj = this.f11692t.get();
                if (obj == null) {
                    obj = new b4(this);
                    this.f11692t.set(obj);
                }
            }
        }
        if (obj == this.f11692t) {
            obj = null;
        }
        return (b4) obj;
    }

    public AppLovinUserSegment r0() {
        return this.f11666g;
    }

    public j s() {
        Object obj = this.C.get();
        if (obj == null) {
            synchronized (this.C) {
                obj = this.C.get();
                if (obj == null) {
                    obj = new j(this);
                    this.C.set(obj);
                }
            }
        }
        if (obj == this.C) {
            obj = null;
        }
        return (j) obj;
    }

    public UserServiceImpl s0() {
        Object obj = this.f11678m.get();
        if (obj == null) {
            synchronized (this.f11678m) {
                obj = this.f11678m.get();
                if (obj == null) {
                    obj = new UserServiceImpl(this);
                    this.f11678m.set(obj);
                }
            }
        }
        if (obj == this.f11678m) {
            obj = null;
        }
        return (UserServiceImpl) obj;
    }

    public f4 t() {
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                obj = this.O.get();
                if (obj == null) {
                    obj = new f4(this);
                    this.O.set(obj);
                }
            }
        }
        if (obj == this.O) {
            obj = null;
        }
        return (f4) obj;
    }

    public xp t0() {
        Object obj = this.D.get();
        if (obj == null) {
            synchronized (this.D) {
                obj = this.D.get();
                if (obj == null) {
                    obj = new xp(this);
                    this.D.set(obj);
                }
            }
        }
        if (obj == this.D) {
            obj = null;
        }
        return (xp) obj;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f11654a + '\'' + ", enabled=" + this.f11679m0 + ", isFirstSession=" + this.f11681n0 + '}';
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings u() {
        return g0().getBackingConsentFlowSettings();
    }

    public rr u0() {
        Object obj = this.J.get();
        if (obj == null) {
            synchronized (this.J) {
                obj = this.J.get();
                if (obj == null) {
                    obj = new rr(this);
                    this.J.set(obj);
                }
            }
        }
        if (obj == this.J) {
            obj = null;
        }
        return (rr) obj;
    }

    public w4 v() {
        Object obj = this.Q.get();
        if (obj == null) {
            synchronized (this.Q) {
                obj = this.Q.get();
                if (obj == null) {
                    obj = new w4(this);
                    this.Q.set(obj);
                }
            }
        }
        if (obj == this.Q) {
            obj = null;
        }
        return (w4) obj;
    }

    public AppLovinSdk v0() {
        return this.f11682o;
    }

    public b5 w() {
        Object obj = this.U.get();
        if (obj == null) {
            synchronized (this.U) {
                obj = this.U.get();
                if (obj == null) {
                    obj = new b5(this);
                    this.U.set(obj);
                }
            }
        }
        if (obj == this.U) {
            obj = null;
        }
        return (b5) obj;
    }

    public boolean w0() {
        return this.f11683o0;
    }

    public l x() {
        Object obj = this.f11700x.get();
        if (obj == null) {
            synchronized (this.f11700x) {
                obj = this.f11700x.get();
                if (obj == null) {
                    obj = new l(this);
                    this.f11700x.set(obj);
                }
            }
        }
        if (obj == this.f11700x) {
            obj = null;
        }
        return (l) obj;
    }

    public boolean x0() {
        Boolean bool;
        Object obj = this.f11704z.get();
        Object obj2 = obj;
        if (obj == null) {
            synchronized (this.f11704z) {
                Object obj3 = this.f11704z.get();
                bool = obj3;
                if (obj3 == null) {
                    Boolean bool2 = (Boolean) a(oj.F3);
                    bool2.booleanValue();
                    this.f11704z.set(bool2);
                    bool = bool2;
                }
            }
            obj2 = bool;
        }
        return ((Boolean) obj2).booleanValue();
    }

    public m y() {
        Object obj = this.f11702y.get();
        m mVar = null;
        if (obj == null) {
            synchronized (this.f11702y) {
                obj = this.f11702y.get();
                if (obj == null) {
                    obj = x0() ? new m(this) : null;
                    if (obj == null) {
                        obj = this.f11702y;
                    }
                    this.f11702y.set(obj);
                }
            }
        }
        if (obj != this.f11702y) {
            mVar = obj;
        }
        return mVar;
    }

    public boolean y0() {
        boolean z10;
        synchronized (this.f11671i0) {
            z10 = this.f11679m0;
        }
        return z10;
    }

    public n z() {
        Object obj = this.f11698w.get();
        n nVar = null;
        if (obj == null) {
            synchronized (this.f11698w) {
                obj = this.f11698w.get();
                if (obj == null) {
                    obj = x0() ? new n(this) : null;
                    if (obj == null) {
                        obj = this.f11698w;
                    }
                    this.f11698w.set(obj);
                }
            }
        }
        if (obj != this.f11698w) {
            nVar = obj;
        }
        return nVar;
    }

    public boolean z0() {
        return this.f11681n0;
    }

    private void d() {
        sm l02 = l0();
        int i10 = this.f11687q0 + 1;
        this.f11687q0 = i10;
        l02.a((xl) new im(i10, this, new b()), sm.b.CORE);
    }

    public Object a(qj qjVar) {
        return a(qjVar, (Object) null);
    }

    public Object b(qj qjVar) {
        return i0().a(qjVar);
    }

    public void c(qj qjVar) {
        i0().b(qjVar);
    }

    public q e() {
        return a(B0);
    }

    public a f() {
        Object obj = this.F.get();
        if (obj == null) {
            synchronized (this.F) {
                obj = this.F.get();
                if (obj == null) {
                    obj = new a(this);
                    this.F.set(obj);
                }
            }
        }
        if (obj == this.F) {
            obj = null;
        }
        return (a) obj;
    }

    public void g(String str) {
        L();
        if (t.a()) {
            t L2 = L();
            L2.a("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        if (zp.h()) {
            zp.a((Runnable) new w0(this, str));
        } else {
            t0().a(str);
        }
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", str);
        }
        l0().a((xl) new rm(this));
    }

    public Object a(qj qjVar, Object obj) {
        return i0().a(qjVar, obj);
    }

    public void b(qj qjVar, Object obj) {
        i0().b(qjVar, obj);
    }

    public void e(String str) {
        L();
        if (t.a()) {
            t L2 = L();
            L2.a("AppLovinSdk", "setMediationProvider(mediationProvider=" + str + ")");
        }
        if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
            this.f11670i = str;
            if (zp.h()) {
                zp.a((Runnable) new s0(this));
            } else {
                c(qj.I);
            }
        } else {
            t.h("AppLovinSdk", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
        }
    }

    public void f(String str) {
        t.g("AppLovinSdk", "Setting plugin version: " + str);
        if (zp.h()) {
            zp.a((Runnable) new v0(this, str));
        } else {
            h0().a(oj.U3, (Object) str);
        }
    }

    public Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        return i0().a(qjVar, obj, sharedPreferences);
    }

    public void b(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        i0().b(qjVar, obj, sharedPreferences);
    }

    /* access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        this.f11660d = System.currentTimeMillis();
        c4.c(jSONObject, this);
        c4.b(jSONObject, this);
        c4.a(jSONObject, this);
        le.f(jSONObject, this);
        le.d(jSONObject, this);
        le.e(jSONObject, this);
        le.a(jSONObject);
    }

    public boolean a(oj ojVar, MaxAdFormat maxAdFormat) {
        return b(ojVar).contains(maxAdFormat);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f11695u0);
    }

    public void a(ke keVar) {
        if (!l0().d()) {
            List c10 = c(qe.G6);
            if (c10.size() > 0 && N().a().keySet().containsAll(c10)) {
                L();
                if (t.a()) {
                    L().a("AppLovinSdk", "All required adapters initialized");
                }
                l0().e();
                M0();
            }
        }
    }

    public static void b(Context context) {
        if (context != null) {
            B0 = context.getApplicationContext();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f11695u0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        Q0();
        this.f11664f.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            t.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            h0().a(oj.U3, (Object) pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(oj.f10447y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        sm l02 = l0();
        xl xlVar = this.f11703y0;
        sm.b bVar = sm.b.CORE;
        l02.a(xlVar, bVar);
        l0().a(this.f11705z0, bVar);
    }

    public void c() {
        synchronized (this.f11671i0) {
            if (!this.f11677l0 && !this.f11679m0) {
                S0();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f11695u0);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f11682o = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    /* access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        for (String h10 : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
            t.h("AppLovinSdk", h10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        t0().a(str);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return MaxReward.DEFAULT_LABEL;
        }
        Context k10 = k();
        return a(k10.getResources().getIdentifier(str, "string", k10.getPackageName()), list);
    }

    public String b() {
        if (StringUtils.isValidString(this.f11689r0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map R2 = R();
        List c10 = c(oj.f10420u4);
        Boolean bool = (Boolean) a(oj.f10428v4);
        if (R2.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer num = (Integer) a(oj.f10412t4);
            int length = stackTrace.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (num.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = c10.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (className.startsWith((String) it.next())) {
                            break;
                        }
                    } else {
                        for (Map.Entry entry : R2.entrySet()) {
                            if (className.startsWith((String) entry.getKey())) {
                                this.f11689r0 = (String) entry.getValue();
                                L();
                                if (t.a()) {
                                    t L2 = L();
                                    L2.a("AppLovinSdk", "Detected mediation provider: " + this.f11689r0);
                                }
                                return null;
                            }
                        }
                        if (bool.booleanValue()) {
                            arrayList.add(className);
                        }
                        num = Integer.valueOf(num.intValue() - 1);
                    }
                }
                i10++;
            }
        } catch (Throwable th) {
            B().a("AppLovinSdk", "detectMediationProvider", th);
        }
        this.f11689r0 = "unknown";
        L();
        if (t.a()) {
            L().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String join = StringUtils.join(",", arrayList);
        if (!((Boolean) a(oj.f10436w4)).booleanValue()) {
            return join;
        }
        B().a(o.b.GENERIC, "detectMediationProvider", (Map) CollectionUtils.hashMap("details", join));
        return null;
    }

    public static String a(int i10, List list) {
        String string = k().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static q a(Context context) {
        if (E0 == null) {
            synchronized (F0) {
                if (E0 == null) {
                    E0 = new q(context);
                }
            }
        }
        return E0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.sdk.AppLovinSdkInitializationConfiguration r3, com.applovin.sdk.AppLovinSdk.SdkInitializationListener r4) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f11701x0
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0029
            java.lang.String r3 = "AppLovinSdk"
            java.lang.String r4 = "Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions"
            com.applovin.impl.sdk.t.h(r3, r4)
            com.applovin.impl.sdk.o r3 = r2.B()
            com.applovin.impl.sdk.o$b r4 = com.applovin.impl.sdk.o.b.INTEGRATION_ERROR
            java.lang.String r0 = "legacy_init_already"
            r3.a((com.applovin.impl.sdk.o.b) r4, (java.lang.String) r0)
            boolean r3 = com.applovin.impl.zp.c((com.applovin.impl.sdk.k) r2)
            if (r3 != 0) goto L_0x0021
            return
        L_0x0021:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions"
            r3.<init>(r4)
            throw r3
        L_0x0029:
            java.lang.Object r0 = r2.f11693t0
            monitor-enter(r0)
            com.applovin.sdk.AppLovinSdkInitializationConfiguration r1 = r2.f11691s0     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0044
            boolean r3 = r2.y0()     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0042
            if (r4 == 0) goto L_0x0042
            com.applovin.impl.sdk.t0 r3 = new com.applovin.impl.sdk.t0     // Catch:{ all -> 0x006a }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x006a }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r3)     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x0044:
            r2.f11691s0 = r3     // Catch:{ all -> 0x006a }
            r2.f11697v0 = r4     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r3.getSdkKey()     // Catch:{ all -> 0x006a }
            r2.f11654a = r4     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r3.getMediationProvider()     // Catch:{ all -> 0x006a }
            r2.f11670i = r4     // Catch:{ all -> 0x006a }
            com.applovin.sdk.AppLovinTargetingData r4 = r3.getTargetingData()     // Catch:{ all -> 0x006a }
            r2.f11668h = r4     // Catch:{ all -> 0x006a }
            com.applovin.sdk.AppLovinUserSegment r4 = r3.getUserSegment()     // Catch:{ all -> 0x006a }
            r2.f11666g = r4     // Catch:{ all -> 0x006a }
            com.applovin.impl.sdk.u0 r4 = new com.applovin.impl.sdk.u0     // Catch:{ all -> 0x006a }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x006a }
            com.applovin.impl.zp.a((java.lang.Runnable) r4)     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.a(com.applovin.sdk.AppLovinSdkInitializationConfiguration, com.applovin.sdk.AppLovinSdk$SdkInitializationListener):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        h0().a(oj.U3, (Object) str);
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings) {
        C0().set(true);
        this.f11654a = str;
        this.f11664f = appLovinSdkSettings;
        this.f11666g = new AppLovinUserSegment();
        this.f11668h = new AppLovinTargetingDataImpl();
        zp.a((Runnable) new c1(this));
    }

    /* access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", MaxReward.DEFAULT_LABEL).split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String formatFromString : asList) {
            MaxAdFormat formatFromString2 = MaxAdFormat.formatFromString(formatFromString);
            if (formatFromString2 != null) {
                arrayList.add(formatFromString2);
            }
        }
        return arrayList;
    }

    public void a(boolean z10) {
        synchronized (this.f11671i0) {
            this.f11677l0 = false;
            this.f11679m0 = z10;
        }
        if (z10) {
            List c10 = c(qe.G6);
            if (c10.isEmpty()) {
                l0().e();
                M0();
                return;
            }
            Long l10 = (Long) a(qe.H6);
            kn knVar = new kn(this, true, "timeoutInitAdapters", new z0(this));
            L();
            if (t.a()) {
                t L2 = L();
                L2.a("AppLovinSdk", "Waiting for required adapters to init: " + c10 + " - timing out in " + l10 + "ms...");
            }
            l0().a(knVar, sm.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f11669h0;
        return list != null && list.size() > 0 && !this.f11669h0.contains(maxAdFormat);
    }

    public void a() {
        String str = (String) i0().a(qj.f11001e, (Object) null);
        if (StringUtils.isValidString(str) && AppLovinSdk.VERSION_CODE < zp.f(str)) {
            t.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
        }
    }

    public void a(Map map) {
        P().a(map);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        i0().a(str, obj, editor);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return sj.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        i0().a(sharedPreferences);
    }

    public void a(long j10) {
        s().b(j10);
    }

    public void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!y0()) {
            this.f11697v0 = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new g1(this, sdkInitializationListener));
        }
    }
}
