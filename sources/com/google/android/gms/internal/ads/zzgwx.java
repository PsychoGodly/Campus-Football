package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgwx implements zzgxl, zzgws {
    private static final Object zza = new Object();
    private volatile zzgxl zzb;
    private volatile Object zzc = zza;

    private zzgwx(zzgxl zzgxl) {
        this.zzb = zzgxl;
    }

    public static zzgws zza(zzgxl zzgxl) {
        if (zzgxl instanceof zzgws) {
            return (zzgws) zzgxl;
        }
        Objects.requireNonNull(zzgxl);
        return new zzgwx(zzgxl);
    }

    public static zzgxl zzc(zzgxl zzgxl) {
        Objects.requireNonNull(zzgxl);
        if (zzgxl instanceof zzgwx) {
            return zzgxl;
        }
        return new zzgwx(zzgxl);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
