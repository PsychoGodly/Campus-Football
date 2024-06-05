package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlh implements zzbr {
    private static final byte[] zza = new byte[0];
    private final zzuv zzb;
    private final zzlj zzc;
    private final zzlg zzd;
    private final zzld zze;

    private zzlh(zzuv zzuv, zzlj zzlj, zzlg zzlg, zzld zzld) {
        this.zzb = zzuv;
        this.zzc = zzlj;
        this.zzd = zzlg;
        this.zze = zzld;
    }

    static zzlh zza(zzuv zzuv) throws GeneralSecurityException {
        if (!zzuv.zzf().zze()) {
            zzur zzb2 = zzuv.zzb();
            return new zzlh(zzuv, zzlk.zzc(zzb2), zzlk.zzb(zzb2), zzlk.zza(zzb2));
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
