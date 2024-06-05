package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzu extends zzs implements Serializable {
    private final Pattern zza;

    zzu(Pattern pattern) {
        this.zza = (Pattern) zzy.zza(pattern);
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final zzp zza(CharSequence charSequence) {
        return new zzt(this.zza.matcher(charSequence));
    }
}
