package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfta {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!a.a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
