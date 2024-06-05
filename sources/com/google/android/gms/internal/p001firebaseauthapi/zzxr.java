package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzxr {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            copyOf[31] = (byte) (copyOf[31] & Ascii.DEL);
            copyOf[31] = (byte) (copyOf[31] | 64);
            zzmh.zza(jArr, copyOf, bArr2);
            return zzmm.zzc(jArr);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zza(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
