package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzqk extends zzoh<zzce, zzuc> {
    zzqk(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zza(zzakn zzakn) throws GeneralSecurityException {
        zzuc zzuc = (zzuc) zzakn;
        zzub zzb = zzuc.zze().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzuc.zzf().zzg(), "HMAC");
        int zza = zzuc.zze().zza();
        int i10 = zzqm.zza[zzb.ordinal()];
        if (i10 == 1) {
            return new zzxm(new zzxk("HMACSHA1", secretKeySpec), zza);
        }
        if (i10 == 2) {
            return new zzxm(new zzxk("HMACSHA224", secretKeySpec), zza);
        }
        if (i10 == 3) {
            return new zzxm(new zzxk("HMACSHA256", secretKeySpec), zza);
        }
        if (i10 == 4) {
            return new zzxm(new zzxk("HMACSHA384", secretKeySpec), zza);
        }
        if (i10 == 5) {
            return new zzxm(new zzxk("HMACSHA512", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
