package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzmq;
import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzms  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzms implements zzmq.zza {
    private final /* synthetic */ zzop zza;
    private final /* synthetic */ zznb zzb;

    zzms(zzop zzop, zznb zznb) {
        this.zza = zzop;
        this.zzb = zznb;
    }

    public final <Q> zzbs<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzoq(this.zza, this.zzb, cls);
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
        zzop zzop = this.zza;
        return new zzoq(zzop, this.zzb, zzop.zzf());
    }
}
