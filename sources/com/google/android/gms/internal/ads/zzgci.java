package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgci {
    public static byte[] zza(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }
}
