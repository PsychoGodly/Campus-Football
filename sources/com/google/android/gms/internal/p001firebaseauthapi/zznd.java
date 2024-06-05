package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zznd extends zzbt {
    private final zzos zza;

    public zznd(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        zza(zzos, zzcs);
        this.zza = zzos;
    }

    public final zzos zza(zzcs zzcs) throws GeneralSecurityException {
        zza(this.zza, zzcs);
        return this.zza;
    }

    public final Integer zza() {
        return this.zza.zze();
    }

    private static void zza(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        int i10 = zzng.zza[zzos.zza().ordinal()];
        if (i10 == 1 || i10 == 2) {
            zzcs.zza(zzcs);
        }
    }
}
