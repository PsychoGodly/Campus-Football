package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;
import h5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbjj implements c.b {
    final /* synthetic */ zzbzs zza;

    zzbjj(zzbjk zzbjk, zzbzs zzbzs) {
        this.zza = zzbzs;
    }

    public final void onConnectionFailed(b bVar) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
