package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzhv extends zzhy {
    public zzhv(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    public final int zza() {
        return 12;
    }

    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.zza(byteBuffer, bArr, bArr2);
    }

    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.zza(bArr, byteBuffer);
    }

    public final int[] zza(int[] iArr, int i10) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            zzhu.zza(iArr2, this.zza);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }
}
