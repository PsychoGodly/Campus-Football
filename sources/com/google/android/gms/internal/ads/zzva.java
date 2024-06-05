package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzva implements zzwe {
    protected final zzcp zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzaf[] zzd;
    private int zze;

    public zzva(zzcp zzcp, int[] iArr, int i10) {
        int length = iArr.length;
        zzdl.zzf(length > 0);
        Objects.requireNonNull(zzcp);
        this.zza = zzcp;
        this.zzb = length;
        this.zzd = new zzaf[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzcp.zzb(iArr[i11]);
        }
        Arrays.sort(this.zzd, zzuz.zza);
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzcp.zza(this.zzd[i12]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzva zzva = (zzva) obj;
            return this.zza == zzva.zza && Arrays.equals(this.zzc, zzva.zzc);
        }
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i10) {
        return this.zzc[0];
    }

    public final int zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzaf zzd(int i10) {
        return this.zzd[i10];
    }

    public final zzcp zze() {
        return this.zza;
    }
}
