package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzmq;
import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzmt implements zzmq.zza {
    private final /* synthetic */ zznb zza;

    zzmt(zznb zznb) {
        this.zza = zznb;
    }

    public final <Q> zzbs<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzmo(this.zza, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final Class<?> zzb() {
        return this.zza.getClass();
    }

    public final Set<Class<?>> zzc() {
        return this.zza.zzh();
    }

    public final zzbs<?> zza() {
        zznb zznb = this.zza;
        return new zzmo(zznb, zznb.zzf());
    }
}
