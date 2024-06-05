package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgxk implements zzgxl {
    private static final Object zza = new Object();
    private volatile zzgxl zzb;
    private volatile Object zzc = zza;

    private zzgxk(zzgxl zzgxl) {
        this.zzb = zzgxl;
    }

    public static zzgxl zza(zzgxl zzgxl) {
        if ((zzgxl instanceof zzgxk) || (zzgxl instanceof zzgwx)) {
            return zzgxl;
        }
        Objects.requireNonNull(zzgxl);
        return new zzgxk(zzgxl);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzgxl zzgxl = this.zzb;
        if (zzgxl == null) {
            return this.zzc;
        }
        Object zzb2 = zzgxl.zzb();
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }
}
