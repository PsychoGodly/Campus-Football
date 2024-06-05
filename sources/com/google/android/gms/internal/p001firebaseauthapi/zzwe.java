package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwe implements zzbg {
    private static final zzif.zza zza = zzif.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final zzht zzb;
    private final byte[] zzc;

    public zzwe(byte[] bArr) throws GeneralSecurityException {
        this(bArr, zzxt.zza(new byte[0]));
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        if (bArr3.length == 0) {
            return this.zzb.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
        } else if (zzpf.zza(bArr3, bArr)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzc.length, bArr.length);
            return this.zzb.zza(Arrays.copyOf(copyOfRange, 12), copyOfRange, bArr2);
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzou.zza(12);
        byte[] bArr3 = this.zzc;
        if (bArr3.length == 0) {
            return this.zzb.zzb(zza2, bArr, bArr2);
        }
        return zzwg.zza(bArr3, this.zzb.zzb(zza2, bArr, bArr2));
    }

    private zzwe(byte[] bArr, zzxt zzxt) throws GeneralSecurityException {
        if (zza.zza()) {
            this.zzb = new zzht(bArr, true);
            this.zzc = zzxt.zzb();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
