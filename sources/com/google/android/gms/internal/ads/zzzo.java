package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzzo {
    private final zzzn zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzzo(zzzn zzzn) {
        this.zza = zzzn;
    }

    public final zzzu zza(Object... objArr) {
        Constructor constructor;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    constructor = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (zzzu) constructor.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
