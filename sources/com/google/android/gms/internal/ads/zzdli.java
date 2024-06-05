package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a;
import t4.e0;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdli extends zzdks implements zzdcc {
    private zzdcc zza;

    /* access modifiers changed from: protected */
    public final synchronized void zzi(a aVar, zzbgi zzbgi, t tVar, zzbgk zzbgk, e0 e0Var, zzdcc zzdcc) {
        super.zzh(aVar, zzbgi, tVar, zzbgk, e0Var);
        this.zza = zzdcc;
    }

    public final synchronized void zzr() {
        zzdcc zzdcc = this.zza;
        if (zzdcc != null) {
            zzdcc.zzr();
        }
    }

    public final synchronized void zzs() {
        zzdcc zzdcc = this.zza;
        if (zzdcc != null) {
            zzdcc.zzs();
        }
    }
}
