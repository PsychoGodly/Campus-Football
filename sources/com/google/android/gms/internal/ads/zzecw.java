package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import t4.e0;
import t4.s;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzecw implements zzdee {
    private final Context zza;
    private final zzbzg zzb;
    private final zzfut zzc;
    private final zzeyc zzd;
    private final zzcei zze;
    private final zzeyx zzf;
    private final zzbhr zzg;
    private final boolean zzh;

    zzecw(Context context, zzbzg zzbzg, zzfut zzfut, zzeyc zzeyc, zzcei zzcei, zzeyx zzeyx, boolean z10, zzbhr zzbhr) {
        this.zza = context;
        this.zzb = zzbzg;
        this.zzc = zzfut;
        this.zzd = zzeyc;
        this.zze = zzcei;
        this.zzf = zzeyx;
        this.zzg = zzbhr;
        this.zzh = z10;
    }

    public final void zza(boolean z10, Context context, zzcvb zzcvb) {
        zzdcw zzdcw = (zzdcw) zzfuj.zzp(this.zzc);
        this.zze.zzan(true);
        boolean zze2 = this.zzh ? this.zzg.zze(false) : false;
        t.r();
        boolean e10 = b2.e(this.zza);
        boolean z11 = this.zzh;
        j jVar = new j(zze2, e10, z11 ? this.zzg.zzd() : false, z11 ? this.zzg.zza() : 0.0f, -1, z10, this.zzd.zzP, false);
        if (zzcvb != null) {
            zzcvb.zzf();
        }
        t.k();
        zzddt zzh2 = zzdcw.zzh();
        zzcei zzcei = this.zze;
        zzeyc zzeyc = this.zzd;
        int i10 = zzeyc.zzR;
        zzbzg zzbzg = this.zzb;
        String str = zzeyc.zzC;
        zzeyh zzeyh = zzeyc.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((a) null, (t4.t) zzh2, (e0) null, zzcei, i10, zzbzg, str, jVar, zzeyh.zzb, zzeyh.zza, this.zzf.zzf, zzcvb);
        s.a(context, adOverlayInfoParcel, true);
    }
}
