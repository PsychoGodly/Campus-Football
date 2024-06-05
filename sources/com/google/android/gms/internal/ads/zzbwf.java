package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.p1;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbwf {
    private final e zza;
    private final p1 zzb;
    private final zzbxf zzc;

    zzbwf(e eVar, p1 p1Var, zzbxf zzbxf) {
        this.zza = eVar;
        this.zzb = p1Var;
        this.zzc = zzbxf;
    }

    public final void zza() {
        if (((Boolean) a0.c().zzb(zzbar.zzao)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i10, long j10) {
        if (!((Boolean) a0.c().zzb(zzbar.zzan)).booleanValue()) {
            if (j10 - this.zzb.zzf() < 0) {
                n1.a("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) a0.c().zzb(zzbar.zzao)).booleanValue()) {
                this.zzb.b(-1);
                this.zzb.e(j10);
            } else {
                this.zzb.b(i10);
                this.zzb.e(j10);
            }
            zza();
        }
    }
}
