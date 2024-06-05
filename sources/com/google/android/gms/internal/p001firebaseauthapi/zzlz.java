package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlz implements zzll {
    private final zzxt zza;
    private final zzxt zzb;

    private zzlz(byte[] bArr, byte[] bArr2) {
        this.zza = zzxt.zza(bArr);
        this.zzb = zzxt.zza(bArr2);
    }

    static zzlz zza(byte[] bArr) throws GeneralSecurityException {
        return new zzlz(bArr, zzxr.zza(bArr));
    }

    public final zzxt zzb() {
        return this.zzb;
    }

    public final zzxt zza() {
        return this.zza;
    }
}
