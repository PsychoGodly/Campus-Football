package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcrt {
    private final zzduo zza;
    private final zzeyx zzb;
    private final zzfda zzc;
    private final zzclq zzd;
    private final zzeem zze;
    /* access modifiers changed from: private */
    public final zzczt zzf;
    private zzeyo zzg;
    private final zzdvt zzh;
    private final zzctt zzi;
    private final Executor zzj;
    private final zzdvf zzk;
    private final zzeay zzl;
    private final zzdwj zzm;
    private final zzdwq zzn;

    zzcrt(zzduo zzduo, zzeyx zzeyx, zzfda zzfda, zzclq zzclq, zzeem zzeem, zzczt zzczt, zzeyo zzeyo, zzdvt zzdvt, zzctt zzctt, Executor executor, zzdvf zzdvf, zzeay zzeay, zzdwj zzdwj, zzdwq zzdwq) {
        this.zza = zzduo;
        this.zzb = zzeyx;
        this.zzc = zzfda;
        this.zzd = zzclq;
        this.zze = zzeem;
        this.zzf = zzczt;
        this.zzg = zzeyo;
        this.zzh = zzdvt;
        this.zzi = zzctt;
        this.zzj = executor;
        this.zzk = zzdvf;
        this.zzl = zzeay;
        this.zzm = zzdwj;
        this.zzn = zzdwq;
    }

    public final c3 zza(Throwable th) {
        return zzezx.zzb(th, this.zzl);
    }

    public final zzczt zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeyo zzd(zzeyo zzeyo) throws Exception {
        this.zzd.zza(zzeyo);
        return zzeyo;
    }

    public final zzfut zze(zzfaq zzfaq) {
        zzfcf zza2 = this.zzc.zzb(zzfcu.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzcrq(this, zzfaq)).zza();
        zzfuj.zzq(zza2, new zzcrr(this), this.zzj);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzf(zzfaq zzfaq, zzbtn zzbtn) throws Exception {
        zzbtn.zzi = zzfaq;
        return this.zzh.zza(zzbtn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzg(zzfut zzfut, zzfut zzfut2, zzfut zzfut3) throws Exception {
        return this.zzn.zzc((zzbtn) zzfut.get(), (JSONObject) zzfut2.get(), (zzbtq) zzfut3.get());
    }

    public final zzfut zzh(zzbtn zzbtn) {
        zzfcf zza2 = this.zzc.zzb(zzfcu.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbtn)).zza();
        zzfuj.zzq(zza2, new zzcrs(this), this.zzj);
        return zza2;
    }

    public final zzfut zzi(zzfut zzfut) {
        zzfcr zzf2 = this.zzc.zzb(zzfcu.RENDERER, zzfut).zze(new zzcrp(this)).zzf(this.zze);
        if (!((Boolean) a0.c().zzb(zzbar.zzfb)).booleanValue()) {
            zzf2 = zzf2.zzi((long) ((Integer) a0.c().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS);
        }
        return zzf2.zza();
    }

    public final zzfut zzj() {
        u4 u4Var = this.zzb.zzd;
        if (u4Var.f14574y == null && u4Var.f14569t == null) {
            return zzk(this.zzi.zzc());
        }
        zzfda zzfda = this.zzc;
        return zzfck.zzc(this.zza.zza(), zzfcu.PRELOADED_LOADER, zzfda).zza();
    }

    public final zzfut zzk(zzfut zzfut) {
        zzeyo zzeyo = this.zzg;
        if (zzeyo != null) {
            zzfda zzfda = this.zzc;
            return zzfck.zzc(zzfuj.zzh(zzeyo), zzfcu.SERVER_TRANSACTION, zzfda).zza();
        }
        t.e().zzj();
        if (!((Boolean) a0.c().zzb(zzbar.zzjG)).booleanValue() || ((Boolean) zzbcq.zzb.zze()).booleanValue()) {
            return this.zzc.zzb(zzfcu.SERVER_TRANSACTION, zzfut).zzf(new zzcro(this.zzk)).zza();
        }
        zzfut zzm2 = zzfuj.zzm(zzfut, new zzcrk(this.zzm), this.zzj);
        zzfcf zza2 = this.zzc.zzb(zzfcu.BUILD_URL, zzm2).zzf(new zzcrl(this.zzh)).zza();
        return this.zzc.zza(zzfcu.SERVER_TRANSACTION, zzfut, zzm2, zza2).zza(new zzcrm(this, zzfut, zzm2, zza2)).zzf(zzcrn.zza).zza();
    }

    public final void zzl(zzeyo zzeyo) {
        this.zzg = zzeyo;
    }
}
