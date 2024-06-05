package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcg<P> {
    private final ConcurrentMap<zzck, List<zzcl<P>>> zza;
    private final List<zzcl<P>> zzb;
    private zzcl<P> zzc;
    private final Class<P> zzd;
    private final zzrn zze;
    private final boolean zzf;

    private zzcg(ConcurrentMap<zzck, List<zzcl<P>>> concurrentMap, List<zzcl<P>> list, zzcl<P> zzcl, zzrn zzrn, Class<P> cls) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzcl;
        this.zzd = cls;
        this.zze = zzrn;
        this.zzf = false;
    }

    public final zzcl<P> zza() {
        return this.zzc;
    }

    public final zzrn zzb() {
        return this.zze;
    }

    public final Class<P> zzc() {
        return this.zzd;
    }

    public final Collection<List<zzcl<P>>> zzd() {
        return this.zza.values();
    }

    public final List<zzcl<P>> zze() {
        return zza(zzbn.zza);
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }

    public final List<zzcl<P>> zza(byte[] bArr) {
        List<zzcl<P>> list = (List) this.zza.get(new zzck(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}
