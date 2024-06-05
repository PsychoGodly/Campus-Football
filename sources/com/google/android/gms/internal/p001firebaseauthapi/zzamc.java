package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzamc extends RuntimeException {
    private final List<String> zza = null;

    public zzamc(zzakn zzakn) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzaji zza() {
        return new zzaji(getMessage());
    }
}
