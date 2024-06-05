package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzakf {
    private final Executor zza;

    public zzakf(Handler handler) {
        this.zza = new zzakd(this, handler);
    }

    public final void zza(zzako zzako, zzakx zzakx) {
        zzako.zzm("post-error");
        zzaku zza2 = zzaku.zza(zzakx);
        Executor executor = this.zza;
        ((zzakd) executor).zza.post(new zzake(zzako, zza2, (Runnable) null));
    }

    public final void zzb(zzako zzako, zzaku zzaku, Runnable runnable) {
        zzako.zzq();
        zzako.zzm("post-response");
        Executor executor = this.zza;
        ((zzakd) executor).zza.post(new zzake(zzako, zzaku, runnable));
    }
}
