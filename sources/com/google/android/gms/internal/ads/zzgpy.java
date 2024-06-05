package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgpy {
    static final zzgpy zza = new zzgpy(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgpy zzd;
    private final Map zze;

    zzgpy() {
        this.zze = new HashMap();
    }

    public static zzgpy zza() {
        return zza;
    }

    public static zzgpy zzb() {
        Class<zzgpy> cls = zzgpy.class;
        zzgpy zzgpy = zzd;
        if (zzgpy != null) {
            return zzgpy;
        }
        synchronized (cls) {
            zzgpy zzgpy2 = zzd;
            if (zzgpy2 != null) {
                return zzgpy2;
            }
            zzgpy zzb2 = zzgqg.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgqk zzc(zzgrw zzgrw, int i10) {
        return (zzgqk) this.zze.get(new zzgpx(zzgrw, i10));
    }

    zzgpy(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
