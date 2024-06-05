package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflv extends zzfml {
    final /* synthetic */ zzfme zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzflx zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzflv(zzflx zzflx, TaskCompletionSource taskCompletionSource, zzfme zzfme, int i10, zzfmc zzfmc, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzflx;
        this.zza = zzfme;
        this.zzb = i10;
        this.zzc = zzfmc;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfmh, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze2 = this.zze.zza.zze();
            zzfme zzfme = this.zza;
            String zzb2 = this.zze.zzd;
            int i10 = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfme.zzb());
            bundle.putInt("displayMode", i10);
            bundle.putString("callerPackage", zzb2);
            bundle.putString("appId", zzfme.zza());
            zze2.zzg(bundle, new zzflw(this.zze, this.zzc));
        } catch (RemoteException e10) {
            zzflx.zzb.zzb(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e10));
        }
    }
}
