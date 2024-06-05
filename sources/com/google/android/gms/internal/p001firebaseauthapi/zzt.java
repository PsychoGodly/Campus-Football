package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzt extends zzp {
    private final Matcher zza;

    zzt(Matcher matcher) {
        this.zza = (Matcher) zzy.zza(matcher);
    }

    public final int zza() {
        return this.zza.end();
    }

    public final int zzb() {
        return this.zza.start();
    }

    public final boolean zzc() {
        return this.zza.matches();
    }

    public final boolean zza(int i10) {
        return this.zza.find(i10);
    }
}
