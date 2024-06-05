package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzsj {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzfl zza;
    public final Uri zzb;
    public final Map zzc;

    public zzsj(long j10, zzfl zzfl, Uri uri, Map map, long j11, long j12, long j13) {
        this.zza = zzfl;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
