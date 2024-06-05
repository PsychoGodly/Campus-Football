package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgtz implements zzgqq {
    static final zzgqq zza = new zzgtz();

    private zzgtz() {
    }

    public final boolean zza(int i10) {
        if (!(i10 == 0 || i10 == 1 || i10 == 2 || i10 == 1999)) {
            switch (i10) {
                case 1000:
                case AdError.NO_FILL_ERROR_CODE:
                case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
