package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.f;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzegn implements f {
    private f zza;

    public final synchronized void zza(View view) {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zza(view);
        }
    }

    public final synchronized void zzb() {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zzb();
        }
    }

    public final synchronized void zzc() {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zzc();
        }
    }

    public final synchronized void zzd(f fVar) {
        this.zza = fVar;
    }
}
