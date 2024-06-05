package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdqt implements zzdqh {
    /* access modifiers changed from: private */
    public final long zza;
    private final zzeij zzb;

    zzdqt(long j10, Context context, zzdqm zzdqm, zzcgd zzcgd, String str) {
        this.zza = j10;
        zzewh zzt = zzcgd.zzt();
        zzt.zzc(context);
        zzt.zza(new z4());
        zzt.zzb(str);
        zzeij zza2 = zzt.zzd().zza();
        this.zzb = zza2;
        zza2.zzD(new zzdqs(this, zzdqm));
    }

    public final void zza() {
        this.zzb.zzx();
    }

    public final void zzb(u4 u4Var) {
        this.zzb.zzaa(u4Var);
    }

    public final void zzc() {
        this.zzb.zzW(b.B1(null));
    }
}
