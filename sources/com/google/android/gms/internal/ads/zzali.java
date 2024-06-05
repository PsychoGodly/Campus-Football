package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzali extends FilterInputStream {
    private final long zza;
    private long zzb;

    zzali(InputStream inputStream, long j10) {
        super(inputStream);
        this.zza = j10;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    /* access modifiers changed from: package-private */
    public final long zza() {
        return this.zza - this.zzb;
    }

    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.zzb += (long) read;
        }
        return read;
    }
}
