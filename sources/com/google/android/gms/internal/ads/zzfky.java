package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfky extends zzfsx {
    Object zza;

    zzfky(Object obj) {
        this.zza = obj;
    }

    public final String zza() {
        Object obj = this.zza;
        return obj == null ? MaxReward.DEFAULT_LABEL : obj.toString();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zza = null;
    }

    public final boolean zzd(Object obj) {
        return super.zzd(obj);
    }

    public final boolean zze(Throwable th) {
        return super.zze(th);
    }
}
