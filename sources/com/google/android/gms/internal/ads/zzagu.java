package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzagu extends zzagy {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzagu() {
    }

    public static boolean zzd(zzen zzen) {
        return zzk(zzen, zza);
    }

    private static boolean zzk(zzen zzen, byte[] bArr) {
        if (zzen.zza() < 8) {
            return false;
        }
        int zzc2 = zzen.zzc();
        byte[] bArr2 = new byte[8];
        zzen.zzB(bArr2, 0, 8);
        zzen.zzF(zzc2);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public final long zza(zzen zzen) {
        return zzg(zzaas.zzb(zzen.zzH()));
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(zzen zzen, long j10, zzagv zzagv) throws zzbu {
        if (zzk(zzen, zza)) {
            byte[] copyOf = Arrays.copyOf(zzen.zzH(), zzen.zzd());
            byte b10 = copyOf[9] & 255;
            List zzc2 = zzaas.zzc(copyOf);
            if (zzagv.zza != null) {
                return true;
            }
            zzad zzad = new zzad();
            zzad.zzS("audio/opus");
            zzad.zzw(b10);
            zzad.zzT(48000);
            zzad.zzI(zzc2);
            zzagv.zza = zzad.zzY();
            return true;
        } else if (zzk(zzen, zzb)) {
            zzdl.zzb(zzagv.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzen.zzG(8);
            zzbq zzb2 = zzabh.zzb(zzfqk.zzn(zzabh.zzc(zzen, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzad zzb3 = zzagv.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzagv.zza.zzk));
            zzagv.zza = zzb3.zzY();
            return true;
        } else {
            zzdl.zzb(zzagv.zza);
            return false;
        }
    }
}
