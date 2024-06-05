package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdle implements zzbhp {
    final /* synthetic */ zzdlf zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbhp zzd;

    /* synthetic */ zzdle(zzdlf zzdlf, WeakReference weakReference, String str, zzbhp zzbhp, zzdld zzdld) {
        this.zza = zzdlf;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbhp;
    }

    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
