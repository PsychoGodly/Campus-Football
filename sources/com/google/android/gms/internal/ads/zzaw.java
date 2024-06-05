package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaw {
    public static final zzaw zza = new zzaw(new zzau());
    public static final zzn zzb = zzat.zza;
    private static final String zzh = zzew.zzP(0);
    private static final String zzi = zzew.zzP(1);
    private static final String zzj = zzew.zzP(2);
    private static final String zzk = zzew.zzP(3);
    private static final String zzl = zzew.zzP(4);
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;

    private zzaw(zzau zzau) {
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        long j10 = ((zzaw) obj).zzc;
        return true;
    }

    public final int hashCode() {
        int i10 = (int) -9223372034707292159L;
        return (((((((i10 * 31) + i10) * 31) + i10) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
