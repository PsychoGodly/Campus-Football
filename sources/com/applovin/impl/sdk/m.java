package com.applovin.impl.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.applovin.impl.tr;
import com.applovin.impl.v;
import com.applovin.impl.xl;
import com.applovin.impl.xp;
import com.applovin.impl.y3;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final k f11737a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11738b;

    /* renamed from: c  reason: collision with root package name */
    private final n f11739c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f11740d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f11741e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map f11742f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f11743g = new Object();

    protected m(k kVar) {
        this.f11737a = kVar;
        this.f11738b = k.k();
        this.f11739c = kVar.z();
        this.f11740d = g();
        this.f11742f = f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String h10 = h();
            if (StringUtils.isValidString(h10)) {
                this.f11737a.L();
                if (t.a()) {
                    this.f11737a.L().a("DataCollectorV2", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, h10);
                return;
            }
            this.f11737a.L();
            if (t.a()) {
                this.f11737a.L().b("DataCollectorV2", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            this.f11737a.L();
            if (t.a()) {
                this.f11737a.L().a("DataCollectorV2", "Failed to collect bid token", th);
            }
            this.f11737a.B().a("DataCollectorV2", "collectBidToken", th);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map e() {
        if (!this.f11737a.g0().isLocationCollectionEnabled() || !((Boolean) this.f11737a.a(oj.I4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        s K = this.f11737a.K();
        boolean e10 = K.e();
        CollectionUtils.putBooleanIfValid("loc_services_enabled", Boolean.valueOf(e10), hashMap);
        if (!e10) {
            return hashMap;
        }
        CollectionUtils.putBooleanIfValid("loc_auth", Boolean.valueOf(K.c()), hashMap);
        if (!this.f11737a.K().d()) {
            return hashMap;
        }
        double a10 = K.a();
        k kVar = this.f11737a;
        oj ojVar = oj.K4;
        CollectionUtils.putStringIfValid("loc_lat", zp.a(a10, ((Integer) kVar.a(ojVar)).intValue()), hashMap);
        CollectionUtils.putStringIfValid("loc_long", zp.a(K.b(), ((Integer) this.f11737a.a(ojVar)).intValue()), hashMap);
        return hashMap;
    }

    private Map f() {
        HashMap hashMap = new HashMap(22);
        CollectionUtils.putStringIfValid("app_name", this.f11739c.g().e(), hashMap);
        CollectionUtils.putStringIfValid("app_version", this.f11739c.g().h(), hashMap);
        CollectionUtils.putStringIfValid("package_name", this.f11739c.g().f(), hashMap);
        CollectionUtils.putStringIfValid("vz", this.f11739c.g().j(), hashMap);
        CollectionUtils.putStringIfValid("installer_name", this.f11739c.g().d(), hashMap);
        CollectionUtils.putIntegerIfValid("app_version_code", Integer.valueOf(this.f11739c.g().i()), hashMap);
        CollectionUtils.putIntegerIfValid("target_sdk", Integer.valueOf(this.f11739c.g().g()), hashMap);
        CollectionUtils.putLongIfValid("first_install_v3_ms", this.f11739c.g().a(), hashMap);
        CollectionUtils.putLongIfValid("ia", Long.valueOf(this.f11739c.g().b()), hashMap);
        CollectionUtils.putLongIfValid("ia_v2", this.f11739c.g().c(), hashMap);
        CollectionUtils.putStringIfValid("tg", xp.a(this.f11737a), hashMap);
        CollectionUtils.putStringIfValid("sdk_version", AppLovinSdk.VERSION, hashMap);
        CollectionUtils.putStringIfValid("omid_sdk_version", this.f11737a.Y().c(), hashMap);
        CollectionUtils.putStringIfValid("ad_review_sdk_version", v.b(), hashMap);
        CollectionUtils.putStringIfValid("api_did", (String) this.f11737a.a(oj.f10303g), hashMap);
        CollectionUtils.putBooleanIfValid("debug", Boolean.valueOf(zp.c(this.f11737a)), hashMap);
        CollectionUtils.putBooleanIfValid("j8", Boolean.valueOf(k.B0()), hashMap);
        CollectionUtils.putIntegerIfValid("epv", Integer.valueOf(zp.f()), hashMap);
        CollectionUtils.putLongIfValid("alts_ms", Long.valueOf(k.j()), hashMap);
        CollectionUtils.putBooleanIfValid("ps_tpg", Boolean.valueOf(th.d(this.f11738b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_apg", Boolean.valueOf(th.b(this.f11738b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_capg", Boolean.valueOf(th.c(this.f11738b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_aipg", Boolean.valueOf(th.a(this.f11738b)), hashMap);
        return hashMap;
    }

    private Map g() {
        HashMap hashMap = new HashMap(36);
        CollectionUtils.putStringIfValid("kb", this.f11739c.p(), hashMap);
        CollectionUtils.putBooleanIfValid("gy", Boolean.valueOf(this.f11739c.E()), hashMap);
        CollectionUtils.putDoubleIfValid("tz_offset", Double.valueOf(this.f11739c.z()), hashMap);
        CollectionUtils.putLongIfValid("tm", Long.valueOf(this.f11739c.q().c()), hashMap);
        CollectionUtils.putLongIfValid("tds", Long.valueOf(this.f11739c.A()), hashMap);
        CollectionUtils.putStringIfValid("country_code", this.f11739c.y().b(), hashMap);
        CollectionUtils.putStringIfValid("carrier", this.f11739c.y().a(), hashMap);
        CollectionUtils.putStringIfValid("mcc", this.f11739c.y().d(), hashMap);
        CollectionUtils.putStringIfValid("mnc", this.f11739c.y().e(), hashMap);
        CollectionUtils.putIntegerIfValid("adnsd", Integer.valueOf(this.f11739c.m().b()), hashMap);
        CollectionUtils.putIntegerIfValid("dx", Integer.valueOf(this.f11739c.m().c()), hashMap);
        CollectionUtils.putIntegerIfValid("dy", Integer.valueOf(this.f11739c.m().d()), hashMap);
        CollectionUtils.putFloatIfValid("adns", Float.valueOf(this.f11739c.m().a()), hashMap);
        CollectionUtils.putFloatIfValid("xdpi", Float.valueOf(this.f11739c.m().g()), hashMap);
        CollectionUtils.putFloatIfValid("ydpi", Float.valueOf(this.f11739c.m().h()), hashMap);
        CollectionUtils.putDoubleIfValid("screen_size_in", Double.valueOf(this.f11739c.m().f()), hashMap);
        CollectionUtils.putBooleanIfValid("hdr", this.f11739c.m().e(), hashMap);
        CollectionUtils.putStringIfValid("orientation_lock", this.f11739c.t(), hashMap);
        CollectionUtils.putIntegerIfValid("api_level", Integer.valueOf(Build.VERSION.SDK_INT), hashMap);
        CollectionUtils.putStringIfValid("brand", Build.MANUFACTURER, hashMap);
        CollectionUtils.putStringIfValid("brand_name", Build.BRAND, hashMap);
        CollectionUtils.putStringIfValid("hardware", Build.HARDWARE, hashMap);
        CollectionUtils.putStringIfValid("locale", Locale.getDefault().toString(), hashMap);
        CollectionUtils.putStringIfValid("model", Build.MODEL, hashMap);
        CollectionUtils.putStringIfValid("os", Build.VERSION.RELEASE, hashMap);
        CollectionUtils.putStringIfValid("revision", Build.DEVICE, hashMap);
        CollectionUtils.putStringIfValid("platform", AppLovinSdkUtils.isFireOS(this.f11738b) ? "fireos" : "android", hashMap);
        CollectionUtils.putBooleanIfValid("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()), hashMap);
        CollectionUtils.putBooleanIfValid("aida", Boolean.valueOf(l0.a()), hashMap);
        CollectionUtils.putBooleanIfValid("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f11738b)), hashMap);
        CollectionUtils.putBooleanIfValid("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f11738b)), hashMap);
        CollectionUtils.putLongIfValid("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), hashMap);
        CollectionUtils.putLongIfValid("tbalsi_ms", Long.valueOf(this.f11737a.J() - k.j()), hashMap);
        CollectionUtils.putIntegerIfValid("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()), hashMap);
        CollectionUtils.putJsonArrayIfValid("supported_abis", this.f11739c.x(), hashMap);
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.f11738b)), hashMap);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.f11738b), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.f11738b), hashMap);
        try {
            PackageInfo packageInfo = this.f11738b.getPackageManager().getPackageInfo("com.android.vending", 0);
            CollectionUtils.putStringIfValid("ps_version", packageInfo.versionName, hashMap);
            CollectionUtils.putIntegerIfValid("ps_version_code", Integer.valueOf(packageInfo.versionCode), hashMap);
        } catch (Throwable unused) {
            CollectionUtils.putStringIfValid("ps_version", MaxReward.DEFAULT_LABEL, hashMap);
            CollectionUtils.putIntegerIfValid("ps_version_code", -1, hashMap);
        }
        a((Map) hashMap);
        return hashMap;
    }

    private Map i() {
        return zp.a(a((Map) null, true, false));
    }

    /* access modifiers changed from: protected */
    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f11737a.l0().a((xl) new kn(this.f11737a, ((Boolean) this.f11737a.a(oj.V3)).booleanValue(), "DataCollectorV2", new j1(this, appLovinBidTokenCollectionListener)), sm.b.CORE);
    }

    public Map c() {
        b4.d a10 = this.f11737a.r().a();
        if (a10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("lrm_ts_ms", String.valueOf(a10.c()));
        hashMap.put("lrm_url", a10.d());
        hashMap.put("lrm_ct_ms", String.valueOf(a10.a()));
        hashMap.put("lrm_rs", String.valueOf(a10.b()));
        return hashMap;
    }

    public Map d() {
        return a(false);
    }

    /* access modifiers changed from: protected */
    public String h() {
        String encodeToString = Base64.encodeToString(new JSONObject(i()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f11737a.a(oj.f10349l5)).booleanValue() ? qi.b(encodeToString, zp.a(this.f11737a), qi.a.a(((Integer) this.f11737a.a(oj.f10357m5)).intValue()), this.f11737a.d0(), this.f11737a) : encodeToString;
    }

    public Map j() {
        return this.f11742f;
    }

    public Map k() {
        return this.f11740d;
    }

    public void l() {
        synchronized (this.f11741e) {
            a(this.f11740d);
        }
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap hashMap;
        Map a10 = a(z10);
        Map b10 = b();
        Map c10 = c();
        Map e10 = e();
        Map k02 = this.f11737a.k0();
        Map a11 = a();
        if (z11) {
            hashMap = new HashMap(a11.size() + 19);
            hashMap.put("device_info", a10);
            hashMap.put("app_info", b10);
            if (c10 != null) {
                hashMap.put("connection_info", c10);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (e10 != null) {
                hashMap.put("location_info", e10);
            }
            if (k02 != null) {
                hashMap.put("targeting_data", k02);
            }
        } else {
            int i10 = 0;
            int size = a10.size() + 14 + b10.size() + (map != null ? map.size() : 0) + (e10 != null ? e10.size() : 0);
            if (k02 != null) {
                i10 = k02.size();
            }
            hashMap = new HashMap(size + i10 + a11.size());
            hashMap.putAll(a10);
            hashMap.putAll(b10);
            if (c10 != null) {
                hashMap.putAll(c10);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (e10 != null) {
                hashMap.putAll(e10);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.putAll(k02);
            }
        }
        hashMap.putAll(a11);
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f11737a.Q(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f11737a.A(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f11737a.a(oj.U3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f11737a.o0()), hashMap);
        CollectionUtils.putStringIfValid("rid", UUID.randomUUID().toString(), hashMap);
        if (!((Boolean) this.f11737a.a(oj.f10333j5)).booleanValue()) {
            CollectionUtils.putStringIfValid(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11737a.d0(), hashMap);
        }
        if (((Boolean) this.f11737a.a(oj.L4)).booleanValue()) {
            ba F = this.f11737a.F();
            CollectionUtils.putLongIfValid("li", Long.valueOf(F.b(aa.f6343e)), hashMap);
            CollectionUtils.putLongIfValid("si", Long.valueOf(F.b(aa.f6346h)), hashMap);
            CollectionUtils.putLongIfValid("mad", Long.valueOf(F.b(aa.f6344f)), hashMap);
            CollectionUtils.putLongIfValid("msad", Long.valueOf(F.b(aa.f6347i)), hashMap);
            CollectionUtils.putLongIfValid("pf", Long.valueOf(F.b(aa.f6351m)), hashMap);
            CollectionUtils.putLongIfValid("mpf", Long.valueOf(F.b(aa.f6358t)), hashMap);
            CollectionUtils.putLongIfValid("gpf", Long.valueOf(F.b(aa.f6352n)), hashMap);
            CollectionUtils.putLongIfValid("asoac", Long.valueOf(F.b(aa.f6356r)), hashMap);
        }
        return hashMap;
    }

    public Map b() {
        Map map;
        synchronized (this.f11743g) {
            map = CollectionUtils.map(this.f11742f);
        }
        CollectionUtils.putBooleanIfValid("first_install", Boolean.valueOf(this.f11737a.z0()), map);
        CollectionUtils.putBooleanIfValid("first_install_v2", Boolean.valueOf(!this.f11737a.w0()), map);
        CollectionUtils.putBooleanIfValid("test_ads", Boolean.valueOf(this.f11739c.G()), map);
        CollectionUtils.putBooleanIfValid("muted", Boolean.valueOf(this.f11737a.g0().isMuted()), map);
        if (this.f11737a.r0() != null) {
            CollectionUtils.putStringIfValid("user_segment_name", this.f11737a.r0().getName(), map);
        }
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f11737a.m0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f11737a.m0().k(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f11737a.m0().c(), map);
        if (((Boolean) this.f11737a.a(oj.K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f11737a.t0().c(), map);
        }
        if (((Boolean) this.f11737a.a(oj.N3)).booleanValue()) {
            CollectionUtils.putStringIfValid("compass_random_token", this.f11737a.p(), map);
        }
        if (((Boolean) this.f11737a.a(oj.P3)).booleanValue()) {
            CollectionUtils.putStringIfValid("applovin_random_token", this.f11737a.c0(), map);
        }
        if (this.f11737a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f11737a.b0().a(), map);
        }
        return map;
    }

    public Map a(boolean z10) {
        Map map;
        l0.a aVar;
        synchronized (this.f11741e) {
            map = CollectionUtils.map(this.f11740d);
        }
        if (z10) {
            aVar = this.f11739c.f();
            if (aVar != null) {
                this.f11739c.J();
            } else if (zp.h()) {
                aVar = new l0.a();
                map.put("inc", Boolean.TRUE);
            } else {
                aVar = this.f11739c.d();
            }
        } else {
            aVar = this.f11739c.d();
        }
        CollectionUtils.putBooleanIfValid("huc", y3.b().b(this.f11738b), map);
        CollectionUtils.putBooleanIfValid("aru", y3.c().b(this.f11738b), map);
        CollectionUtils.putBooleanIfValid("dns", y3.a().b(this.f11738b), map);
        CollectionUtils.putBooleanIfValid("dnt", Boolean.valueOf(aVar.c()), map);
        CollectionUtils.putStringIfValid("dnt_code", aVar.b().b(), map);
        CollectionUtils.putStringIfValid("idfa", aVar.a(), map);
        n.c h10 = this.f11739c.h();
        if (h10 != null) {
            CollectionUtils.putStringIfValid("idfv", h10.a(), map);
            CollectionUtils.putIntegerIfValid("idfv_scope", Integer.valueOf(h10.b()), map);
        }
        CollectionUtils.putIntegerIfValid("volume", z10 ? this.f11739c.B() : this.f11739c.i().a(), map);
        CollectionUtils.putIntegerIfValid("lpm", this.f11739c.v().a(), map);
        CollectionUtils.putIntegerIfValid("sb", this.f11739c.w(), map);
        CollectionUtils.putIntegerIfValid("mute_switch", Integer.valueOf(this.f11739c.i().b()), map);
        CollectionUtils.putLongIfValid("fs", this.f11739c.o(), map);
        CollectionUtils.putStringIfValid("network", this.f11739c.r(), map);
        CollectionUtils.putBooleanIfValid("ma", this.f11739c.i().d(), map);
        CollectionUtils.putBooleanIfValid("spo", this.f11739c.i().e(), map);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f11737a.f0().isApplicationPaused()), map);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f11737a.f0().getAppEnteredForegroundTimeMillis()), map);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f11737a.f0().getAppEnteredBackgroundTimeMillis()), map);
        if (((Boolean) this.f11737a.a(oj.Z3)).booleanValue()) {
            CollectionUtils.putLongIfValid("fm", this.f11739c.q().a(), map);
            CollectionUtils.putLongIfValid("lmt", this.f11739c.q().b(), map);
            CollectionUtils.putBooleanIfValid("lm", this.f11739c.q().d(), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10262a4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("rat", this.f11739c.y().c(), map);
        }
        if (((Boolean) this.f11737a.a(oj.X3)).booleanValue()) {
            CollectionUtils.putStringIfValid("so", this.f11739c.i().c(), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10269b4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("vs", Boolean.valueOf(this.f11739c.H()), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10348l4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("da", this.f11739c.k(), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10356m4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("dm", this.f11739c.l(), map);
        }
        if (((Boolean) this.f11737a.a(oj.W3)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("act", this.f11739c.j().b(), map);
            CollectionUtils.putIntegerIfValid("acm", this.f11739c.j().a(), map);
            CollectionUtils.putBooleanIfValid("sowpie", this.f11739c.j().c(), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10316h4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("adr", Boolean.valueOf(this.f11739c.D()), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10292e4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("mtl", Integer.valueOf(this.f11737a.f0().getLastTrimMemoryLevel()), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10340k4)).booleanValue() && zp.d(this.f11737a)) {
            tr.a(this.f11737a);
            CollectionUtils.putStringIfValid("ua", tr.a(), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10444x4)).booleanValue()) {
            tr.b(this.f11737a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map);
        }
        ArrayService l10 = this.f11737a.l();
        if (l10.isAppHubInstalled()) {
            if (l10.getIsDirectDownloadEnabled() != null) {
                CollectionUtils.putBooleanIfValid("ah_dd_enabled", l10.getIsDirectDownloadEnabled(), map);
            }
            CollectionUtils.putLongIfValid("ah_sdk_version_code", Long.valueOf(l10.getAppHubVersionCode()), map);
            CollectionUtils.putStringIfValid("ah_random_user_token", StringUtils.emptyIfNull(l10.getRandomUserToken()), map);
            CollectionUtils.putStringIfValid("ah_sdk_package_name", StringUtils.emptyIfNull(l10.getAppHubPackageName()), map);
        }
        return map;
    }

    private void a(Map map) {
        if (((Boolean) this.f11737a.a(oj.f10340k4)).booleanValue() && zp.d(this.f11737a)) {
            tr.a(this.f11737a);
        }
        if (((Boolean) this.f11737a.a(oj.f10444x4)).booleanValue()) {
            tr.b(this.f11737a);
        }
        if (((Boolean) this.f11737a.a(oj.f10277c4)).booleanValue() && !map.containsKey("af")) {
            CollectionUtils.putLongIfValid("af", Long.valueOf(this.f11739c.e()), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10285d4)).booleanValue() && !map.containsKey("font")) {
            CollectionUtils.putFloatIfValid("font", Float.valueOf(this.f11739c.n()), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10332j4)).booleanValue() && !map.containsKey("sua")) {
            CollectionUtils.putStringIfValid("sua", System.getProperty("http.agent"), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10300f4)).booleanValue() && !map.containsKey("network_restricted")) {
            CollectionUtils.putBooleanIfValid("network_restricted", Boolean.valueOf(this.f11739c.F()), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10364n4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("is_pc", Boolean.valueOf(this.f11739c.C()), map);
        }
        if (((Boolean) this.f11737a.a(oj.f10460z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", this.f11739c.s(), map);
        }
    }

    public Map a() {
        HashMap hashMap = new HashMap(5);
        CollectionUtils.putStringIfValid("sc", (String) this.f11737a.a(oj.f10383q), hashMap);
        CollectionUtils.putStringIfValid("sc2", (String) this.f11737a.a(oj.f10391r), hashMap);
        CollectionUtils.putStringIfValid("sc3", (String) this.f11737a.a(oj.f10399s), hashMap);
        CollectionUtils.putStringIfValid("server_installed_at", (String) this.f11737a.a(oj.f10407t), hashMap);
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f11737a.a(qj.H), hashMap);
        return hashMap;
    }
}
