package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzaue;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzfut;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class s1 implements p1 {
    private boolean A = false;
    private String B = MaxReward.DEFAULT_LABEL;
    private int C = -1;
    private int D = -1;
    private long E = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Object f14864a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f14865b;

    /* renamed from: c  reason: collision with root package name */
    private final List f14866c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private zzfut f14867d;

    /* renamed from: e  reason: collision with root package name */
    private zzaue f14868e = null;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f14869f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences.Editor f14870g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14871h = true;

    /* renamed from: i  reason: collision with root package name */
    private String f14872i;

    /* renamed from: j  reason: collision with root package name */
    private String f14873j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14874k = true;

    /* renamed from: l  reason: collision with root package name */
    private String f14875l = "-1";

    /* renamed from: m  reason: collision with root package name */
    private String f14876m = "-1";

    /* renamed from: n  reason: collision with root package name */
    private String f14877n = "-1";

    /* renamed from: o  reason: collision with root package name */
    private int f14878o = -1;

    /* renamed from: p  reason: collision with root package name */
    private zzbyd f14879p = new zzbyd(MaxReward.DEFAULT_LABEL, 0);

    /* renamed from: q  reason: collision with root package name */
    private long f14880q = 0;

    /* renamed from: r  reason: collision with root package name */
    private long f14881r = 0;

    /* renamed from: s  reason: collision with root package name */
    private int f14882s = -1;

    /* renamed from: t  reason: collision with root package name */
    private int f14883t = 0;

    /* renamed from: u  reason: collision with root package name */
    private Set f14884u = Collections.emptySet();

    /* renamed from: v  reason: collision with root package name */
    private JSONObject f14885v = new JSONObject();

    /* renamed from: w  reason: collision with root package name */
    private boolean f14886w = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f14887x = true;

    /* renamed from: y  reason: collision with root package name */
    private String f14888y = null;

    /* renamed from: z  reason: collision with root package name */
    private String f14889z = MaxReward.DEFAULT_LABEL;

    private final void u() {
        zzfut zzfut = this.f14867d;
        if (zzfut != null && !zzfut.isDone()) {
            try {
                this.f14867d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                zzbza.zzk("Interrupted while waiting for preferences loaded.", e10);
            } catch (CancellationException | ExecutionException | TimeoutException e11) {
                zzbza.zzh("Fail to initialize AdSharedPreferenceManager.", e11);
            }
        }
    }

    private final void v() {
        zzbzn.zza.execute(new r1(this));
    }

    public final void a(Runnable runnable) {
        this.f14866c.add(runnable);
    }

    public final void b(int i10) {
        u();
        synchronized (this.f14864a) {
            if (this.D != i10) {
                this.D = i10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void c(boolean z10) {
        if (((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue()) {
            u();
            synchronized (this.f14864a) {
                if (this.A != z10) {
                    this.A = z10;
                    SharedPreferences.Editor editor = this.f14870g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z10);
                        this.f14870g.apply();
                    }
                    v();
                }
            }
        }
    }

    public final void d(int i10) {
        u();
        synchronized (this.f14864a) {
            if (this.f14883t != i10) {
                this.f14883t = i10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void e(long j10) {
        u();
        synchronized (this.f14864a) {
            if (this.E != j10) {
                this.E = j10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void f(boolean z10) {
        u();
        synchronized (this.f14864a) {
            if (z10 != this.f14874k) {
                this.f14874k = z10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void g(String str) {
        u();
        synchronized (this.f14864a) {
            if (!TextUtils.equals(this.f14888y, str)) {
                this.f14888y = str;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void h(String str) {
        u();
        synchronized (this.f14864a) {
            if (!str.equals(this.f14872i)) {
                this.f14872i = str;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void i(long j10) {
        u();
        synchronized (this.f14864a) {
            if (this.f14880q != j10) {
                this.f14880q = j10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void j(String str) {
        u();
        synchronized (this.f14864a) {
            long a10 = t.b().a();
            if (str != null) {
                if (!str.equals(this.f14879p.zzc())) {
                    this.f14879p = new zzbyd(str, a10);
                    SharedPreferences.Editor editor = this.f14870g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f14870g.putLong("app_settings_last_update_ms", a10);
                        this.f14870g.apply();
                    }
                    v();
                    for (Runnable run : this.f14866c) {
                        run.run();
                    }
                    return;
                }
            }
            this.f14879p.zzg(a10);
        }
    }

    public final void k(int i10) {
        u();
        synchronized (this.f14864a) {
            if (this.f14882s != i10) {
                this.f14882s = i10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void l(Context context) {
        synchronized (this.f14864a) {
            if (this.f14869f == null) {
                this.f14867d = zzbzn.zza.zza(new q1(this, context, AppLovinMediationProvider.ADMOB));
                this.f14865b = true;
            }
        }
    }

    public final void m(String str) {
        u();
        synchronized (this.f14864a) {
            if (!str.equals(this.f14873j)) {
                this.f14873j = str;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.u()
            java.lang.Object r0 = r5.f14864a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x006c }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 2
            goto L_0x003b
        L_0x003a:
            r1 = -1
        L_0x003b:
            if (r1 == 0) goto L_0x0049
            if (r1 == r4) goto L_0x0046
            if (r1 == r3) goto L_0x0043
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x0043:
            r5.f14877n = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0046:
            r5.f14876m = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0049:
            r5.f14875l = r7     // Catch:{ all -> 0x006c }
        L_0x004b:
            android.content.SharedPreferences$Editor r1 = r5.f14870g     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x005d
            android.content.SharedPreferences$Editor r7 = r5.f14870g     // Catch:{ all -> 0x006c }
            r7.remove(r6)     // Catch:{ all -> 0x006c }
            goto L_0x0062
        L_0x005d:
            android.content.SharedPreferences$Editor r1 = r5.f14870g     // Catch:{ all -> 0x006c }
            r1.putString(r6, r7)     // Catch:{ all -> 0x006c }
        L_0x0062:
            android.content.SharedPreferences$Editor r6 = r5.f14870g     // Catch:{ all -> 0x006c }
            r6.apply()     // Catch:{ all -> 0x006c }
        L_0x0067:
            r5.v()     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.s1.n(java.lang.String, java.lang.String):void");
    }

    public final void o(long j10) {
        u();
        synchronized (this.f14864a) {
            if (this.f14881r != j10) {
                this.f14881r = j10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void p(int i10) {
        u();
        synchronized (this.f14864a) {
            this.f14878o = i10;
            SharedPreferences.Editor editor = this.f14870g;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.f14870g.apply();
            }
            v();
        }
    }

    public final void q(String str, String str2, boolean z10) {
        u();
        synchronized (this.f14864a) {
            JSONArray optJSONArray = this.f14885v.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        if (str2.equals(optJSONObject.optString("template_id"))) {
                            if (z10) {
                                if (optJSONObject.optBoolean("uses_media_view", false)) {
                                    return;
                                }
                            }
                            length = i10;
                        } else {
                            i10++;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", t.b().a());
                optJSONArray.put(length, jSONObject);
                this.f14885v.put(str, optJSONArray);
            } catch (JSONException e10) {
                zzbza.zzk("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.f14870g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f14885v.toString());
                this.f14870g.apply();
            }
            v();
        }
    }

    public final void r(boolean z10) {
        u();
        synchronized (this.f14864a) {
            if (this.f14886w != z10) {
                this.f14886w = z10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }

    public final void s(String str) {
        if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue()) {
            u();
            synchronized (this.f14864a) {
                if (!this.f14889z.equals(str)) {
                    this.f14889z = str;
                    SharedPreferences.Editor editor = this.f14870g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f14870g.apply();
                    }
                    v();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f14864a) {
            this.f14869f = sharedPreferences;
            this.f14870g = edit;
            if (m.g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f14871h = this.f14869f.getBoolean("use_https", this.f14871h);
            this.f14886w = this.f14869f.getBoolean("content_url_opted_out", this.f14886w);
            this.f14872i = this.f14869f.getString("content_url_hashes", this.f14872i);
            this.f14874k = this.f14869f.getBoolean("gad_idless", this.f14874k);
            this.f14887x = this.f14869f.getBoolean("content_vertical_opted_out", this.f14887x);
            this.f14873j = this.f14869f.getString("content_vertical_hashes", this.f14873j);
            this.f14883t = this.f14869f.getInt("version_code", this.f14883t);
            this.f14879p = new zzbyd(this.f14869f.getString("app_settings_json", this.f14879p.zzc()), this.f14869f.getLong("app_settings_last_update_ms", this.f14879p.zza()));
            this.f14880q = this.f14869f.getLong("app_last_background_time_ms", this.f14880q);
            this.f14882s = this.f14869f.getInt("request_in_session_count", this.f14882s);
            this.f14881r = this.f14869f.getLong("first_ad_req_time_ms", this.f14881r);
            this.f14884u = this.f14869f.getStringSet("never_pool_slots", this.f14884u);
            this.f14888y = this.f14869f.getString("display_cutout", this.f14888y);
            this.C = this.f14869f.getInt("app_measurement_npa", this.C);
            this.D = this.f14869f.getInt("sd_app_measure_npa", this.D);
            this.E = this.f14869f.getLong("sd_app_measure_npa_ts", this.E);
            this.f14889z = this.f14869f.getString("inspector_info", this.f14889z);
            this.A = this.f14869f.getBoolean("linked_device", this.A);
            this.B = this.f14869f.getString("linked_ad_unit", this.B);
            this.f14875l = this.f14869f.getString("IABTCF_gdprApplies", this.f14875l);
            this.f14877n = this.f14869f.getString("IABTCF_PurposeConsents", this.f14877n);
            this.f14876m = this.f14869f.getString("IABTCF_TCString", this.f14876m);
            this.f14878o = this.f14869f.getInt("gad_has_consent_for_cookies", this.f14878o);
            try {
                this.f14885v = new JSONObject(this.f14869f.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
            } catch (JSONException e10) {
                zzbza.zzk("Could not convert native advanced settings to json object", e10);
            }
            v();
        }
    }

    public final void zzA(String str) {
        if (((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue()) {
            u();
            synchronized (this.f14864a) {
                if (!this.B.equals(str)) {
                    this.B = str;
                    SharedPreferences.Editor editor = this.f14870g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f14870g.apply();
                    }
                    v();
                }
            }
        }
    }

    public final boolean zzM() {
        boolean z10;
        u();
        synchronized (this.f14864a) {
            z10 = this.f14886w;
        }
        return z10;
    }

    public final boolean zzN() {
        boolean z10;
        u();
        synchronized (this.f14864a) {
            z10 = this.f14887x;
        }
        return z10;
    }

    public final boolean zzO() {
        boolean z10;
        u();
        synchronized (this.f14864a) {
            z10 = this.A;
        }
        return z10;
    }

    public final boolean zzP() {
        boolean z10;
        if (!((Boolean) a0.c().zzb(zzbar.zzar)).booleanValue()) {
            return false;
        }
        u();
        synchronized (this.f14864a) {
            z10 = this.f14874k;
        }
        return z10;
    }

    public final int zza() {
        int i10;
        u();
        synchronized (this.f14864a) {
            i10 = this.f14883t;
        }
        return i10;
    }

    public final int zzb() {
        int i10;
        u();
        synchronized (this.f14864a) {
            i10 = this.f14878o;
        }
        return i10;
    }

    public final int zzc() {
        int i10;
        u();
        synchronized (this.f14864a) {
            i10 = this.f14882s;
        }
        return i10;
    }

    public final long zzd() {
        long j10;
        u();
        synchronized (this.f14864a) {
            j10 = this.f14880q;
        }
        return j10;
    }

    public final long zze() {
        long j10;
        u();
        synchronized (this.f14864a) {
            j10 = this.f14881r;
        }
        return j10;
    }

    public final long zzf() {
        long j10;
        u();
        synchronized (this.f14864a) {
            j10 = this.E;
        }
        return j10;
    }

    public final zzaue zzg() {
        if (!this.f14865b) {
            return null;
        }
        if ((zzM() && zzN()) || !((Boolean) zzbcc.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.f14864a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f14868e == null) {
                this.f14868e = new zzaue();
            }
            this.f14868e.zze();
            zzbza.zzi("start fetching content...");
            zzaue zzaue = this.f14868e;
            return zzaue;
        }
    }

    public final zzbyd zzh() {
        zzbyd zzbyd;
        u();
        synchronized (this.f14864a) {
            zzbyd = this.f14879p;
        }
        return zzbyd;
    }

    public final zzbyd zzi() {
        zzbyd zzbyd;
        synchronized (this.f14864a) {
            zzbyd = this.f14879p;
        }
        return zzbyd;
    }

    public final String zzj() {
        String str;
        u();
        synchronized (this.f14864a) {
            str = this.f14872i;
        }
        return str;
    }

    public final String zzk() {
        String str;
        u();
        synchronized (this.f14864a) {
            str = this.f14873j;
        }
        return str;
    }

    public final String zzl() {
        String str;
        u();
        synchronized (this.f14864a) {
            str = this.B;
        }
        return str;
    }

    public final String zzm() {
        String str;
        u();
        synchronized (this.f14864a) {
            str = this.f14888y;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzn(java.lang.String r6) {
        /*
            r5 = this;
            r5.u()
            java.lang.Object r0 = r5.f14864a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0050 }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 2
            goto L_0x003b
        L_0x003a:
            r6 = -1
        L_0x003b:
            if (r6 == 0) goto L_0x004c
            if (r6 == r4) goto L_0x0048
            if (r6 == r3) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            r6 = 0
            return r6
        L_0x0044:
            java.lang.String r6 = r5.f14877n     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0048:
            java.lang.String r6 = r5.f14876m     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x004c:
            java.lang.String r6 = r5.f14875l     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0050:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.s1.zzn(java.lang.String):java.lang.String");
    }

    public final String zzo() {
        String str;
        u();
        synchronized (this.f14864a) {
            str = this.f14889z;
        }
        return str;
    }

    public final JSONObject zzp() {
        JSONObject jSONObject;
        u();
        synchronized (this.f14864a) {
            jSONObject = this.f14885v;
        }
        return jSONObject;
    }

    public final void zzs() {
        u();
        synchronized (this.f14864a) {
            this.f14885v = new JSONObject();
            SharedPreferences.Editor editor = this.f14870g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f14870g.apply();
            }
            v();
        }
    }

    public final void zzz(boolean z10) {
        u();
        synchronized (this.f14864a) {
            if (this.f14887x != z10) {
                this.f14887x = z10;
                SharedPreferences.Editor editor = this.f14870g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z10);
                    this.f14870g.apply();
                }
                v();
            }
        }
    }
}
