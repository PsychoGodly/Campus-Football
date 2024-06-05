package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzajc {
    private final List zza;
    private final zzabb[] zzb;

    public zzajc(List list) {
        this.zza = list;
        this.zzb = new zzabb[list.size()];
    }

    public final void zza(long j10, zzen zzen) {
        if (zzen.zza() >= 9) {
            int zze = zzen.zze();
            int zze2 = zzen.zze();
            int zzk = zzen.zzk();
            if (zze == 434 && zze2 == 1195456820 && zzk == 3) {
                zzzh.zzb(j10, zzen, this.zzb);
            }
        }
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzaiz.zzc();
            zzabb zzv = zzzx.zzv(zzaiz.zza(), 3);
            zzaf zzaf = (zzaf) this.zza.get(i10);
            String str = zzaf.zzm;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzdl.zze(z10, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzad zzad = new zzad();
            zzad.zzH(zzaiz.zzb());
            zzad.zzS(str);
            zzad.zzU(zzaf.zze);
            zzad.zzK(zzaf.zzd);
            zzad.zzu(zzaf.zzE);
            zzad.zzI(zzaf.zzo);
            zzv.zzk(zzad.zzY());
            this.zzb[i10] = zzv;
        }
    }
}
