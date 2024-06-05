package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdtj {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final zzdur zzc;
    private final zzgws zzd;

    public zzdtj(zzfuu zzfuu, zzfuu zzfuu2, zzdur zzdur, zzgws zzgws) {
        this.zza = zzfuu;
        this.zzb = zzfuu2;
        this.zzc = zzdur;
        this.zzd = zzgws;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zza(zzbtn zzbtn, int i10, zzdvi zzdvi) throws Exception {
        return ((zzdxp) this.zzd.zzb()).zzc(zzbtn, i10);
    }

    public final zzfut zzb(zzbtn zzbtn) {
        zzfut zzfut;
        String str = zzbtn.zzd;
        t.r();
        if (b2.X(str)) {
            zzfut = zzfuj.zzg(new zzdvi(1));
        } else {
            zzfut = zzfuj.zzf(this.zza.zzb(new zzdtg(this, zzbtn)), ExecutionException.class, zzdth.zza, this.zzb);
        }
        return zzfuj.zzf(zzfut, zzdvi.class, new zzdti(this, zzbtn, Binder.getCallingUid()), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbtn zzbtn) throws Exception {
        zzbzs zzbzs;
        zzdur zzdur = this.zzc;
        synchronized (zzdur.zzb) {
            if (zzdur.zzc) {
                zzbzs = zzdur.zza;
            } else {
                zzdur.zzc = true;
                zzdur.zze = zzbtn;
                zzdur.zzf.checkAvailabilityAndConnect();
                zzdur.zza.zzc(new zzduq(zzdur), zzbzn.zzf);
                zzbzs = zzdur.zza;
            }
        }
        return (InputStream) zzbzs.get((long) ((Integer) a0.c().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS);
    }
}
