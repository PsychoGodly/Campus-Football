package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfdh {
    private final Executor zza;
    private final zzbzf zzb;

    public zzfdh(Executor executor, zzbzf zzbzf) {
        this.zza = executor;
        this.zzb = zzbzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(String str) {
        this.zza.execute(new zzfdg(this, str));
    }
}
