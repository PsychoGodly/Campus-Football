package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.b2;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcbd {
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) a0.c().zzb(zzbar.zzB)).longValue());
    private long zzb;
    private boolean zzc = true;

    zzcbd() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzcao zzcao) {
        if (zzcao != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.zzc || Math.abs(timestamp - this.zzb) >= this.zza) {
                this.zzc = false;
                this.zzb = timestamp;
                b2.f14773i.post(new zzcbc(zzcao));
            }
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
