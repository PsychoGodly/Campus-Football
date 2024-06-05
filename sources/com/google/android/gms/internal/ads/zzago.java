package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzago extends zzagy {
    private zzaah zza;
    private zzagn zzb;

    zzago() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long zza(zzen zzen) {
        if (!zzd(zzen.zzH())) {
            return -1;
        }
        int i10 = (zzen.zzH()[2] & 255) >> 4;
        if (i10 != 6) {
            if (i10 == 7) {
                i10 = 7;
            }
            int zza2 = zzaad.zza(zzen, i10);
            zzen.zzF(0);
            return (long) zza2;
        }
        zzen.zzG(4);
        zzen.zzu();
        int zza22 = zzaad.zza(zzen, i10);
        zzen.zzF(0);
        return (long) zza22;
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(zzen zzen, long j10, zzagv zzagv) {
        byte[] zzH = zzen.zzH();
        zzaah zzaah = this.zza;
        if (zzaah == null) {
            zzaah zzaah2 = new zzaah(zzH, 17);
            this.zza = zzaah2;
            zzagv.zza = zzaah2.zzc(Arrays.copyOfRange(zzH, 9, zzen.zzd()), (zzbq) null);
            return true;
        } else if ((zzH[0] & Ascii.DEL) == 3) {
            zzaag zzb2 = zzaae.zzb(zzen);
            zzaah zzf = zzaah.zzf(zzb2);
            this.zza = zzf;
            this.zzb = new zzagn(zzf, zzb2);
            return true;
        } else if (!zzd(zzH)) {
            return true;
        } else {
            zzagn zzagn = this.zzb;
            if (zzagn != null) {
                zzagn.zza(j10);
                zzagv.zzb = this.zzb;
            }
            Objects.requireNonNull(zzagv.zza);
            return false;
        }
    }
}
