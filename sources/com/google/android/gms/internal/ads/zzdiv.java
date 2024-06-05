package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdiv implements Callable {
    public final /* synthetic */ zzdiw zza;
    public final /* synthetic */ zzfut zzb;
    public final /* synthetic */ zzfut zzc;
    public final /* synthetic */ zzfut zzd;
    public final /* synthetic */ zzfut zze;
    public final /* synthetic */ zzfut zzf;
    public final /* synthetic */ JSONObject zzg;
    public final /* synthetic */ zzfut zzh;
    public final /* synthetic */ zzfut zzi;
    public final /* synthetic */ zzfut zzj;
    public final /* synthetic */ zzfut zzk;

    public /* synthetic */ zzdiv(zzdiw zzdiw, zzfut zzfut, zzfut zzfut2, zzfut zzfut3, zzfut zzfut4, zzfut zzfut5, JSONObject jSONObject, zzfut zzfut6, zzfut zzfut7, zzfut zzfut8, zzfut zzfut9) {
        this.zza = zzdiw;
        this.zzb = zzfut;
        this.zzc = zzfut2;
        this.zzd = zzfut3;
        this.zze = zzfut4;
        this.zzf = zzfut5;
        this.zzg = jSONObject;
        this.zzh = zzfut6;
        this.zzi = zzfut7;
        this.zzj = zzfut8;
        this.zzk = zzfut9;
    }

    public final Object call() {
        zzfut zzfut = this.zzb;
        zzfut zzfut2 = this.zzc;
        zzfut zzfut3 = this.zzd;
        zzfut zzfut4 = this.zze;
        zzfut zzfut5 = this.zzf;
        JSONObject jSONObject = this.zzg;
        zzfut zzfut6 = this.zzh;
        zzfut zzfut7 = this.zzi;
        zzfut zzfut8 = this.zzj;
        zzfut zzfut9 = this.zzk;
        zzdgi zzdgi = (zzdgi) zzfut.get();
        zzdgi.zzO((List) zzfut2.get());
        zzdgi.zzL((zzbdx) zzfut3.get());
        zzdgi.zzP((zzbdx) zzfut4.get());
        zzdgi.zzI((zzbdp) zzfut5.get());
        zzdgi.zzR(zzdjj.zzj(jSONObject));
        zzdgi.zzK(zzdjj.zzi(jSONObject));
        zzcei zzcei = (zzcei) zzfut6.get();
        if (zzcei != null) {
            zzdgi.zzaa(zzcei);
            zzdgi.zzZ(zzcei.zzF());
            zzdgi.zzY(zzcei.zzq());
        }
        zzcei zzcei2 = (zzcei) zzfut7.get();
        if (zzcei2 != null) {
            zzdgi.zzN(zzcei2);
            zzdgi.zzab(zzcei2.zzF());
        }
        if (((Boolean) a0.c().zzb(zzbar.zzeI)).booleanValue()) {
            zzdgi.zzT(zzfut8);
        } else {
            zzcei zzcei3 = (zzcei) zzfut8.get();
            if (zzcei3 != null) {
                zzdgi.zzS(zzcei3);
            }
        }
        for (zzdjn zzdjn : (List) zzfut9.get()) {
            if (zzdjn.zza != 1) {
                zzdgi.zzM(zzdjn.zzb, zzdjn.zzd);
            } else {
                zzdgi.zzW(zzdjn.zzb, zzdjn.zzc);
            }
        }
        return zzdgi;
    }
}
