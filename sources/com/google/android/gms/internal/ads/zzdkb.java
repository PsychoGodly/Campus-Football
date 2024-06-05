package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdkb {
    private final zzeyx zza;
    private final Executor zzb;
    private final zzdmq zzc;
    private final zzdll zzd;
    private final Context zze;
    private final zzdpi zzf;
    private final zzfdk zzg;
    private final zzfff zzh;
    private final zzeaf zzi;

    public zzdkb(zzeyx zzeyx, Executor executor, zzdmq zzdmq, Context context, zzdpi zzdpi, zzfdk zzfdk, zzfff zzfff, zzeaf zzeaf, zzdll zzdll) {
        this.zza = zzeyx;
        this.zzb = executor;
        this.zzc = zzdmq;
        this.zze = context;
        this.zzf = zzdpi;
        this.zzg = zzfdk;
        this.zzh = zzfff;
        this.zzi = zzeaf;
        this.zzd = zzdll;
    }

    private final void zzh(zzcei zzcei) {
        zzi(zzcei);
        zzcei.zzad("/video", zzbho.zzl);
        zzcei.zzad("/videoMeta", zzbho.zzm);
        zzcei.zzad("/precache", new zzccv());
        zzcei.zzad("/delayPageLoaded", zzbho.zzp);
        zzcei.zzad("/instrument", zzbho.zzn);
        zzcei.zzad("/log", zzbho.zzg);
        zzcei.zzad("/click", zzbho.zza((zzdcc) null));
        if (this.zza.zzb != null) {
            zzcei.zzN().zzD(true);
            zzcei.zzad("/open", new zzbhz((b) null, (zzbpz) null, (zzeaf) null, (zzdpi) null, (zzfdk) null));
        } else {
            zzcei.zzN().zzD(false);
        }
        if (t.p().zzu(zzcei.getContext())) {
            zzcei.zzad("/logScionEvent", new zzbhu(zzcei.getContext()));
        }
    }

    private static final void zzi(zzcei zzcei) {
        zzcei.zzad("/videoClicked", zzbho.zzh);
        zzcei.zzN().zzF(true);
        if (((Boolean) a0.c().zzb(zzbar.zzdo)).booleanValue()) {
            zzcei.zzad("/getNativeAdViewSignals", zzbho.zzs);
        }
        zzcei.zzad("/getNativeClickMeta", zzbho.zzt);
    }

    public final zzfut zza(JSONObject jSONObject) {
        return zzfuj.zzm(zzfuj.zzm(zzfuj.zzh((Object) null), new zzdjr(this), this.zzb), new zzdjs(this, jSONObject), this.zzb);
    }

    public final zzfut zzb(String str, String str2, zzeyc zzeyc, zzeyf zzeyf, z4 z4Var) {
        return zzfuj.zzm(zzfuj.zzh((Object) null), new zzdju(this, z4Var, zzeyc, zzeyf, str, str2), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(JSONObject jSONObject, zzcei zzcei) throws Exception {
        zzbzr zza2 = zzbzr.zza(zzcei);
        if (this.zza.zzb != null) {
            zzcei.zzag(zzcfx.zzd());
        } else {
            zzcei.zzag(zzcfx.zze());
        }
        zzcei.zzN().zzA(new zzdjq(this, zzcei, zza2));
        zzcei.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzd(z4 z4Var, zzeyc zzeyc, zzeyf zzeyf, String str, String str2, Object obj) throws Exception {
        zzcei zza2 = this.zzc.zza(z4Var, zzeyc, zzeyf);
        zzbzr zza3 = zzbzr.zza(zza2);
        if (this.zza.zzb != null) {
            zzh(zza2);
            zza2.zzag(zzcfx.zzd());
        } else {
            zzdli zzb2 = this.zzd.zzb();
            zzdli zzdli = zzb2;
            zzcfv zzN = zza2.zzN();
            b bVar = r3;
            b bVar2 = new b(this.zze, (zzbwb) null, (zzbst) null);
            zzN.zzM(zzb2, zzdli, zzb2, zzb2, zzb2, false, (zzbhr) null, bVar, (zzbqg) null, (zzbwb) null, this.zzi, this.zzh, this.zzf, this.zzg, (zzbih) null, zzb2, (zzbig) null, (zzbia) null);
            zzi(zza2);
        }
        zza2.zzN().zzA(new zzdjv(this, zza2, zza3));
        zza2.zzab(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zze(Object obj) throws Exception {
        zzcei zza2 = this.zzc.zza(z4.w(), (zzeyc) null, (zzeyf) null);
        zzbzr zza3 = zzbzr.zza(zza2);
        zzh(zza2);
        zza2.zzN().zzG(new zzdjt(zza3));
        zza2.loadUrl((String) a0.c().zzb(zzbar.zzdn));
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcei zzcei, zzbzr zzbzr, boolean z10) {
        if (!(this.zza.zza == null || zzcei.zzq() == null)) {
            zzcei.zzq().zzs(this.zza.zza);
        }
        zzbzr.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcei zzcei, zzbzr zzbzr, boolean z10) {
        if (z10) {
            if (!(this.zza.zza == null || zzcei.zzq() == null)) {
                zzcei.zzq().zzs(this.zza.zza);
            }
            zzbzr.zzb();
            return;
        }
        zzbzr.zze(new zzeek(1, "Html video Web View failed to load."));
    }
}
