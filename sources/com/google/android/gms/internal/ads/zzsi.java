package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzsi implements zzfg {
    private final zzfg zza;
    private final int zzb;
    private final zzsh zzc;
    private final byte[] zzd;
    private int zze;

    public zzsi(zzfg zzfg, int i10, zzsh zzsh) {
        zzdl.zzd(i10 > 0);
        this.zza = zzfg;
        this.zzb = i10;
        this.zzc = zzsh;
        this.zzd = new byte[1];
        this.zze = i10;
    }

    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zze;
        if (i12 == 0) {
            int i13 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i14 = (this.zzd[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int zza2 = this.zza.zza(bArr2, i13, i15);
                        if (zza2 != -1) {
                            i13 += zza2;
                            i15 -= zza2;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.zzc.zza(new zzen(bArr2, i14));
                    }
                }
                i12 = this.zzb;
                this.zze = i12;
            }
            return -1;
        }
        int zza3 = this.zza.zza(bArr, i10, Math.min(i12, i11));
        if (zza3 != -1) {
            this.zze -= zza3;
        }
        return zza3;
    }

    public final long zzb(zzfl zzfl) {
        throw new UnsupportedOperationException();
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final void zzf(zzgi zzgi) {
        Objects.requireNonNull(zzgi);
        this.zza.zzf(zzgi);
    }
}
