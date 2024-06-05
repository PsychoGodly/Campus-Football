package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.common.api.a;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzbe {
    private static final byte[] zza = {19, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 17, 17, 17, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.VT, Ascii.VT, Ascii.VT, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    private static final long[] zzb = {1, 10, 100, 1000, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    private static final long[] zzc = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    private static final long[] zzd = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    private static final int[] zze = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    private static final int[] zzf = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] zzg = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long zza(long j10, long j11) {
        long j12 = j10 + j11;
        boolean z10 = true;
        boolean z11 = (j10 ^ j11) < 0;
        if ((j10 ^ j12) < 0) {
            z10 = false;
        }
        zzbh.zza(z11 | z10, "checkedAdd", j10, j11);
        return j12;
    }

    public static long zzb(long j10, long j11) {
        long j12 = j10 - 1;
        boolean z10 = true;
        boolean z11 = (1 ^ j10) >= 0;
        if ((j10 ^ j12) < 0) {
            z10 = false;
        }
        zzbh.zza(z11 | z10, "checkedSubtract", j10, 1);
        return j12;
    }
}
