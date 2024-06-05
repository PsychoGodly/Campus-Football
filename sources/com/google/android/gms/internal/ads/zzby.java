package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzby {
    public static final zzby zza = new zzby(1.0f, 1.0f);
    public static final zzn zzb = zzbx.zza;
    private static final String zze = zzew.zzP(0);
    private static final String zzf = zzew.zzP(1);
    public final float zzc;
    public final float zzd;
    private final int zzg;

    public zzby(float f10, float f11) {
        boolean z10 = true;
        zzdl.zzd(f10 > 0.0f);
        zzdl.zzd(f11 <= 0.0f ? false : z10);
        this.zzc = f10;
        this.zzd = f11;
        this.zzg = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            zzby zzby = (zzby) obj;
            return this.zzc == zzby.zzc && this.zzd == zzby.zzd;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + 527) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return zzew.zzI("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j10) {
        return j10 * ((long) this.zzg);
    }
}
