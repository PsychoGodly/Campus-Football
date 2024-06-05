package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgch {
    private final zzfvo zza;
    private final zzfvu zzb;

    public zzgch(zzfvo zzfvo) {
        this.zza = zzfvo;
        this.zzb = null;
    }

    public zzgch(zzfvu zzfvu) {
        this.zza = null;
        this.zzb = zzfvu;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfvo zzfvo = this.zza;
        if (zzfvo != null) {
            return zzfvo.zzb(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
