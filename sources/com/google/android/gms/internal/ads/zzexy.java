package com.google.android.gms.internal.ads;

import a5.a;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.y0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzexy implements a {
    final /* synthetic */ y0 zza;
    final /* synthetic */ zzexz zzb;

    zzexy(zzexz zzexz, y0 y0Var) {
        this.zzb = zzexz;
        this.zza = y0Var;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
