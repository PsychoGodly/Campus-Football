package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzait implements zzaim {
    final /* synthetic */ zzaiv zza;
    private final zzem zzb = new zzem(new byte[4], 4);

    public zzait(zzaiv zzaiv) {
        this.zza = zzaiv;
    }

    public final void zza(zzen zzen) {
        if (zzen.zzk() == 0 && (zzen.zzk() & 128) != 0) {
            zzen.zzG(6);
            int zza2 = zzen.zza() / 4;
            for (int i10 = 0; i10 < zza2; i10++) {
                zzen.zzA(this.zzb, 4);
                int zzd = this.zzb.zzd(16);
                this.zzb.zzl(3);
                if (zzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    if (this.zza.zzf.get(zzd2) == null) {
                        zzaiv zzaiv = this.zza;
                        zzaiv.zzf.put(zzd2, new zzain(new zzaiu(zzaiv, zzd2)));
                        zzaiv zzaiv2 = this.zza;
                        zzaiv2.zzl = zzaiv2.zzl + 1;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }

    public final void zzb(zzeu zzeu, zzzx zzzx, zzaiz zzaiz) {
    }
}
