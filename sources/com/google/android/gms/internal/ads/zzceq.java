package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzceq implements zzfok {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcfx zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzapw zzf;
    public final /* synthetic */ zzbbt zzg;
    public final /* synthetic */ zzbzg zzh;
    public final /* synthetic */ l zzi;
    public final /* synthetic */ a zzj;
    public final /* synthetic */ zzawe zzk;
    public final /* synthetic */ zzeyc zzl;
    public final /* synthetic */ zzeyf zzm;

    public /* synthetic */ zzceq(Context context, zzcfx zzcfx, String str, boolean z10, boolean z11, zzapw zzapw, zzbbt zzbbt, zzbzg zzbzg, zzbbj zzbbj, l lVar, a aVar, zzawe zzawe, zzeyc zzeyc, zzeyf zzeyf) {
        this.zza = context;
        this.zzb = zzcfx;
        this.zzc = str;
        this.zzd = z10;
        this.zze = z11;
        this.zzf = zzapw;
        this.zzg = zzbbt;
        this.zzh = zzbzg;
        this.zzi = lVar;
        this.zzj = aVar;
        this.zzk = zzawe;
        this.zzl = zzeyc;
        this.zzm = zzeyf;
    }

    public final Object zza() {
        Context context = this.zza;
        zzcfx zzcfx = this.zzb;
        String str = this.zzc;
        boolean z10 = this.zzd;
        boolean z11 = this.zze;
        zzapw zzapw = this.zzf;
        zzbbt zzbbt = this.zzg;
        zzbzg zzbzg = this.zzh;
        l lVar = this.zzi;
        a aVar = this.zzj;
        zzawe zzawe = this.zzk;
        zzeyc zzeyc = this.zzl;
        zzeyf zzeyf = this.zzm;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = zzcfb.zza;
            zzcex zzcex = new zzcex(new zzcfb(new zzcfw(context), zzcfx, str, z10, z11, zzapw, zzbbt, zzbzg, (zzbbj) null, lVar, aVar, zzawe, zzeyc, zzeyf));
            zzcex.setWebViewClient(t.s().d(zzcex, zzawe, z11));
            zzcex.setWebChromeClient(new zzceh(zzcex));
            return zzcex;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
