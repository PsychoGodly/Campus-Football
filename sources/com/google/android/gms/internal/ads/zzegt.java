package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzegt {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdnd zzb;

    public zzegt(zzdnd zzdnd) {
        this.zzb = zzdnd;
    }

    public final zzbpc zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbpc) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            zzbza.zzh("Couldn't create RTB adapter : ", e10);
        }
    }
}
