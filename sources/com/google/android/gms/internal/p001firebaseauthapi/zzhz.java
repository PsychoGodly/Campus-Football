package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzhz extends zzhy {
    public zzhz(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return 24;
    }

    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.zza(byteBuffer, bArr, bArr2);
    }

    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.zza(bArr, byteBuffer);
    }

    /* access modifiers changed from: package-private */
    public final int[] zza(int[] iArr, int i10) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            zzhu.zza(iArr3, this.zza);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            zzhu.zza(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            zzhu.zza(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }
}
