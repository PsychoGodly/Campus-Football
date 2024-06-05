package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfsr extends zzfss {
    public static int zza(long j10) {
        int i10 = (int) j10;
        if (((long) i10) == j10) {
            return i10;
        }
        throw new IllegalArgumentException(zzfoj.zzb("Out of range: %s", Long.valueOf(j10)));
    }

    public static int zzb(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int zzc(long j10) {
        return j10 > 2147483647L ? a.e.API_PRIORITY_OTHER : j10 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j10;
    }
}
