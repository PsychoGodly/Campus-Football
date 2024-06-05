package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrd {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[bArr.length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] zzb(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i10 = 0; i10 < 16; i10++) {
                bArr2[i10] = (byte) ((bArr[i10] << 1) & 254);
                if (i10 < 15) {
                    bArr2[i10] = (byte) (bArr2[i10] | ((byte) ((bArr[i10 + 1] >> 7) & 1)));
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
