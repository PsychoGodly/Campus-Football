package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgb {
    private final zzfhi zza;
    private final String zzb;
    private final zzffq zzc;
    private final String zzd = "Ad overlay";

    public zzfgb(View view, zzffq zzffq, String str) {
        this.zza = new zzfhi(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzffq;
    }

    public final zzffq zza() {
        return this.zzc;
    }

    public final zzfhi zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
