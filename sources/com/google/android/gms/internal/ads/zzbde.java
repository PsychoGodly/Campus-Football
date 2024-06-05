package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbde {
    private final Context zza;

    public zzbde(Context context) {
        this.zza = context;
    }

    public final void zza(zzbsm zzbsm) {
        try {
            ((zzbdf) zzbze.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbdd.zza)).zze(zzbsm);
        } catch (zzbzd e10) {
            zzbza.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
        } catch (RemoteException e11) {
            zzbza.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e11.getMessage())));
        }
    }
}
