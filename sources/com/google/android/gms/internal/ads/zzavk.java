package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzavk implements c.a {
    final /* synthetic */ zzavm zza;

    zzavk(zzavm zzavm) {
        this.zza = zzavm;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzavm zzavm = this.zza;
                if (zzavm.zzd != null) {
                    zzavm.zzf = zzavm.zzd.zzq();
                }
            } catch (DeadObjectException e10) {
                zzbza.zzh("Unable to obtain a cache service instance.", e10);
                zzavm.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i10) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
