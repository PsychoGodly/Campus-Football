package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwq implements zzbg {
    private final zzxi zza;
    private final zzce zzb;
    private final int zzc;

    public zzwq(zzxi zzxi, zzce zzce, int i10) {
        this.zza = zzxi;
        this.zzb = zzce;
        this.zzc = i10;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.zzb.zza(copyOfRange2, zzwg.zza(bArr2, copyOfRange, copyOf));
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzb2 = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return zzwg.zza(zzb2, this.zzb.zza(zzwg.zza(bArr2, zzb2, copyOf)));
    }
}
