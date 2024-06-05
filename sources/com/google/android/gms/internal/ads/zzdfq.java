package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdfq implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;

    public zzdfq(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcnq((Executor) this.zzb.zzb(), new zzcnc((Context) this.zzc.zzb(), (zzatb) this.zza.zzb()), (e) this.zzd.zzb());
    }
}
