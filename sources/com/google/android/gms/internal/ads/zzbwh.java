package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.i4;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbwh {
    private final e zza;
    private final zzbwf zzb;

    zzbwh(e eVar, zzbwf zzbwf) {
        this.zza = eVar;
        this.zzb = zzbwf;
    }

    public static zzbwh zza(Context context) {
        return zzbxg.zzd(context).zzb();
    }

    public final void zzb(int i10, long j10) {
        this.zzb.zzb(i10, j10);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(i4 i4Var) {
        this.zzb.zzb(-1, this.zza.a());
    }

    public final void zze() {
        this.zzb.zzb(-1, this.zza.a());
    }
}
