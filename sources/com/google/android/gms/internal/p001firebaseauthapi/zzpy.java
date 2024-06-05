package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzpy implements zzcp<zzpz, zzpz> {
    private static final zzpy zza = new zzpy();

    private zzpy() {
    }

    static void zzc() throws GeneralSecurityException {
        zzct.zza(zza);
    }

    public final Class<zzpz> zza() {
        return zzpz.class;
    }

    public final Class<zzpz> zzb() {
        return zzpz.class;
    }

    public final /* synthetic */ Object zza(zzcg zzcg) throws GeneralSecurityException {
        if (zzcg == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        } else if (zzcg.zza() != null) {
            for (List<zzcl> it : zzcg.zzd()) {
                for (zzcl zze : it) {
                    zzpz zzpz = (zzpz) zze.zze();
                }
            }
            return new zzqb(zzcg);
        } else {
            throw new GeneralSecurityException("no primary in primitive set");
        }
    }
}
