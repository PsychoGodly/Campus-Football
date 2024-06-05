package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcoo implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;

    public zzcoo(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5, zzgxl zzgxl6, zzgxl zzgxl7, zzgxl zzgxl8, zzgxl zzgxl9, zzgxl zzgxl10) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
        this.zzf = zzgxl6;
        this.zzg = zzgxl7;
        this.zzh = zzgxl8;
        this.zzi = zzgxl9;
        this.zzj = zzgxl10;
    }

    public static zzcon zzc(zzcql zzcql, Context context, zzeyd zzeyd, View view, zzcei zzcei, zzcqk zzcqk, zzdgt zzdgt, zzdce zzdce, zzgws zzgws, Executor executor) {
        return new zzcon(zzcql, context, zzeyd, view, zzcei, zzcqk, zzdgt, zzdce, zzgws, executor);
    }

    /* renamed from: zza */
    public final zzcon zzb() {
        return new zzcon(((zzcsl) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcou) this.zzc).zza(), ((zzcot) this.zzd).zza(), ((zzcpf) this.zze).zza(), ((zzcov) this.zzf).zza(), ((zzdeq) this.zzg).zza(), (zzdce) this.zzh.zzb(), zzgwx.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
