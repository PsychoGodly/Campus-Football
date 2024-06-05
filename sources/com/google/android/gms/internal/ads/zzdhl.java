package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdhl implements zzbhp {
    public final /* synthetic */ zzdhm zza;
    public final /* synthetic */ zzbfr zzb;

    public /* synthetic */ zzdhl(zzdhm zzdhm, zzbfr zzbfr) {
        this.zza = zzdhm;
        this.zzb = zzbfr;
    }

    public final void zza(Object obj, Map map) {
        zzdhm zzdhm = this.zza;
        zzbfr zzbfr = this.zzb;
        try {
            zzdhm.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzbza.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzdhm.zza = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbfr == null) {
            zzbza.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbfr.zzf(str);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
