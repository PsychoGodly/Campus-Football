package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzgam {
    private final zzgak zza;
    private final zzgak zzb;

    public zzgam(byte[] bArr) throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    private final byte[] zze(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.zzb.zzc(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] zzf(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i10 = length & 15;
        int i11 = i10 == 0 ? length : (length + 16) - i10;
        int remaining = byteBuffer.remaining();
        int i12 = remaining % 16;
        int i13 = (i12 == 0 ? remaining : (remaining + 16) - i12) + i11;
        ByteBuffer order = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i11);
        order.put(byteBuffer);
        order.position(i13);
        order.putLong((long) length);
        order.putLong((long) remaining);
        return order.array();
    }

    /* access modifiers changed from: package-private */
    public abstract zzgak zza(byte[] bArr, int i10) throws InvalidKeyException;

    public final void zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.zza.zzd(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] zza2 = zzgap.zza(zze(bArr), zzf(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(zza2);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] zzc(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                if (MessageDigest.isEqual(zzgap.zza(zze(bArr), zzf(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    return this.zza.zze(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length <= 2147483631) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            zzb(allocate, bArr, bArr2, bArr3);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
