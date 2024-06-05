package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzda {
    public static final zzda zza = new zzda(0, 0, 0, 1.0f);
    public static final zzn zzb = zzcz.zza;
    private static final String zzg = zzew.zzP(0);
    private static final String zzh = zzew.zzP(1);
    private static final String zzi = zzew.zzP(2);
    private static final String zzj = zzew.zzP(3);
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;

    public zzda(int i10, int i11, int i12, float f10) {
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzda = (zzda) obj;
            return this.zzc == zzda.zzc && this.zzd == zzda.zzd && this.zze == zzda.zze && this.zzf == zzda.zzf;
        }
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
