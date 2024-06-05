package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.measurement.internal.y6;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class y4 extends u6 {

    /* renamed from: z  reason: collision with root package name */
    static final Pair<String, Long> f25264z = new Pair<>(MaxReward.DEFAULT_LABEL, 0L);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f25265c;

    /* renamed from: d  reason: collision with root package name */
    public c5 f25266d;

    /* renamed from: e  reason: collision with root package name */
    public final d5 f25267e = new d5(this, "first_open_time", 0);

    /* renamed from: f  reason: collision with root package name */
    public final d5 f25268f = new d5(this, "app_install_time", 0);

    /* renamed from: g  reason: collision with root package name */
    public final e5 f25269g = new e5(this, "app_instance_id", (String) null);

    /* renamed from: h  reason: collision with root package name */
    private String f25270h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f25271i;

    /* renamed from: j  reason: collision with root package name */
    private long f25272j;

    /* renamed from: k  reason: collision with root package name */
    public final d5 f25273k = new d5(this, "session_timeout", 1800000);

    /* renamed from: l  reason: collision with root package name */
    public final b5 f25274l = new b5(this, "start_new_session", true);

    /* renamed from: m  reason: collision with root package name */
    public final e5 f25275m = new e5(this, "non_personalized_ads", (String) null);

    /* renamed from: n  reason: collision with root package name */
    public final a5 f25276n = new a5(this, "last_received_uri_timestamps_by_source", (Bundle) null);

    /* renamed from: o  reason: collision with root package name */
    public final b5 f25277o = new b5(this, "allow_remote_dynamite", false);

    /* renamed from: p  reason: collision with root package name */
    public final d5 f25278p = new d5(this, "last_pause_time", 0);

    /* renamed from: q  reason: collision with root package name */
    public final d5 f25279q = new d5(this, "session_id", 0);

    /* renamed from: r  reason: collision with root package name */
    public boolean f25280r;

    /* renamed from: s  reason: collision with root package name */
    public b5 f25281s = new b5(this, "app_backgrounded", false);

    /* renamed from: t  reason: collision with root package name */
    public b5 f25282t = new b5(this, "deep_link_retrieval_complete", false);

    /* renamed from: u  reason: collision with root package name */
    public d5 f25283u = new d5(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: v  reason: collision with root package name */
    public final e5 f25284v = new e5(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: w  reason: collision with root package name */
    public final e5 f25285w = new e5(this, "deferred_attribution_cache", (String) null);

    /* renamed from: x  reason: collision with root package name */
    public final d5 f25286x = new d5(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: y  reason: collision with root package name */
    public final a5 f25287y = new a5(this, "default_event_parameters", (Bundle) null);

    y4(w5 w5Var) {
        super(w5Var);
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences A() {
        i();
        j();
        q.k(this.f25265c);
        return this.f25265c;
    }

    /* access modifiers changed from: package-private */
    public final void B(String str) {
        i();
        SharedPreferences.Editor edit = A().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final SparseArray<Long> C() {
        Bundle a10 = this.f25276n.a();
        if (a10 == null) {
            return new SparseArray<>();
        }
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().B().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* access modifiers changed from: package-private */
    public final v D() {
        i();
        return v.c(A().getString("dma_consent_settings", (String) null));
    }

    /* access modifiers changed from: package-private */
    public final y6 E() {
        i();
        return y6.f(A().getString("consent_settings", "G1"), A().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final Boolean F() {
        i();
        if (!A().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(A().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final Boolean G() {
        i();
        if (A().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(A().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Boolean H() {
        i();
        if (A().contains("measurement_enabled")) {
            return Boolean.valueOf(A().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String I() {
        i();
        String string = A().getString("previous_os_version", (String) null);
        c().j();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = A().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final String J() {
        i();
        return A().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String K() {
        i();
        return A().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void L() {
        i();
        Boolean H = H();
        SharedPreferences.Editor edit = A().edit();
        edit.clear();
        edit.apply();
        if (H != null) {
            q(H);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void o() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f25265c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f25280r = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f25265c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f25266d = new c5(this, "health_monitor", Math.max(0, e0.f24500e.a(null).longValue()));
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> p(String str) {
        i();
        if (zznw.zza() && a().n(e0.R0) && !E().l(y6.a.AD_STORAGE)) {
            return new Pair<>(MaxReward.DEFAULT_LABEL, Boolean.FALSE);
        }
        long b10 = zzb().b();
        if (this.f25270h != null && b10 < this.f25272j) {
            return new Pair<>(this.f25270h, Boolean.valueOf(this.f25271i));
        }
        this.f25272j = b10 + a().x(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.f25270h = MaxReward.DEFAULT_LABEL;
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f25270h = id2;
            }
            this.f25271i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            zzj().A().b("Unable to get advertising id", e10);
            this.f25270h = MaxReward.DEFAULT_LABEL;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f25270h, Boolean.valueOf(this.f25271i));
    }

    /* access modifiers changed from: package-private */
    public final void q(Boolean bool) {
        i();
        SharedPreferences.Editor edit = A().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void r(boolean z10) {
        i();
        SharedPreferences.Editor edit = A().edit();
        edit.putBoolean("use_service", z10);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean s(int i10) {
        return y6.k(i10, A().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final boolean t(long j10) {
        return j10 - this.f25273k.a() > this.f25278p.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean u(v vVar) {
        i();
        if (!y6.k(vVar.a(), D().a())) {
            return false;
        }
        SharedPreferences.Editor edit = A().edit();
        edit.putString("dma_consent_settings", vVar.i());
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean v(y6 y6Var) {
        i();
        int b10 = y6Var.b();
        if (!s(b10)) {
            return false;
        }
        SharedPreferences.Editor edit = A().edit();
        edit.putString("consent_settings", y6Var.v());
        edit.putInt("consent_source", b10);
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        SharedPreferences sharedPreferences = this.f25265c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    public final void x(Boolean bool) {
        i();
        SharedPreferences.Editor edit = A().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void y(String str) {
        i();
        SharedPreferences.Editor edit = A().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void z(boolean z10) {
        i();
        zzj().F().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = A().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }
}
