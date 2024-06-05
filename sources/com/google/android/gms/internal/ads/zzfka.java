package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzfka implements Closeable {
    public static zzfkm zza() {
        return new zzfkm();
    }

    public static zzfkm zzb(int i10, zzfkl zzfkl) {
        return new zzfkm(new zzfjy(i10), zzfjz.zza, zzfkl);
    }

    public static zzfkm zzc(zzfok<Integer> zzfok, zzfok<Integer> zzfok2, zzfkl zzfkl) {
        return new zzfkm(zzfok, zzfok2, zzfkl);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
