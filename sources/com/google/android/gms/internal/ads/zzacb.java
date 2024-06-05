package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzacb extends zzacg {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzacb(zzabb zzabb) {
        super(zzabb);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzen zzen) throws zzacf {
        if (!this.zzc) {
            int zzk = zzen.zzk();
            int i10 = zzk >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzk >> 2) & 3];
                zzad zzad = new zzad();
                zzad.zzS("audio/mpeg");
                zzad.zzw(1);
                zzad.zzT(i11);
                this.zza.zzk(zzad.zzY());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                zzad zzad2 = new zzad();
                zzad2.zzS(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzad2.zzw(1);
                zzad2.zzT(8000);
                this.zza.zzk(zzad2.zzY());
                this.zzd = true;
            } else if (i10 != 10) {
                throw new zzacf("Audio format not supported: " + i10);
            }
            this.zzc = true;
        } else {
            zzen.zzG(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzen zzen, long j10) throws zzbu {
        if (this.zze == 2) {
            int zza = zzen.zza();
            this.zza.zzq(zzen, zza);
            this.zza.zzs(j10, 1, zza, 0, (zzaba) null);
            return true;
        }
        int zzk = zzen.zzk();
        if (zzk == 0 && !this.zzd) {
            int zza2 = zzen.zza();
            byte[] bArr = new byte[zza2];
            zzen.zzB(bArr, 0, zza2);
            zzyr zza3 = zzys.zza(bArr);
            zzad zzad = new zzad();
            zzad.zzS("audio/mp4a-latm");
            zzad.zzx(zza3.zzc);
            zzad.zzw(zza3.zzb);
            zzad.zzT(zza3.zza);
            zzad.zzI(Collections.singletonList(bArr));
            this.zza.zzk(zzad.zzY());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzk != 1) {
            return false;
        } else {
            int zza4 = zzen.zza();
            this.zza.zzq(zzen, zza4);
            this.zza.zzs(j10, 1, zza4, 0, (zzaba) null);
            return true;
        }
    }
}
