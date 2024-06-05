package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import t4.e0;
import t4.s;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzebh implements zzdee {
    private final zzbzg zza;
    private final zzfut zzb;
    private final zzeyc zzc;
    private final zzcei zzd;
    private final zzeyx zze;
    private final zzbhr zzf;
    private final boolean zzg;

    zzebh(zzbzg zzbzg, zzfut zzfut, zzeyc zzeyc, zzcei zzcei, zzeyx zzeyx, boolean z10, zzbhr zzbhr) {
        this.zza = zzbzg;
        this.zzb = zzfut;
        this.zzc = zzeyc;
        this.zzd = zzcei;
        this.zze = zzeyx;
        this.zzg = z10;
        this.zzf = zzbhr;
    }

    public final void zza(boolean z10, Context context, zzcvb zzcvb) {
        int i10;
        zzcnv zzcnv = (zzcnv) zzfuj.zzp(this.zzb);
        this.zzd.zzan(true);
        boolean zze2 = this.zzg ? this.zzf.zze(true) : true;
        boolean z11 = this.zzg;
        j jVar = new j(zze2, true, z11 ? this.zzf.zzd() : false, z11 ? this.zzf.zza() : 0.0f, -1, z10, this.zzc.zzP, false);
        if (zzcvb != null) {
            zzcvb.zzf();
        }
        t.k();
        zzddt zzg2 = zzcnv.zzg();
        zzcei zzcei = this.zzd;
        int i11 = this.zzc.zzR;
        if (i11 == -1) {
            f5 f5Var = this.zze.zzj;
            if (f5Var != null) {
                int i12 = f5Var.f14465a;
                if (i12 == 1) {
                    i10 = 7;
                } else if (i12 == 2) {
                    i10 = 6;
                }
                zzbzg zzbzg = this.zza;
                zzeyc zzeyc = this.zzc;
                String str = zzeyc.zzC;
                zzeyh zzeyh = zzeyc.zzt;
                AdOverlayInfoParcel adOverlayInfoParcel = r4;
                AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((a) null, (t4.t) zzg2, (e0) null, zzcei, i10, zzbzg, str, jVar, zzeyh.zzb, zzeyh.zza, this.zze.zzf, zzcvb);
                s.a(context, adOverlayInfoParcel, true);
            }
            zzbza.zze("Error setting app open orientation; no targeting orientation available.");
            i11 = this.zzc.zzR;
        }
        i10 = i11;
        zzbzg zzbzg2 = this.zza;
        zzeyc zzeyc2 = this.zzc;
        String str2 = zzeyc2.zzC;
        zzeyh zzeyh2 = zzeyc2.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel3 = adOverlayInfoParcel2;
        AdOverlayInfoParcel adOverlayInfoParcel22 = new AdOverlayInfoParcel((a) null, (t4.t) zzg2, (e0) null, zzcei, i10, zzbzg2, str2, jVar, zzeyh2.zzb, zzeyh2.zza, this.zze.zzf, zzcvb);
        s.a(context, adOverlayInfoParcel3, true);
    }
}
