package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgcu {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgcu(Class cls, zzgds... zzgdsArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 <= 0) {
            zzgds zzgds = zzgdsArr[i10];
            if (!hashMap.containsKey(zzgds.zzb())) {
                hashMap.put(zzgds.zzb(), zzgds);
                i10++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgds.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgdsArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgct zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgkx zzb();

    public abstract zzgrw zzc(zzgpe zzgpe) throws zzgqy;

    public abstract String zzd();

    public abstract void zze(zzgrw zzgrw) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgrw zzgrw, Class cls) throws GeneralSecurityException {
        zzgds zzgds = (zzgds) this.zzb.get(cls);
        if (zzgds != null) {
            return zzgds.zza(zzgrw);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
