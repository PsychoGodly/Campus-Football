package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajm implements zzajn {
    private final ByteBuffer zza;

    public zzajm(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    public final long zza() {
        return (long) this.zza.capacity();
    }

    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i11 = (int) j10;
            this.zza.position(i11);
            this.zza.limit(i11 + i10);
            slice = this.zza.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
