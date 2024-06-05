package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzke implements zzjv {
    public final zzsn zza;
    public final Object zzb = new Object();
    public final List zzc = new ArrayList();
    public int zzd;
    public boolean zze;

    public zzke(zzsu zzsu, boolean z10) {
        this.zza = new zzsn(zzsu, z10);
    }

    public final zzcn zza() {
        return this.zza.zzB();
    }

    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}
