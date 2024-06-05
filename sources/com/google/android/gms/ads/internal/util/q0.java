package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzfut;
import java.util.Map;
import m5.d;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private static zzakr f14855a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f14856b = new Object();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f14857c = new i0();

    public q0(Context context) {
        zzakr zzakr;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f14856b) {
            if (f14855a == null) {
                zzbar.zzc(context);
                if (!d.a()) {
                    if (((Boolean) a0.c().zzb(zzbar.zzdY)).booleanValue()) {
                        zzakr = y.a(context);
                        f14855a = zzakr;
                    }
                }
                zzakr = zzalv.zza(context, (zzalc) null);
                f14855a = zzakr;
            }
        }
    }

    public final zzfut a(String str) {
        zzbzs zzbzs = new zzbzs();
        f14855a.zza(new p0(str, (Map) null, zzbzs));
        return zzbzs;
    }

    public final zzfut b(int i10, String str, Map map, byte[] bArr) {
        String str2 = str;
        n0 n0Var = new n0((m0) null);
        j0 j0Var = new j0(this, str2, n0Var);
        zzbyz zzbyz = new zzbyz((String) null);
        k0 k0Var = new k0(this, i10, str, n0Var, j0Var, bArr, map, zzbyz);
        if (zzbyz.zzl()) {
            try {
                zzbyz.zzd(str2, "GET", k0Var.zzl(), k0Var.zzx());
            } catch (zzajw e10) {
                zzbza.zzj(e10.getMessage());
            }
        }
        f14855a.zza(k0Var);
        return n0Var;
    }
}
