package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgct {
    private final Class zza;

    public zzgct(Class cls) {
        this.zza = cls;
    }

    public abstract zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException;

    public abstract zzgrw zzb(zzgpe zzgpe) throws zzgqy;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgrw zzgrw) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
