package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbji implements c.a {
    final /* synthetic */ zzbzs zza;
    final /* synthetic */ zzbjk zzb;

    zzbji(zzbjk zzbjk, zzbzs zzbzs) {
        this.zzb = zzbjk;
        this.zza = zzbzs;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzd(this.zzb.zza.zzp());
        } catch (DeadObjectException e10) {
            this.zza.zze(e10);
        }
    }

    public final void onConnectionSuspended(int i10) {
        zzbzs zzbzs = this.zza;
        zzbzs.zze(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
