package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzno {
    public static final zzno zza = (zzew.zza < 31 ? new zzno() : new zzno(zznn.zza));
    private final zznn zzb;

    public zzno() {
        this.zzb = null;
        zzdl.zzf(zzew.zza < 31);
    }

    private zzno(zznn zznn) {
        this.zzb = zznn;
    }

    public final LogSessionId zza() {
        zznn zznn = this.zzb;
        Objects.requireNonNull(zznn);
        return zznn.zzb;
    }

    public zzno(LogSessionId logSessionId) {
        this.zzb = new zznn(logSessionId);
    }
}
