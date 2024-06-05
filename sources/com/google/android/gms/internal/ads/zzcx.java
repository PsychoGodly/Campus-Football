package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcx {
    public static final zzn zza = zzcw.zza;
    private static final String zzc = zzew.zzP(0);
    private static final String zzd = zzew.zzP(1);
    private static final String zze = zzew.zzP(3);
    private static final String zzf = zzew.zzP(4);
    public final int zzb = 1;
    private final zzcp zzg;
    private final int[] zzh;
    private final boolean[] zzi;

    public zzcx(zzcp zzcp, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = zzcp.zzb;
        this.zzg = zzcp;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcx.class == obj.getClass()) {
            zzcx zzcx = (zzcx) obj;
            return this.zzg.equals(zzcx.zzg) && Arrays.equals(this.zzh, zzcx.zzh) && Arrays.equals(this.zzi, zzcx.zzi);
        }
    }

    public final int hashCode() {
        return (((this.zzg.hashCode() * 961) + Arrays.hashCode(this.zzh)) * 31) + Arrays.hashCode(this.zzi);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzaf zzb(int i10) {
        return this.zzg.zzb(i10);
    }

    public final boolean zzc() {
        for (boolean z10 : this.zzi) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zzi[i10];
    }
}
