package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahi implements zzzu {
    public static final zzaab zza = zzahh.zza;
    private final zzahj zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzem zze;
    private zzzx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzahi() {
        this(0);
    }

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        zzdl.zzb(this.zzf);
        int zza2 = zzzv.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzaaw(-9223372036854775807L, 0));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    public final void zzb(zzzx zzzx) {
        this.zzf = zzzx;
        this.zzb.zzb(zzzx, new zzaiz(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzzx.zzC();
    }

    public final void zzc(long j10, long j11) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j11;
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        int i10 = 0;
        while (true) {
            zzzk zzzk = (zzzk) zzzv;
            zzzk.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj2 = this.zzd.zzj();
            i10 += zzj2 + 10;
            zzzk.zzl(zzj2, false);
        }
        zzzv.zzj();
        zzzk zzzk2 = (zzzk) zzzv;
        zzzk2.zzl(i10, false);
        if (this.zzh == -1) {
            this.zzh = (long) i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            zzzk2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (!zzahj.zzf(this.zzd.zzo())) {
                i11++;
                zzzv.zzj();
                zzzk2.zzl(i11, false);
            } else {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                zzzk2.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzj(14);
                int zzd2 = this.zze.zzd(13);
                if (zzd2 <= 6) {
                    i11++;
                    zzzv.zzj();
                    zzzk2.zzl(i11, false);
                } else {
                    zzzk2.zzl(zzd2 - 6, false);
                    i13 += zzd2;
                }
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    public zzahi(int i10) {
        this.zzb = new zzahj(true, (String) null);
        this.zzc = new zzen(2048);
        this.zzh = -1;
        zzen zzen = new zzen(10);
        this.zzd = zzen;
        byte[] zzH = zzen.zzH();
        this.zze = new zzem(zzH, zzH.length);
    }
}
