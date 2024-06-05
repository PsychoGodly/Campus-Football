package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.z4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n4.b;
import y4.b0;
import y4.g;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeou implements zzepn {
    private final String zza;
    private final zzfuu zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzeyx zze;
    private final zzcgd zzf;

    zzeou(zzfuu zzfuu, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzeyx zzeyx, zzcgd zzcgd) {
        this.zzb = zzfuu;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzeyx;
        this.zzf = zzcgd;
    }

    public static /* synthetic */ zzfut zzc(zzeou zzeou) {
        String str = zzeou.zza;
        if (((Boolean) a0.c().zzb(zzbar.zzgI)).booleanValue()) {
            str = b.UNKNOWN.name();
        }
        b0 zzn = zzeou.zzf.zzn();
        zzctx zzctx = new zzctx();
        zzctx.zzd(zzeou.zzd);
        zzeyv zzeyv = new zzeyv();
        zzeyv.zzs("adUnitId");
        zzeyv.zzE(zzeou.zze.zzd);
        zzeyv.zzr(new z4());
        zzctx.zzh(zzeyv.zzG());
        zzn.zza(zzctx.zzi());
        g gVar = new g();
        gVar.a(str);
        zzn.zzb(gVar.b());
        new zzczz();
        return zzfuj.zze(zzfuj.zzl((zzfua) zzfuj.zzn(zzfua.zzv(zzn.zzc().zzc()), ((Long) a0.c().zzb(zzbar.zzgJ)).longValue(), TimeUnit.MILLISECONDS, zzeou.zzc), zzeos.zza, zzeou.zzb), Exception.class, zzeot.zza, zzeou.zzb);
    }

    public final int zza() {
        return 33;
    }

    public final zzfut zzb() {
        if (!((Boolean) a0.c().zzb(zzbar.zzgH)).booleanValue() || "adUnitId".equals(this.zze.zzf)) {
            return this.zzb.zzb(zzeoq.zza);
        }
        return zzfuj.zzk(new zzeor(this), this.zzb);
    }
}
