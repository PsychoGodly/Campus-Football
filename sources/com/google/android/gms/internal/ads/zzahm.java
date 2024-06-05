package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahm implements zzahn {
    private final List zza;
    private final zzabb[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzahm(List list) {
        this.zza = list;
        this.zzb = new zzabb[list.size()];
    }

    private final boolean zzf(zzen zzen, int i10) {
        if (zzen.zza() == 0) {
            return false;
        }
        if (zzen.zzk() != i10) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    public final void zza(zzen zzen) {
        if (!this.zzc) {
            return;
        }
        if (this.zzd != 2 || zzf(zzen, 32)) {
            if (this.zzd != 1 || zzf(zzen, 0)) {
                int zzc2 = zzen.zzc();
                int zza2 = zzen.zza();
                for (zzabb zzq : this.zzb) {
                    zzen.zzF(zzc2);
                    zzq.zzq(zzen, zza2);
                }
                this.zze += zza2;
            }
        }
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzaiw zzaiw = (zzaiw) this.zza.get(i10);
            zzaiz.zzc();
            zzabb zzv = zzzx.zzv(zzaiz.zza(), 3);
            zzad zzad = new zzad();
            zzad.zzH(zzaiz.zzb());
            zzad.zzS("application/dvbsubs");
            zzad.zzI(Collections.singletonList(zzaiw.zzb));
            zzad.zzK(zzaiw.zza);
            zzv.zzk(zzad.zzY());
            this.zzb[i10] = zzv;
        }
    }

    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzabb zzs : this.zzb) {
                    zzs.zzs(this.zzf, 1, this.zze, 0, (zzaba) null);
                }
            }
            this.zzc = false;
        }
    }

    public final void zzd(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.zzc = true;
            if (j10 != -9223372036854775807L) {
                this.zzf = j10;
            }
            this.zze = 0;
            this.zzd = 2;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
