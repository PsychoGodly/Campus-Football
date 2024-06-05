package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzein implements zzcur {
    public final /* synthetic */ zzeib zza;
    public final /* synthetic */ zzbkg zzb;

    public /* synthetic */ zzein(zzeib zzeib, zzbkg zzbkg) {
        this.zza = zzeib;
        this.zzb = zzbkg;
    }

    public final void zza(c3 c3Var) {
        zzeib zzeib = this.zza;
        zzbkg zzbkg = this.zzb;
        zzeib.zza(c3Var);
        if (zzbkg != null) {
            try {
                zzbkg.zzf(c3Var);
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
        if (zzbkg != null) {
            try {
                zzbkg.zze(c3Var.f14427a);
            } catch (RemoteException e11) {
                zzbza.zzl("#007 Could not call remote method.", e11);
            }
        }
    }
}
