package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzbj implements zzca {
    private final InputStream zza;

    private zzbj(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzca zza(byte[] bArr) {
        return new zzbj(new ByteArrayInputStream(bArr));
    }

    public final zzvg zzb() throws IOException {
        try {
            return zzvg.zza(this.zza, zzaio.zza());
        } finally {
            this.zza.close();
        }
    }

    public final zzua zza() throws IOException {
        try {
            return zzua.zza(this.zza, zzaio.zza());
        } finally {
            this.zza.close();
        }
    }
}
