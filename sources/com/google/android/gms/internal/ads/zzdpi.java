package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdpi {
    /* access modifiers changed from: private */
    public final zzdpn zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    /* access modifiers changed from: private */
    public final Map zzc;

    public zzdpi(zzdpn zzdpn, Executor executor) {
        this.zza = zzdpn;
        this.zzc = zzdpn.zza();
        this.zzb = executor;
    }

    public final zzdph zza() {
        zzdph zzdph = new zzdph(this);
        zzdph unused = zzdph.zzb.putAll(zzdph.zza.zzc);
        return zzdph;
    }
}
