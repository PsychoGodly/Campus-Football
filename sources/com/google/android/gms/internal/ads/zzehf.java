package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.m0;
import com.google.android.gms.ads.internal.client.u4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzehf extends m0 {
    private final zzeim zza;

    public zzehf(Context context, zzcgd zzcgd, zzeyv zzeyv, zzdgt zzdgt, h0 h0Var) {
        zzeio zzeio = new zzeio(zzdgt, zzcgd.zzx());
        zzeio.zze(h0Var);
        this.zza = new zzeim(new zzeiy(zzcgd, context, zzeio, zzeyv), zzeyv.zzI());
    }

    public final synchronized String zze() {
        return this.zza.zza();
    }

    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    public final void zzg(u4 u4Var) throws RemoteException {
        this.zza.zzd(u4Var, 1);
    }

    public final synchronized void zzh(u4 u4Var, int i10) throws RemoteException {
        this.zza.zzd(u4Var, i10);
    }

    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
