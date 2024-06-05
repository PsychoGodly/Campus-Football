package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzekn implements zzepn {
    private final Executor zza;
    private final zzbyj zzb;

    zzekn(Executor executor, zzbyj zzbyj) {
        this.zza = executor;
        this.zzb = zzbyj;
    }

    public final int zza() {
        return 10;
    }

    public final zzfut zzb() {
        if (((Boolean) a0.c().zzb(zzbar.zzcp)).booleanValue()) {
            return zzfuj.zzh((Object) null);
        }
        return zzfuj.zzl(this.zzb.zzj(), zzekl.zza, this.zza);
    }
}
