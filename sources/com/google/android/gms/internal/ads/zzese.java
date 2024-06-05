package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzese implements zzepn {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbrg zzc;

    public zzese(zzbrg zzbrg, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbrg;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    public final int zza() {
        return 49;
    }

    public final zzfut zzb() {
        return zzfuj.zzl(zzfuj.zzn(zzfuj.zzh(new Bundle()), ((Long) a0.c().zzb(zzbar.zzdG)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzesd.zza, zzbzn.zza);
    }
}
