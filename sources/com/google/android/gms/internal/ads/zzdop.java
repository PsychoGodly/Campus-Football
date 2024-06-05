package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdop implements zzfdb {
    private final Map zza;
    private final zzawe zzb;

    zzdop(zzawe zzawe, Map map) {
        this.zza = map;
        this.zzb = zzawe;
    }

    public final void zzbB(zzfcu zzfcu, String str) {
    }

    public final void zzbC(zzfcu zzfcu, String str, Throwable th) {
        if (this.zza.containsKey(zzfcu)) {
            this.zzb.zzc(((zzdoo) this.zza.get(zzfcu)).zzc);
        }
    }

    public final void zzc(zzfcu zzfcu, String str) {
        if (this.zza.containsKey(zzfcu)) {
            this.zzb.zzc(((zzdoo) this.zza.get(zzfcu)).zza);
        }
    }

    public final void zzd(zzfcu zzfcu, String str) {
        if (this.zza.containsKey(zzfcu)) {
            this.zzb.zzc(((zzdoo) this.zza.get(zzfcu)).zzb);
        }
    }
}
