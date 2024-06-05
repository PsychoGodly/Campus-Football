package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzbu {
    private final zzvb zza = null;
    private final zzch zzb;

    private zzbu(zzch zzch) {
        this.zzb = zzch;
    }

    public static zzbu zza(zzch zzch) throws GeneralSecurityException {
        return new zzbu(zzch);
    }

    /* access modifiers changed from: package-private */
    public final zzvb zza() throws GeneralSecurityException {
        zzch zzch = this.zzb;
        if (zzch instanceof zznf) {
            return ((zznf) zzch).zzb().zza();
        }
        return ((zzor) zznu.zza().zza(this.zzb, zzor.class)).zza();
    }
}
