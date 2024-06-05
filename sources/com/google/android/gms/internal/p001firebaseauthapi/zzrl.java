package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrl implements zzce {
    private static final byte[] zza = {0};
    private final zzce zzb;
    private final zzvs zzc;
    private final byte[] zzd;

    private zzrl(zzce zzce, zzvs zzvs, byte[] bArr) {
        this.zzb = zzce;
        this.zzc = zzvs;
        this.zzd = bArr;
    }

    public static zzce zza(zznd zznd) throws GeneralSecurityException {
        byte[] bArr;
        zzos zza2 = zznd.zza(zzbq.zza());
        zzce zzce = (zzce) zzow.zza().zza((zzuy) ((zzajc) zzuy.zza().zza(zza2.zzf()).zza(zza2.zzd()).zza(zza2.zza()).zzf()), zzce.class);
        zzvs zzc2 = zza2.zzc();
        int i10 = zzrk.zza[zzc2.ordinal()];
        if (i10 == 1) {
            bArr = new byte[0];
        } else if (i10 == 2 || i10 == 3) {
            bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zznd.zza().intValue()).array();
        } else if (i10 == 4) {
            bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zznd.zza().intValue()).array();
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return new zzrl(zzce, zzc2, bArr);
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 10) {
            if (this.zzc.equals(zzvs.LEGACY)) {
                bArr2 = zzwg.zza(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzvs.RAW)) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
                bArr3 = copyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzvs.LEGACY)) {
            bArr = zzwg.zza(bArr, zza);
        }
        return zzwg.zza(this.zzd, this.zzb.zza(bArr));
    }
}
