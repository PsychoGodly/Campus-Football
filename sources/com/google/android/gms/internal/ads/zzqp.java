package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzqp {
    private long zza;
    private long zzb;
    private boolean zzc;

    zzqp() {
    }

    private final long zzd(long j10) {
        return this.zza + Math.max(0, ((this.zzb - 529) * 1000000) / j10);
    }

    public final long zza(zzaf zzaf) {
        return zzd((long) zzaf.zzA);
    }

    public final long zzb(zzaf zzaf, zzgr zzgr) {
        if (this.zzb == 0) {
            this.zza = zzgr.zzd;
        }
        if (this.zzc) {
            return zzgr.zzd;
        }
        ByteBuffer byteBuffer = zzgr.zzb;
        Objects.requireNonNull(byteBuffer);
        byte b10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            b10 = (b10 << 8) | (byteBuffer.get(i10) & 255);
        }
        int zzc2 = zzaao.zzc(b10);
        if (zzc2 == -1) {
            this.zzc = true;
            this.zzb = 0;
            this.zza = zzgr.zzd;
            zzee.zze("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return zzgr.zzd;
        }
        long zzd = zzd((long) zzaf.zzA);
        this.zzb += (long) zzc2;
        return zzd;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = false;
    }
}
