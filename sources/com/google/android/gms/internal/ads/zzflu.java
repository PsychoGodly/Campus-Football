package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflu extends zzfml {
    final /* synthetic */ zzflo zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzflx zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzflu(zzflx zzflx, TaskCompletionSource taskCompletionSource, zzflo zzflo, zzfmc zzfmc, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzflx;
        this.zza = zzflo;
        this.zzb = zzfmc;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfmh, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze = this.zzd.zza.zze();
            zzflo zzflo = this.zza;
            String zzb2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzflo.zzb());
            bundle.putString("callerPackage", zzb2);
            bundle.putString("appId", zzflo.zza());
            zze.zze(bundle, new zzflw(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzflx.zzb.zzb(e10, "dismiss overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
