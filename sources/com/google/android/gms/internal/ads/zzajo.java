package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajo implements zzajn {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzajo(FileChannel fileChannel, long j10, long j11) {
        this.zza = fileChannel;
        this.zzb = j10;
        this.zzc = j11;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j10, (long) i10);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }
}
