package com.google.android.gms.internal.ads;

import a5.a;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.f2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzexr implements a {
    final /* synthetic */ f2 zza;
    final /* synthetic */ zzext zzb;

    zzexr(zzext zzext, f2 f2Var) {
        this.zzb = zzext;
        this.zza = f2Var;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzh != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
