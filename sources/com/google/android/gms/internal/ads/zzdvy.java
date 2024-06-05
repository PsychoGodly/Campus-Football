package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdvy {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final zzdwt zzc;
    private final zzgws zzd;

    zzdvy(zzfuu zzfuu, zzfuu zzfuu2, zzdwt zzdwt, zzgws zzgws) {
        this.zza = zzfuu;
        this.zzb = zzfuu2;
        this.zzc = zzdwt;
        this.zzd = zzgws;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zza(zzbsv zzbsv) throws Exception {
        return this.zzc.zza(zzbsv, ((Long) a0.c().zzb(zzbar.zzjI)).longValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzb(zzbsv zzbsv, int i10, zzdvi zzdvi) throws Exception {
        return ((zzdxz) this.zzd.zzb()).zzb(zzbsv, i10);
    }

    public final zzfut zzc(zzbsv zzbsv) {
        zzfut zzfut;
        String str = zzbsv.zzf;
        t.r();
        if (b2.X(str)) {
            zzfut = zzfuj.zzg(new zzdvi(1, "Ads service proxy force local"));
        } else {
            zzfut = zzfuj.zzf(zzfuj.zzk(new zzdvv(this, zzbsv), this.zza), ExecutionException.class, zzdvw.zza, this.zzb);
        }
        return zzfuj.zzf(zzfut, zzdvi.class, new zzdvx(this, zzbsv, Binder.getCallingUid()), this.zzb);
    }
}
