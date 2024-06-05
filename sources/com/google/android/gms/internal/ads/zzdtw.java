package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import o5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdtw implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdtw(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return c.a((Context) this.zza.zzb()).f(((zzdtr) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
