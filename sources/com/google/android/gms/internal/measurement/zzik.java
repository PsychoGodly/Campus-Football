package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public class zzik {
    static final zzik zza = new zzik(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private static volatile zzik zzd;
    private final Map<zza, zzix.zzf<?, ?>> zze;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    private static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i10) {
            this.zza = obj;
            this.zzb = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza2 = (zza) obj;
            if (this.zza == zza2.zza && this.zzb == zza2.zzb) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    zzik() {
        this.zze = new HashMap();
    }

    public static zzik zza() {
        Class<zzik> cls = zzik.class;
        zzik zzik = zzd;
        if (zzik != null) {
            return zzik;
        }
        synchronized (cls) {
            zzik zzik2 = zzd;
            if (zzik2 != null) {
                return zzik2;
            }
            zzik zza2 = zziv.zza(cls);
            zzd = zza2;
            return zza2;
        }
    }

    private zzik(boolean z10) {
        this.zze = Collections.emptyMap();
    }

    public final <ContainingType extends zzkj> zzix.zzf<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return this.zze.get(new zza(containingtype, i10));
    }
}
