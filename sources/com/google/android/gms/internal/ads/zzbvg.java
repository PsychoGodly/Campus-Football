package com.google.android.gms.internal.ads;

import a5.b;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvg implements b {
    private final zzbut zza;

    public zzbvg(zzbut zzbut) {
        this.zza = zzbut;
    }

    public final int getAmount() {
        zzbut zzbut = this.zza;
        if (zzbut != null) {
            try {
                return zzbut.zze();
            } catch (RemoteException e10) {
                zzbza.zzk("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    public final String getType() {
        zzbut zzbut = this.zza;
        if (zzbut != null) {
            try {
                return zzbut.zzf();
            } catch (RemoteException e10) {
                zzbza.zzk("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}
