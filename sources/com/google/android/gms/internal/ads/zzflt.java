package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflt extends zzfml {
    final /* synthetic */ zzflz zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzflx zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzflt(zzflx zzflx, TaskCompletionSource taskCompletionSource, zzflz zzflz, zzfmc zzfmc, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzflx;
        this.zza = zzflz;
        this.zzb = zzfmc;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zzfmh, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze = this.zzd.zza.zze();
            zzflx zzflx = this.zzd;
            String zzb2 = zzflx.zzd;
            zzflz zzflz = this.zza;
            String zzb3 = zzflx.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzflz.zze());
            bundle.putString("adFieldEnifd", zzflz.zzf());
            bundle.putInt("layoutGravity", zzflz.zzc());
            bundle.putFloat("layoutVerticalMargin", zzflz.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzflz.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", zzb3);
            if (zzflz.zzg() != null) {
                bundle.putString("appId", zzflz.zzg());
            }
            zze.zzf(zzb2, bundle, new zzflw(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzflx.zzb.zzb(e10, "show overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
