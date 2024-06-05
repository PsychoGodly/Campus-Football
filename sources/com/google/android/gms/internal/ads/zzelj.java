package com.google.android.gms.internal.ads;

import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzelj {
    public final zzfut zza;
    private final long zzb;
    private final e zzc;

    public zzelj(zzfut zzfut, long j10, e eVar) {
        this.zza = zzfut;
        this.zzc = eVar;
        this.zzb = eVar.b() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.b();
    }
}
