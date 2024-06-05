package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcjg implements zzdqr {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzbim zzb;
    private final zzchy zzc;
    private final zzcjg zzd = this;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;

    /* synthetic */ zzcjg(zzchy zzchy, Context context, zzbim zzbim, zzcjf zzcjf) {
        this.zzc = zzchy;
        this.zza = context;
        this.zzb = zzbim;
        zzgwy zza2 = zzgwz.zza(this);
        this.zze = zza2;
        zzgwy zza3 = zzgwz.zza(zzbim);
        this.zzf = zza3;
        zzdqn zzdqn = new zzdqn(zza3);
        this.zzg = zzdqn;
        this.zzh = zzgwx.zzc(new zzdqp(zza2, zzdqn));
    }

    public final zzdqi zzb() {
        return new zzcja(this.zzc, this.zzd, (zzciz) null);
    }

    public final zzdqo zzd() {
        return (zzdqo) this.zzh.zzb();
    }
}
