package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfrr {
    static Object zza(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}
