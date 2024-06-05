package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzakc implements zzakk {
    private zzakk[] zza;

    zzakc(zzakk... zzakkArr) {
        this.zza = zzakkArr;
    }

    public final zzakl zza(Class<?> cls) {
        for (zzakk zzakk : this.zza) {
            if (zzakk.zzb(cls)) {
                return zzakk.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    public final boolean zzb(Class<?> cls) {
        for (zzakk zzb : this.zza) {
            if (zzb.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
