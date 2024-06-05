package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzals extends ByteArrayOutputStream {
    private final zzalf zza;

    public zzals(zzalf zzalf, int i10) {
        this.zza = zzalf;
        this.buf = zzalf.zzb(Math.max(i10, 256));
    }

    private final void zza(int i10) {
        int i11 = this.count;
        if (i11 + i10 > this.buf.length) {
            int i12 = i11 + i10;
            byte[] zzb = this.zza.zzb(i12 + i12);
            System.arraycopy(this.buf, 0, zzb, 0, this.count);
            this.zza.zza(this.buf);
            this.buf = zzb;
        }
    }

    public final void close() throws IOException {
        this.zza.zza(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(this.buf);
    }

    public final synchronized void write(int i10) {
        zza(1);
        super.write(i10);
    }

    public final synchronized void write(byte[] bArr, int i10, int i11) {
        zza(i11);
        super.write(bArr, i10, i11);
    }
}
