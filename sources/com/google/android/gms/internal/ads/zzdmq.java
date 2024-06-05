package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.client.z4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdmq {
    private final zzceu zza;
    private final Context zzb;
    private final zzapw zzc;
    private final zzbbt zzd;
    private final zzbzg zze;
    private final a zzf;
    private final zzawe zzg;
    /* access modifiers changed from: private */
    public final zzcxd zzh;

    public zzdmq(zzceu zzceu, Context context, zzapw zzapw, zzbbt zzbbt, zzbzg zzbzg, a aVar, zzawe zzawe, zzcxd zzcxd) {
        this.zza = zzceu;
        this.zzb = context;
        this.zzc = zzapw;
        this.zzd = zzbbt;
        this.zze = zzbzg;
        this.zzf = aVar;
        this.zzg = zzawe;
        this.zzh = zzcxd;
    }

    public final zzcei zza(z4 z4Var, zzeyc zzeyc, zzeyf zzeyf) throws zzcet {
        return zzceu.zza(this.zzb, zzcfx.zzc(z4Var), z4Var.f14646a, false, false, this.zzc, this.zzd, this.zze, (zzbbj) null, new zzdmf(this), this.zzf, this.zzg, zzeyc, zzeyf);
    }
}
