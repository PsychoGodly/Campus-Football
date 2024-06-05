package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzabp implements zzabk {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzabp(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzabp zzb(zzen zzen) {
        int zzg = zzen.zzg();
        zzen.zzG(8);
        int zzg2 = zzen.zzg();
        int zzg3 = zzen.zzg();
        zzen.zzG(4);
        int zzg4 = zzen.zzg();
        zzen.zzG(12);
        return new zzabp(zzg, zzg2, zzg3, zzg4);
    }

    public final int zza() {
        return 1751742049;
    }
}
