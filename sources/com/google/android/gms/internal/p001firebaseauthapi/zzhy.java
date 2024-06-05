package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
abstract class zzhy {
    int[] zza;
    private final int zzb;

    public zzhy(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzhu.zza(bArr);
            this.zzb = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* access modifiers changed from: package-private */
    public abstract int zza();

    /* access modifiers changed from: package-private */
    public final ByteBuffer zza(byte[] bArr, int i10) {
        int[] zza2 = zza(zzhu.zza(bArr), i10);
        int[] iArr = (int[]) zza2.clone();
        zzhu.zza(iArr);
        for (int i11 = 0; i11 < zza2.length; i11++) {
            zza2[i11] = zza2[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza2, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    public abstract int[] zza(int[] iArr, int i10);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer zza2 = zza(bArr, this.zzb + i11);
                if (i11 == i10 - 1) {
                    zzwg.zza(byteBuffer, byteBuffer2, zza2, remaining % 64);
                } else {
                    zzwg.zza(byteBuffer, byteBuffer2, zza2, 64);
                }
            }
            return;
        }
        int zza3 = zza();
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza3);
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
