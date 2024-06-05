package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaxs {
    private static final zzgqp zza = new zzaxq();

    public static int zza(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 1000) {
            return 0;
        }
        return AdError.NO_FILL_ERROR_CODE;
    }
}
