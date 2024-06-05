package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.e0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeif implements a, zzdcc {
    private e0 zza;

    public final synchronized void onAdClicked() {
        e0 e0Var = this.zza;
        if (e0Var != null) {
            try {
                e0Var.zzb();
            } catch (RemoteException e10) {
                zzbza.zzk("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    public final synchronized void zza(e0 e0Var) {
        this.zza = e0Var;
    }

    public final synchronized void zzr() {
        e0 e0Var = this.zza;
        if (e0Var != null) {
            try {
                e0Var.zzb();
            } catch (RemoteException e10) {
                zzbza.zzk("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }

    public final synchronized void zzs() {
    }
}
