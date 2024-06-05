package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.p;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbua extends zzbuc {
    private final String zza;
    private final int zzb;

    public zzbua(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbua)) {
            zzbua zzbua = (zzbua) obj;
            if (!p.a(this.zza, zzbua.zza) || !p.a(Integer.valueOf(this.zzb), Integer.valueOf(zzbua.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
