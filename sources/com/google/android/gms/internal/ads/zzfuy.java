package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsx;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfuy extends zzfsx.zzi implements Runnable {
    private final Runnable zza;

    public zzfuy(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e10) {
            zze(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + "]";
    }
}
