package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;
import h5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzavl implements c.b {
    final /* synthetic */ zzavm zza;

    zzavl(zzavm zzavm) {
        this.zza = zzavm;
    }

    public final void onConnectionFailed(b bVar) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzavm zzavm = this.zza;
            if (zzavm.zzd != null) {
                zzavm.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
