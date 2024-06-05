package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;
import h5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzavz implements c.b {
    final /* synthetic */ zzbzs zza;
    final /* synthetic */ zzawa zzb;

    zzavz(zzawa zzawa, zzbzs zzbzs) {
        this.zzb = zzawa;
        this.zza = zzbzs;
    }

    public final void onConnectionFailed(b bVar) {
        synchronized (this.zzb.zzd) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
