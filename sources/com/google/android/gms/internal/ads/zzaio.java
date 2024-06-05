package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaio {
    private final List zza;
    private final zzabb[] zzb;

    public zzaio(List list) {
        this.zza = list;
        this.zzb = new zzabb[list.size()];
    }

    public final void zza(long j10, zzen zzen) {
        zzzh.zza(j10, zzen, this.zzb);
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
            String str2 = zzaf.zzb;
            if (str2 == null) {
                str2 = zzaiz.zzb();
            }
            zzad zzad = new zzad();
            zzad.zzH(str2);
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
