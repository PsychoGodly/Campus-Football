package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzelk implements zzepn {
    private final AtomicReference zza = new AtomicReference();
    private final e zzb;
    private final zzepn zzc;
    private final long zzd;

    public zzelk(zzepn zzepn, long j10, e eVar) {
        this.zzb = eVar;
        this.zzc = zzepn;
        this.zzd = j10;
    }

    public final int zza() {
        return 16;
    }

    public final zzfut zzb() {
        zzelj zzelj = (zzelj) this.zza.get();
        if (zzelj == null || zzelj.zza()) {
            zzelj = new zzelj(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzelj);
        }
        return zzelj.zza;
    }
}
