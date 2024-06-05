package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzgak {
    int[] zza;
    private final int zzb;

    public zzgak(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzgag.zzd(bArr);
            this.zzb = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private final void zzf(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i10 = remaining / 64;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                if (i11 < i12) {
                    ByteBuffer zzc = zzc(bArr, this.zzb + i11);
                    if (i11 == i12 - 1) {
                        zzgmv.zza(byteBuffer, byteBuffer2, zzc, remaining % 64);
                    } else {
                        zzgmv.zza(byteBuffer, byteBuffer2, zzc, 64);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            int zza2 = zza();
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza2);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int zza();

    /* access modifiers changed from: package-private */
    public abstract int[] zzb(int[] iArr, int i10);

    /* access modifiers changed from: package-private */
    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] zzb2 = zzb(zzgag.zzd(bArr), i10);
        int[] iArr = (int[]) zzb2.clone();
        zzgag.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            zzb2[i11] = zzb2[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb2, 0, 16);
        return order;
    }

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            zzf(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] zze(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zzf(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
