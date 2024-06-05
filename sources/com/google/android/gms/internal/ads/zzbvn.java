package com.google.android.gms.internal.ads;

import a5.b;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvn extends zzbus {
    private final String zza;
    private final int zzb;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbvn(b bVar) {
        this(bVar != null ? bVar.getType() : MaxReward.DEFAULT_LABEL, bVar != null ? bVar.getAmount() : 1);
    }

    public final int zze() throws RemoteException {
        return this.zzb;
    }

    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbvn(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}
