package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfxb {
    private final ConcurrentMap zza;
    private final zzfwx zzb;
    private final Class zzc;
    private final zzggl zzd;

    /* synthetic */ zzfxb(ConcurrentMap concurrentMap, zzfwx zzfwx, zzggl zzggl, Class cls, zzfxa zzfxa) {
        this.zza = concurrentMap;
        this.zzb = zzfwx;
        this.zzc = cls;
        this.zzd = zzggl;
    }

    public final zzfwx zza() {
        return this.zzb;
    }

    public final zzggl zzb() {
        return this.zzd;
    }

    public final Class zzc() {
        return this.zzc;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfwz(bArr, (zzfwy) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zzd.zza().isEmpty();
    }
}
