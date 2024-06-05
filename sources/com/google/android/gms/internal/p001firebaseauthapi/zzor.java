package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzor  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzor implements zzov {
    private final zzxt zza;
    private final zzvb zzb;

    private zzor(zzvb zzvb, zzxt zzxt) {
        this.zzb = zzvb;
        this.zza = zzxt;
    }

    public static zzor zza(zzvb zzvb) throws GeneralSecurityException {
        return new zzor(zzvb, zzpf.zza(zzvb.zzf()));
    }

    public static zzor zzb(zzvb zzvb) {
        return new zzor(zzvb, zzpf.zzb(zzvb.zzf()));
    }

    public final zzvb zza() {
        return this.zzb;
    }

    public final zzxt zzb() {
        return this.zza;
    }
}
