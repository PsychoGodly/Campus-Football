package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzelh implements zzepn {
    private final zzeva zza;

    zzelh(zzeva zzeva) {
        this.zza = zzeva;
    }

    public final int zza() {
        return 15;
    }

    public final zzfut zzb() {
        zzeva zzeva = this.zza;
        zzelg zzelg = null;
        if (!(zzeva == null || zzeva.zza() == null || zzeva.zza().isEmpty())) {
            zzelg = new zzelg(this);
        }
        return zzfuj.zzh(zzelg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
