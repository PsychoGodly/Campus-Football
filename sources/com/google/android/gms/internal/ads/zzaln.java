package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaln extends FilterInputStream {
    private final HttpURLConnection zza;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzaln(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.io.InputStream r0 = r2.getErrorStream()
        L_0x0009:
            r1.<init>(r0)
            r1.zza = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaln.<init>(java.net.HttpURLConnection):void");
    }

    public final void close() throws IOException {
        super.close();
        this.zza.disconnect();
    }
}
