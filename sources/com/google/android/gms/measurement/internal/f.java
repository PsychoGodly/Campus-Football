package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzot;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import m5.e;
import m5.o;
import o5.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class f extends v6 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f24568b;

    /* renamed from: c  reason: collision with root package name */
    private h f24569c = i.f24647a;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f24570d;

    f(w5 w5Var) {
        super(w5Var);
    }

    public static long B() {
        return e0.f24502f.a(null).longValue();
    }

    public static long H() {
        return e0.F.a(null).longValue();
    }

    private final Bundle P() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().B().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = c.a(zza()).c(zza().getPackageName(), 128);
            if (c10 != null) {
                return c10.metaData;
            }
            zzj().B().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().B().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    private final String b(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
            q.k(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            zzj().B().b("Could not find SystemProperties class", e10);
            return str2;
        } catch (NoSuchMethodException e11) {
            zzj().B().b("Could not find SystemProperties.get() method", e11);
            return str2;
        } catch (IllegalAccessException e12) {
            zzj().B().b("Could not access SystemProperties.get()", e12);
            return str2;
        } catch (InvocationTargetException e13) {
            zzj().B().b("SystemProperties.get() threw an exception", e13);
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean A(String str) {
        q.g(str);
        Bundle P = P();
        if (P == null) {
            zzj().B().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!P.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(P.getBoolean(str));
        }
    }

    /* access modifiers changed from: package-private */
    public final String C(String str) {
        return u(str, e0.N);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> D(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.q.g(r4)
            android.os.Bundle r0 = r3.P()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.n4 r4 = r3.zzj()
            com.google.android.gms.measurement.internal.p4 r4 = r4.B()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.zza()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n4 r0 = r3.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.B()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.D(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final boolean E(String str) {
        return y(str, e0.M);
    }

    public final boolean F(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.f24569c.b(str, "gaia_collection_enabled"));
    }

    public final boolean G(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.f24569c.b(str, "measurement.event_sampling_enabled"));
    }

    public final String I() {
        return b("debug.firebase.analytics.app", MaxReward.DEFAULT_LABEL);
    }

    public final String J() {
        return b("debug.deferred.deeplink", MaxReward.DEFAULT_LABEL);
    }

    public final boolean K() {
        Boolean A = A("google_analytics_adid_collection_enabled");
        return A == null || A.booleanValue();
    }

    public final boolean L() {
        Boolean A = A("google_analytics_automatic_screen_reporting_enabled");
        return A == null || A.booleanValue();
    }

    public final boolean M() {
        Boolean A = A("firebase_analytics_collection_deactivated");
        return A != null && A.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean N() {
        if (this.f24568b == null) {
            Boolean A = A("app_measurement_lite");
            this.f24568b = A;
            if (A == null) {
                this.f24568b = Boolean.FALSE;
            }
        }
        return this.f24568b.booleanValue() || !this.f25124a.o();
    }

    public final boolean O() {
        if (this.f24570d == null) {
            synchronized (this) {
                if (this.f24570d == null) {
                    ApplicationInfo applicationInfo = zza().getApplicationInfo();
                    String a10 = o.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f24570d = Boolean.valueOf(str != null && str.equals(a10));
                    }
                    if (this.f24570d == null) {
                        this.f24570d = Boolean.TRUE;
                        zzj().B().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f24570d.booleanValue();
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final double j(String str, h4<Double> h4Var) {
        if (str == null) {
            return h4Var.a(null).doubleValue();
        }
        String b10 = this.f24569c.b(str, h4Var.b());
        if (TextUtils.isEmpty(b10)) {
            return h4Var.a(null).doubleValue();
        }
        try {
            return h4Var.a(Double.valueOf(Double.parseDouble(b10))).doubleValue();
        } catch (NumberFormatException unused) {
            return h4Var.a(null).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final int k(String str) {
        return l(str, e0.J, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, AdError.SERVER_ERROR_CODE);
    }

    public final int l(String str, h4<Integer> h4Var, int i10, int i11) {
        return Math.max(Math.min(p(str, h4Var), i11), i10);
    }

    /* access modifiers changed from: package-private */
    public final void m(h hVar) {
        this.f24569c = hVar;
    }

    public final boolean n(h4<Boolean> h4Var) {
        return y((String) null, h4Var);
    }

    /* access modifiers changed from: package-private */
    public final int o(String str) {
        if (!zzoo.zza() || !a().y((String) null, e0.f24495b1)) {
            return 100;
        }
        return UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
    }

    public final int p(String str, h4<Integer> h4Var) {
        if (str == null) {
            return h4Var.a(null).intValue();
        }
        String b10 = this.f24569c.b(str, h4Var.b());
        if (TextUtils.isEmpty(b10)) {
            return h4Var.a(null).intValue();
        }
        try {
            return h4Var.a(Integer.valueOf(Integer.parseInt(b10))).intValue();
        } catch (NumberFormatException unused) {
            return h4Var.a(null).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final int q() {
        if (!zzot.zza() || !a().y((String) null, e0.I0) || !f().W(231100000, true)) {
            return 0;
        }
        return 35;
    }

    /* access modifiers changed from: package-private */
    public final int r(String str) {
        return Math.max(o(str), 256);
    }

    public final long s(String str, h4<Long> h4Var) {
        if (str == null) {
            return h4Var.a(null).longValue();
        }
        String b10 = this.f24569c.b(str, h4Var.b());
        if (TextUtils.isEmpty(b10)) {
            return h4Var.a(null).longValue();
        }
        try {
            return h4Var.a(Long.valueOf(Long.parseLong(b10))).longValue();
        } catch (NumberFormatException unused) {
            return h4Var.a(null).longValue();
        }
    }

    public final int t(String str) {
        return l(str, e0.K, 25, 100);
    }

    public final String u(String str, h4<String> h4Var) {
        if (str == null) {
            return h4Var.a(null);
        }
        return h4Var.a(this.f24569c.b(str, h4Var.b()));
    }

    public final int v(String str) {
        return p(str, e0.f24524q);
    }

    public final boolean w(String str, h4<Boolean> h4Var) {
        return y(str, h4Var);
    }

    /* access modifiers changed from: package-private */
    public final long x(String str) {
        return s(str, e0.f24496c);
    }

    public final boolean y(String str, h4<Boolean> h4Var) {
        if (str == null) {
            return h4Var.a(null).booleanValue();
        }
        String b10 = this.f24569c.b(str, h4Var.b());
        if (TextUtils.isEmpty(b10)) {
            return h4Var.a(null).booleanValue();
        }
        return h4Var.a(Boolean.valueOf(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(b10))).booleanValue();
    }

    public final int z() {
        return f().W(201500000, true) ? 100 : 25;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
