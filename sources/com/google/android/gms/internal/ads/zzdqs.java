package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.g0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdqs extends g0 {
    final /* synthetic */ zzdqm zza;
    final /* synthetic */ zzdqt zzb;

    zzdqs(zzdqt zzdqt, zzdqm zzdqm) {
        this.zzb = zzdqt;
        this.zza = zzdqm;
    }

    public final void zzc() throws RemoteException {
        this.zza.zzb(this.zzb.zza);
    }

    public final void zzd() throws RemoteException {
        this.zza.zzc(this.zzb.zza);
    }

    public final void zze(int i10) throws RemoteException {
        this.zza.zzd(this.zzb.zza, i10);
    }

    public final void zzf(c3 c3Var) throws RemoteException {
        this.zza.zzd(this.zzb.zza, c3Var.f14427a);
    }

    public final void zzg() {
    }

    public final void zzh() {
    }

    public final void zzi() throws RemoteException {
        this.zza.zze(this.zzb.zza);
    }

    public final void zzj() throws RemoteException {
        this.zza.zzg(this.zzb.zza);
    }

    public final void zzk() {
    }
}
