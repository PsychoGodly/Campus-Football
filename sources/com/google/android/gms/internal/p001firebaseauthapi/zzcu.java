package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcu {
    public static zzch zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzvb zza = zzvb.zza(bArr, zzaio.zza());
            zznu zza2 = zznu.zza();
            zzor zza3 = zzor.zza(zza);
            if (!zza2.zzb(zza3)) {
                return new zznf(zza3);
            }
            return zza2.zza(zza3);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zza(zzch zzch) throws GeneralSecurityException {
        if (zzch instanceof zznf) {
            return ((zznf) zzch).zzb().zza().zzj();
        }
        return ((zzor) zznu.zza().zza(zzch, zzor.class)).zza().zzj();
    }
}
