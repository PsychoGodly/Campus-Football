package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbbk extends zzbbl {
    private final f zza;
    private final String zzb;
    private final String zzc;

    public zzbbk(f fVar, String str, String str2) {
        this.zza = fVar;
        this.zzb = str;
        this.zzc = str2;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzd(a aVar) {
        if (aVar != null) {
            this.zza.zza((View) b.A1(aVar));
        }
    }

    public final void zze() {
        this.zza.zzb();
    }

    public final void zzf() {
        this.zza.zzc();
    }
}
