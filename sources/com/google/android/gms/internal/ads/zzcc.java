package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcc {
    public static final zzcc zza = new zzca().zze();
    public static final zzn zzb = zzbz.zza;
    private static final String zzc = zzew.zzP(0);
    /* access modifiers changed from: private */
    public final zzaa zzd;

    /* synthetic */ zzcc(zzaa zzaa, zzcb zzcb) {
        this.zzd = zzaa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        return this.zzd.equals(((zzcc) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }
}
