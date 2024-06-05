package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzov {
    private final zzde[] zza;
    private final zzpm zzb;
    private final zzdh zzc;

    public zzov(zzde... zzdeArr) {
        zzpm zzpm = new zzpm();
        zzdh zzdh = new zzdh();
        zzde[] zzdeArr2 = new zzde[2];
        this.zza = zzdeArr2;
        System.arraycopy(zzdeArr, 0, zzdeArr2, 0, 0);
        this.zzb = zzpm;
        this.zzc = zzdh;
        zzdeArr2[0] = zzpm;
        zzdeArr2[1] = zzdh;
    }

    public final long zza(long j10) {
        return this.zzc.zzi(j10);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzby zzc(zzby zzby) {
        this.zzc.zzk(zzby.zzc);
        this.zzc.zzj(zzby.zzd);
        return zzby;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzde[] zze() {
        return this.zza;
    }
}
