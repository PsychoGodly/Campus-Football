package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzczk implements zzcxj {
    private int zza = ((Integer) a0.c().zzb(zzbar.zzba)).intValue();

    public final synchronized void zzb(zzeyo zzeyo) {
        if (((Boolean) a0.c().zzb(zzbar.zzbb)).booleanValue()) {
            try {
                this.zza = zzeyo.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void zzbA(zzbtn zzbtn) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
