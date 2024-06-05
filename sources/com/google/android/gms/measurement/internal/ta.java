package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzqd;
import java.util.HashMap;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class ta extends ra {
    ta(va vaVar) {
        super(vaVar);
    }

    private final String q(String str) {
        String L = m().L(str);
        if (TextUtils.isEmpty(L)) {
            return e0.f24528s.a(null);
        }
        Uri parse = Uri.parse(e0.f24528s.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(L + "." + authority);
        return buildUpon.build().toString();
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

    public final wa p(String str) {
        if (zzqd.zza() && a().n(e0.A0)) {
            zzj().F().a("sgtm feature flag enabled.");
            r5 y02 = l().y0(str);
            if (y02 == null) {
                return new wa(q(str));
            }
            wa waVar = null;
            if (y02.t()) {
                zzj().F().a("sgtm upload enabled in manifest.");
                zzfc.zzd G = m().G(y02.t0());
                if (G != null) {
                    String zzj = G.zzj();
                    if (!TextUtils.isEmpty(zzj)) {
                        String zzi = G.zzi();
                        zzj().F().c("sgtm configured with upload_url, server_info", zzj, TextUtils.isEmpty(zzi) ? "Y" : "N");
                        if (TextUtils.isEmpty(zzi)) {
                            waVar = new wa(zzj);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", zzi);
                            waVar = new wa(zzj, hashMap);
                        }
                    }
                }
            }
            if (waVar != null) {
                return waVar;
            }
        }
        return new wa(q(str));
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
