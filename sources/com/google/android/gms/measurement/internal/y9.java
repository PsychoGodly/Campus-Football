package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class y9 extends ua {

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, x9> f25301d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final d5 f25302e;

    /* renamed from: f  reason: collision with root package name */
    public final d5 f25303f;

    /* renamed from: g  reason: collision with root package name */
    public final d5 f25304g;

    /* renamed from: h  reason: collision with root package name */
    public final d5 f25305h;

    /* renamed from: i  reason: collision with root package name */
    public final d5 f25306i;

    y9(va vaVar) {
        super(vaVar);
        y4 e10 = e();
        e10.getClass();
        this.f25302e = new d5(e10, "last_delete_stale", 0);
        y4 e11 = e();
        e11.getClass();
        this.f25303f = new d5(e11, "backoff", 0);
        y4 e12 = e();
        e12.getClass();
        this.f25304g = new d5(e12, "last_upload", 0);
        y4 e13 = e();
        e13.getClass();
        this.f25305h = new d5(e13, "last_upload_attempt", 0);
        y4 e14 = e();
        e14.getClass();
        this.f25306i = new d5(e14, "midnight_offset", 0);
    }

    @Deprecated
    private final Pair<String, Boolean> t(String str) {
        x9 x9Var;
        i();
        long b10 = zzb().b();
        x9 x9Var2 = this.f25301d.get(str);
        if (x9Var2 != null && b10 < x9Var2.f25252c) {
            return new Pair<>(x9Var2.f25250a, Boolean.valueOf(x9Var2.f25251b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long x10 = a().x(str) + b10;
        AdvertisingIdClient.Info info = null;
        try {
            long s10 = a().s(str, e0.f24498d);
            if (s10 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (x9Var2 != null) {
                        if (b10 < x9Var2.f25252c + s10) {
                            return new Pair<>(x9Var2.f25250a, Boolean.valueOf(x9Var2.f25251b));
                        }
                    }
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            }
            if (info == null) {
                return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id2 = info.getId();
            if (id2 != null) {
                x9Var = new x9(id2, info.isLimitAdTrackingEnabled(), x10);
            } else {
                x9Var = new x9(MaxReward.DEFAULT_LABEL, info.isLimitAdTrackingEnabled(), x10);
            }
            this.f25301d.put(str, x9Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair<>(x9Var.f25250a, Boolean.valueOf(x9Var.f25251b));
        } catch (Exception e10) {
            zzj().A().b("Unable to get advertising id", e10);
            x9Var = new x9(MaxReward.DEFAULT_LABEL, false, x10);
        }
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

    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> u(String str, y6 y6Var) {
        if (y6Var.x()) {
            return t(str);
        }
        return new Pair<>(MaxReward.DEFAULT_LABEL, Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String v(String str, boolean z10) {
        i();
        String str2 = z10 ? (String) t(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest O0 = ib.O0();
        if (O0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, O0.digest(str2.getBytes()))});
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
