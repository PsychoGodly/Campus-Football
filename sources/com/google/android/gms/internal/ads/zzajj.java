package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajj {
    public final int zza;
    public final long zzb;

    private zzajj(int i10, long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public static zzajj zza(zzzv zzzv, zzen zzen) throws IOException {
        ((zzzk) zzzv).zzm(zzen.zzH(), 0, 8, false);
        zzen.zzF(0);
        return new zzajj(zzen.zze(), zzen.zzq());
    }
}
