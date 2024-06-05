package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdfe implements zzbhp {
    private final WeakReference zza;

    /* synthetic */ zzdfe(zzdff zzdff, zzdfd zzdfd) {
        this.zza = new WeakReference(zzdff);
    }

    public final void zza(Object obj, Map map) {
        zzdff zzdff = (zzdff) this.zza.get();
        if (zzdff != null) {
            zzdff.zzg.zza();
        }
    }
}
