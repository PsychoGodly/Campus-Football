package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdvt {
    private final zzfuu zza;
    private final zzduz zzb;
    private final zzgws zzc;
    private final zzfep zzd;
    private final Context zze;
    private final zzbzg zzf;

    public zzdvt(zzfuu zzfuu, zzduz zzduz, zzgws zzgws, zzfep zzfep, Context context, zzbzg zzbzg) {
        this.zza = zzfuu;
        this.zzb = zzduz;
        this.zzc = zzgws;
        this.zzd = zzfep;
        this.zze = context;
        this.zzf = zzbzg;
    }

    private final zzfut zzh(zzbtn zzbtn, zzdvs zzdvs, zzdvs zzdvs2, zzftq zzftq) {
        zzfut zzfut;
        String str = zzbtn.zzd;
        t.r();
        if (b2.X(str)) {
            zzfut = zzfuj.zzg(new zzdvi(1));
        } else {
            zzfut = zzfuj.zzf(zzdvs.zza(zzbtn), ExecutionException.class, zzdvj.zza, this.zza);
        }
        return zzfuj.zzf(zzfuj.zzm(zzfua.zzv(zzfut), zzftq, this.zza), zzdvi.class, new zzdvr(this, zzdvs2, zzbtn, zzftq), this.zza);
    }

    public final zzfut zza(zzbtn zzbtn) {
        return zzh(zzbtn, new zzdvp(this.zzb), new zzdvq(this), new zzdvo(zzbtn));
    }

    public final zzfut zzb(JSONObject jSONObject) {
        return zzfuj.zzm(zzfua.zzv(zzfuj.zzh(jSONObject)), t.h().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbmc.zza, zzdvn.zza), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(zzdvs zzdvs, zzbtn zzbtn, zzftq zzftq, zzdvi zzdvi) throws Exception {
        return zzfuj.zzm(zzdvs.zza(zzbtn), zzftq, this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzd(zzbtn zzbtn) {
        return ((zzdxp) this.zzc.zzb()).zzb(zzbtn, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zze(zzbtn zzbtn) {
        return this.zzb.zzc(zzbtn.zzh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzf(zzbtn zzbtn) {
        return ((zzdxp) this.zzc.zzb()).zzi(zzbtn.zzh);
    }

    public final zzfut zzg(zzbtn zzbtn) {
        return zzh(zzbtn, new zzdvl(this), new zzdvm(this), zzdvk.zza);
    }
}
