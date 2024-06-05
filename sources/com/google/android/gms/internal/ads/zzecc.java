package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzecc implements zzcqk {
    public final /* synthetic */ zzeaw zza;

    public /* synthetic */ zzecc(zzeaw zzeaw) {
        this.zza = zzeaw;
    }

    public final s2 zza() {
        try {
            return ((zzbpc) this.zza.zzb).zze();
        } catch (RemoteException e10) {
            throw new zzezc(e10);
        }
    }
}
