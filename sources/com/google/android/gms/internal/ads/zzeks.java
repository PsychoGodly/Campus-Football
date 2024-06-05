package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeks implements zzepn {
    final zzbyj zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfuu zzd;
    private final Context zze;

    zzeks(Context context, zzbyj zzbyj, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuu) {
        if (!((Boolean) a0.c().zzb(zzbar.zzcu)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbyj;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfuu;
    }

    public final int zza() {
        return 11;
    }

    public final zzfut zzb() {
        Task<AppSetIdInfo> task;
        if (((Boolean) a0.c().zzb(zzbar.zzcq)).booleanValue()) {
            if (!((Boolean) a0.c().zzb(zzbar.zzcv)).booleanValue()) {
                if (!((Boolean) a0.c().zzb(zzbar.zzcr)).booleanValue()) {
                    return zzfuj.zzl(zzfkz.zza(this.zzb.getAppSetIdInfo()), zzekp.zza, zzbzn.zzf);
                }
                if (((Boolean) a0.c().zzb(zzbar.zzcu)).booleanValue()) {
                    task = zzfaa.zza(this.zze);
                } else {
                    task = this.zzb.getAppSetIdInfo();
                }
                if (task == null) {
                    return zzfuj.zzh(new zzekt((String) null, -1));
                }
                zzfut zzm = zzfuj.zzm(zzfkz.zza(task), zzekq.zza, zzbzn.zzf);
                if (((Boolean) a0.c().zzb(zzbar.zzcs)).booleanValue()) {
                    zzm = zzfuj.zzn(zzm, ((Long) a0.c().zzb(zzbar.zzct)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfuj.zze(zzm, Exception.class, new zzekr(this), this.zzd);
            }
        }
        return zzfuj.zzh(new zzekt((String) null, -1));
    }
}
