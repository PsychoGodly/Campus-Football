package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzfnq implements Serializable {
    zzfnq() {
    }

    public static zzfnq zzc() {
        return zzfmz.zza;
    }

    public static zzfnq zzd(Object obj) {
        return obj == null ? zzfmz.zza : new zzfnz(obj);
    }

    public abstract zzfnq zza(zzfnj zzfnj);

    public abstract Object zzb(Object obj);
}
