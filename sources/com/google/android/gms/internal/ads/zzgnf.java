package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgnf implements zzfvo {
    private final zzgny zza;
    private final zzfws zzb;
    private final int zzc;

    public zzgnf(zzgny zzgny, zzfws zzfws, int i10) {
        this.zza = zzgny;
        this.zzb = zzfws;
        this.zzc = i10;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.zzc, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.zzb.zza(copyOfRange2, zzgmv.zzb(bArr2, copyOfRange, copyOf));
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzb2 = this.zza.zzb(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return zzgmv.zzb(zzb2, this.zzb.zzb(zzgmv.zzb(bArr2, zzb2, copyOf)));
    }
}
