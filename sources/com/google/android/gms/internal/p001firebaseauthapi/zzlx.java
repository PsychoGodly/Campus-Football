package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlx implements zzll {
    private final zzxt zza;
    private final zzxt zzb;

    private zzlx(byte[] bArr, byte[] bArr2) {
        this.zza = zzxt.zza(bArr);
        this.zzb = zzxt.zza(bArr2);
    }

    static zzlx zza(byte[] bArr, byte[] bArr2, zzwo zzwo) throws GeneralSecurityException {
        zzwp.zza(zzwp.zza(zzwo, zzwr.UNCOMPRESSED, bArr2), zzwp.zza(zzwo, bArr));
        return new zzlx(bArr, bArr2);
    }

    public final zzxt zzb() {
        return this.zzb;
    }

    public final zzxt zza() {
        return this.zza;
    }
}
