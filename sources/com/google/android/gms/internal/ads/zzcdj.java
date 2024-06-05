package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcdj implements zzfg {
    private final zzfg zza;
    private final long zzb;
    private final zzfg zzc;
    private long zzd;
    private Uri zze;

    zzcdj(zzfg zzfg, int i10, zzfg zzfg2) {
        this.zza = zzfg;
        this.zzb = (long) i10;
        this.zzc = zzfg2;
    }

    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int zza2 = this.zza.zza(bArr, i10, (int) Math.min((long) i11, j11 - j10));
            long j12 = this.zzd + ((long) zza2);
            this.zzd = j12;
            i12 = zza2;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < this.zzb) {
            return i12;
        }
        int zza3 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + zza3;
        this.zzd += (long) zza3;
        return i13;
    }

    public final long zzb(zzfl zzfl) throws IOException {
        zzfl zzfl2;
        zzfl zzfl3 = zzfl;
        this.zze = zzfl3.zza;
        long j10 = zzfl3.zzf;
        long j11 = this.zzb;
        zzfl zzfl4 = null;
        if (j10 >= j11) {
            zzfl2 = null;
        } else {
            long j12 = zzfl3.zzg;
            zzfl2 = new zzfl(zzfl3.zza, (byte[]) null, j10, j10, j12 != -1 ? Math.min(j12, j11 - j10) : j11 - j10, (String) null, 0);
        }
        long j13 = zzfl3.zzg;
        if (j13 == -1 || zzfl3.zzf + j13 > this.zzb) {
            long max = Math.max(this.zzb, zzfl3.zzf);
            long j14 = zzfl3.zzg;
            zzfl4 = new zzfl(zzfl3.zza, (byte[]) null, max, max, j14 != -1 ? Math.min(j14, (zzfl3.zzf + j14) - this.zzb) : -1, (String) null, 0);
        }
        long j15 = 0;
        long zzb2 = zzfl2 != null ? this.zza.zzb(zzfl2) : 0;
        if (zzfl4 != null) {
            j15 = this.zzc.zzb(zzfl4);
        }
        this.zzd = zzfl3.zzf;
        if (zzb2 == -1 || j15 == -1) {
            return -1;
        }
        return zzb2 + j15;
    }

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final Map zze() {
        return zzfqn.zzd();
    }

    public final void zzf(zzgi zzgi) {
    }
}
