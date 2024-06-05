package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgoe {
    private static final ThreadLocal zza = new zzgod();

    public static byte[] zza(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
