package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcce implements zzgwk {
    private final ByteBuffer zza;

    zzcce(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    public final void close() throws IOException {
    }

    public final int zza(ByteBuffer byteBuffer) throws IOException {
        if (this.zza.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.zza.remaining());
        byte[] bArr = new byte[min];
        this.zza.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long zzb() throws IOException {
        return (long) this.zza.position();
    }

    public final long zzc() throws IOException {
        return (long) this.zza.limit();
    }

    public final ByteBuffer zzd(long j10, long j11) throws IOException {
        int position = this.zza.position();
        this.zza.position((int) j10);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j11);
        this.zza.position(position);
        return slice;
    }

    public final void zze(long j10) throws IOException {
        this.zza.position((int) j10);
    }
}
