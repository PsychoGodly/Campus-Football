package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzoh extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zzoh(int i10, zzaf zzaf, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzaf;
    }
}
