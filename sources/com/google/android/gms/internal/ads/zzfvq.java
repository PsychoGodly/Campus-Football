package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfvq {
    private final OutputStream zza;

    private zzfvq(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzfvq zzb(OutputStream outputStream) {
        return new zzfvq(outputStream);
    }

    public final void zza(zzgll zzgll) throws IOException {
        try {
            zzgll.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
