package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdlc implements Callable {
    /* access modifiers changed from: private */
    public final a zza;
    /* access modifiers changed from: private */
    public final zzceu zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    /* access modifiers changed from: private */
    public final zzdpi zzd;
    /* access modifiers changed from: private */
    public final zzfdk zze;
    /* access modifiers changed from: private */
    public final zzeaf zzf;
    /* access modifiers changed from: private */
    public final Executor zzg;
    /* access modifiers changed from: private */
    public final zzapw zzh;
    /* access modifiers changed from: private */
    public final zzbzg zzi;
    /* access modifiers changed from: private */
    public final zzfff zzj;

    public zzdlc(Context context, Executor executor, zzapw zzapw, zzbzg zzbzg, a aVar, zzceu zzceu, zzeaf zzeaf, zzfff zzfff, zzdpi zzdpi, zzfdk zzfdk) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzapw;
        this.zzi = zzbzg;
        this.zza = aVar;
        this.zzb = zzceu;
        this.zzf = zzeaf;
        this.zzj = zzfff;
        this.zzd = zzdpi;
        this.zze = zzfdk;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdlf zzdlf = new zzdlf(this);
        zzdlf.zzh();
        return zzdlf;
    }
}
