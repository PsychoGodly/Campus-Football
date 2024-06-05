package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdtr implements zzgwy {
    private final zzgxl zza;

    public zzdtr(zzgxl zzgxl) {
        this.zza = zzgxl;
    }

    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgxg.zzb(applicationInfo);
        return applicationInfo;
    }
}
