package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.a0;
import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdxy implements zzfuf {
    final /* synthetic */ zzbtg zza;

    zzdxy(zzdxz zzdxz, zzbtg zzbtg) {
        this.zza = zzbtg;
    }

    public final void zza(Throwable th) {
        try {
            this.zza.zze(a0.w(th));
        } catch (RemoteException e10) {
            n1.b("Ad service can't call client", e10);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e10) {
            n1.b("Ad service can't call client", e10);
        }
    }
}
