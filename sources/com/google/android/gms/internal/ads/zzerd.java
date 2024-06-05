package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzerd implements zzepn {
    private final zzbyj zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfuu zzd;
    private final zzavh zze;

    zzerd(String str, zzavh zzavh, zzbyj zzbyj, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuu, byte[] bArr) {
        this.zzb = str;
        this.zze = zzavh;
        this.zza = zzbyj;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfuu;
    }

    public final int zza() {
        return 43;
    }

    public final zzfut zzb() {
        if (((Boolean) a0.c().zzb(zzbar.zzcq)).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzcv)).booleanValue()) {
                zzfut zzm = zzfuj.zzm(zzfkz.zza(Tasks.forResult(null)), zzerb.zza, this.zzd);
                if (((Boolean) zzbbz.zza.zze()).booleanValue()) {
                    zzm = zzfuj.zzn(zzm, ((Long) zzbbz.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfuj.zze(zzm, Exception.class, new zzerc(this), this.zzd);
            }
        }
        return zzfuj.zzh(new zzere((String) null, -1));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzere zzc(Exception exc) {
        this.zza.zzu(exc, "AppSetIdInfoGmscoreSignal");
        return new zzere((String) null, -1);
    }
}
