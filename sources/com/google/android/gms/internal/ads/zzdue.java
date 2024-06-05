package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdue {
    private final ScheduledExecutorService zza;
    private final zzfuu zzb;
    private final zzfuu zzc;
    private final zzduv zzd;
    private final zzgws zze;

    public zzdue(ScheduledExecutorService scheduledExecutorService, zzfuu zzfuu, zzfuu zzfuu2, zzduv zzduv, zzgws zzgws) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfuu;
        this.zzc = zzfuu2;
        this.zzd = zzduv;
        this.zze = zzgws;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zza(zzbtn zzbtn, int i10, Throwable th) throws Exception {
        return ((zzdxp) this.zze.zzb()).zzd(zzbtn, i10);
    }

    public final zzfut zzb(zzbtn zzbtn) {
        zzfut zzfut;
        String str = zzbtn.zzd;
        t.r();
        if (b2.X(str)) {
            zzfut = zzfuj.zzg(new zzdvi(1));
        } else {
            if (((Boolean) a0.c().zzb(zzbar.zzhc)).booleanValue()) {
                zzfut = this.zzc.zzb(new zzduc(this, zzbtn));
            } else {
                zzfut = this.zzd.zzb(zzbtn);
            }
        }
        int callingUid = Binder.getCallingUid();
        return zzfuj.zzf((zzfua) zzfuj.zzn(zzfua.zzv(zzfut), (long) ((Integer) a0.c().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzdud(this, zzbtn, callingUid), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbtn zzbtn) throws Exception {
        return (InputStream) this.zzd.zzb(zzbtn).get((long) ((Integer) a0.c().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS);
    }
}
