package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zznl {
    private static final zznl zza = new zznl();
    private final Map<Class<? extends zzch>, zzno<? extends zzch>> zzb = new HashMap();

    public static zznl zza() {
        return zza;
    }

    public final synchronized <ParametersT extends zzch> void zza(zzno<ParametersT> zzno, Class<ParametersT> cls) throws GeneralSecurityException {
        zzno zzno2 = this.zzb.get(cls);
        if (zzno2 != null) {
            if (!zzno2.equals(zzno)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
        }
        this.zzb.put(cls, zzno);
    }
}
