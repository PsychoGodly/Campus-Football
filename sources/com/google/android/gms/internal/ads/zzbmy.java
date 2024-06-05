package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbmy {
    private static zzbmy zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbmy() {
    }

    public static zzbmy zza() {
        if (zza == null) {
            zza = new zzbmy();
        }
        return zza;
    }

    public final Thread zzb(Context context, String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzbmx(this, context, str));
        thread.start();
        return thread;
    }
}
