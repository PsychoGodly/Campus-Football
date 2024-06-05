package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaal {
    private final zzen zza = new zzen(10);

    public final zzbq zza(zzzv zzzv, zzadm zzadm) throws IOException {
        zzbq zzbq = null;
        int i10 = 0;
        while (true) {
            try {
                ((zzzk) zzzv).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i11 = zzj + 10;
                if (zzbq == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzzk) zzzv).zzm(bArr, 10, zzj, false);
                    zzbq = zzado.zza(bArr, i11, zzadm, new zzacp());
                } else {
                    ((zzzk) zzzv).zzl(zzj, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzzv.zzj();
        ((zzzk) zzzv).zzl(i10, false);
        return zzbq;
    }
}
