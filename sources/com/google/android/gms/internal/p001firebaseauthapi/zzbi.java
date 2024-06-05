package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzbi implements zzcd {
    private final OutputStream zza;

    private zzbi(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzcd zza(OutputStream outputStream) {
        return new zzbi(outputStream);
    }

    public final void zza(zzua zzua) throws IOException {
        try {
            zzua.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    public final void zza(zzvg zzvg) throws IOException {
        try {
            zzvg.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
