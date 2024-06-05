package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzth implements zzuj {
    private final zzuj zza;
    private final long zzb;

    public zzth(zzuj zzuj, long j10) {
        this.zza = zzuj;
        this.zzb = j10;
    }

    public final int zza(zzjo zzjo, zzgr zzgr, int i10) {
        int zza2 = this.zza.zza(zzjo, zzgr, i10);
        if (zza2 != -4) {
            return zza2;
        }
        zzgr.zzd = Math.max(0, zzgr.zzd + this.zzb);
        return -4;
    }

    public final int zzb(long j10) {
        return this.zza.zzb(j10 - this.zzb);
    }

    public final zzuj zzc() {
        return this.zza;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}
