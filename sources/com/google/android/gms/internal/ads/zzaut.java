package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import p4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzaut extends zzava {
    private final a.C0225a zza;
    private final String zzb;

    public zzaut(a.C0225a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    public final void zzb(int i10) {
    }

    public final void zzc(c3 c3Var) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(c3Var.w());
        }
    }

    public final void zzd(zzauy zzauy) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzauu(zzauy, this.zzb));
        }
    }
}
