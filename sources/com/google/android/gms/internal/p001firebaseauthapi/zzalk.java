package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzalk extends zzals {
    private final /* synthetic */ zzalg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzalk(zzalg zzalg) {
        super(zzalg);
        this.zza = zzalg;
    }

    public final Iterator iterator() {
        return new zzali(this.zza);
    }
}
