package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzvl implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzvl(zzaf zzaf, int i10) {
        this.zza = 1 != (zzaf.zze & 1) ? false : true;
        this.zzb = zzwc.zzm(i10, false);
    }

    /* renamed from: zza */
    public final int compareTo(zzvl zzvl) {
        return zzfpz.zzj().zzd(this.zzb, zzvl.zzb).zzd(this.zza, zzvl.zza).zza();
    }
}
