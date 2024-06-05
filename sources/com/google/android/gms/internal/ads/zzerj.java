package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzerj implements zzepn {
    private final Context zza;
    private final zzbyj zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzbya zzf;

    public zzerj(zzbya zzbya, int i10, Context context, zzbyj zzbyj, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzbya;
        this.zza = context;
        this.zzb = zzbyj;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    public final int zza() {
        return 44;
    }

    public final zzfut zzb() {
        return zzfuj.zze((zzfua) zzfuj.zzn(zzfuj.zzl(zzfua.zzv(zzfuj.zzk(new zzerg(this), this.zzd)), zzerh.zza, this.zzd), ((Long) a0.c().zzb(zzbar.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzeri(this), zzfva.zzb());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzerk zzc(Exception exc) {
        this.zzb.zzu(exc, "AttestationTokenSignal");
        return null;
    }
}
