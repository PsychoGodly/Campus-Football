package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfvp {
    private final InputStream zza;

    private zzfvp(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzfvp zzb(byte[] bArr) {
        return new zzfvp(new ByteArrayInputStream(bArr));
    }

    public final zzgll zza() throws IOException {
        try {
            return zzgll.zzg(this.zza, zzgpy.zza());
        } finally {
            this.zza.close();
        }
    }
}
