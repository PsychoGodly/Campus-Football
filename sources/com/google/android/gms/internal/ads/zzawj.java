package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzawj {
    final /* synthetic */ zzawk zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzawj(zzawk zzawk, byte[] bArr, zzawi zzawi) {
        this.zza = zzawk;
        this.zzb = bArr;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzawk zzawk = this.zza;
            if (zzawk.zzb) {
                zzawk.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            zzbza.zzf("Clearcut log failed", e10);
        }
    }

    public final zzawj zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new zzawh(this));
    }
}
