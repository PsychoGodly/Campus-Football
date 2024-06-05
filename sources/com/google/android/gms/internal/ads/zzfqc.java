package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfqc {
    static int zza(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * -862048943), 15)) * 461845907);
    }

    static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
