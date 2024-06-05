package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwg {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] zza(byte[]... bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte[] bArr2 = bArr[i10];
            if (i11 <= a.e.API_PRIORITY_OTHER - bArr2.length) {
                i11 += bArr2.length;
                i10++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i11];
        int i12 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
            i12 += bArr4.length;
        }
        return bArr3;
    }

    public static final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return zza(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zza(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i12 < 0 || bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }
}
