package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdkr implements zzbhp {
    private final zzbfb zza;
    private final zzdlf zzb;
    private final zzgws zzc;

    public zzdkr(zzdgt zzdgt, zzdgi zzdgi, zzdlf zzdlf, zzgws zzgws) {
        this.zza = zzdgt.zzc(zzdgi.zzz());
        this.zzb = zzdlf;
        this.zzc = zzgws;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzber) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            zzbza.zzk("Failed to call onCustomClick for asset " + str + ".", e10);
        }
    }

    public final void zzb() {
        if (this.zza != null) {
            this.zzb.zzi("/nativeAdCustomClick", this);
        }
    }
}
