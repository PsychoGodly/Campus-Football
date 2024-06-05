package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjq {
    final /* synthetic */ zzfjr zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfjq(zzfjr zzfjr, byte[] bArr, zzfjp zzfjp) {
        this.zza = zzfjr;
        this.zzb = bArr;
    }

    public final zzfjq zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfjq zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfjr zzfjr = this.zza;
            if (zzfjr.zzb) {
                zzfjr.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }
}
