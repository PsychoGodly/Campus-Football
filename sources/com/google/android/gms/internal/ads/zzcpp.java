package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcpp implements zzgwy {
    private final zzgxl zza;

    public zzcpp(zzgxl zzgxl) {
        this.zza = zzgxl;
    }

    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z10 = true;
        if (((zzcuf) this.zza).zza().zza() == null) {
            if (!((Boolean) a0.c().zzb(zzbar.zzfd)).booleanValue()) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
