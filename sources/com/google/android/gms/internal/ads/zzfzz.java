package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfzz implements zzfvo {
    private static final byte[] zza = new byte[0];
    private final zzgld zzb;
    private final zzfvo zzc;

    public zzfzz(zzgld zzgld, zzfvo zzfvo) {
        this.zzb = zzgld;
        this.zzc = zzfvo;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzfvo) zzfxf.zzj(this.zzb.zzg(), this.zzc.zza(bArr3, zza), zzfvo.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzax = zzfxf.zzd(this.zzb).zzax();
        byte[] zzb2 = this.zzc.zzb(zzax, zza);
        byte[] zzb3 = ((zzfvo) zzfxf.zzj(this.zzb.zzg(), zzax, zzfvo.class)).zzb(bArr, bArr2);
        int length = zzb2.length;
        return ByteBuffer.allocate(length + 4 + zzb3.length).putInt(length).put(zzb2).put(zzb3).array();
    }
}
