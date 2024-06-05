package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgoi implements zzfvo {
    private final zzgao zza;

    public zzgoi(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzgao(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.zza.zzc(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] zza2 = zzgoe.zza(24);
        allocate.put(zza2);
        this.zza.zzb(allocate, zza2, bArr, bArr2);
        return allocate.array();
    }
}
