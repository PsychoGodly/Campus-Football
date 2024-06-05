package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzezp {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet((Object) null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
