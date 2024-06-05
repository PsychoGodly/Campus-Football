package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzkc implements zztc, zzpu {
    final /* synthetic */ zzkg zza;
    private final zzke zzb;

    public zzkc(zzkg zzkg, zzke zzke) {
        this.zza = zzkg;
        this.zzb = zzke;
    }

    private final Pair zzf(int i10, zzss zzss) {
        zzss zzss2;
        zzss zzss3 = null;
        if (zzss != null) {
            zzke zzke = this.zzb;
            int i11 = 0;
            while (true) {
                if (i11 >= zzke.zzc.size()) {
                    zzss2 = null;
                    break;
                } else if (((zzss) zzke.zzc.get(i11)).zzd == zzss.zzd) {
                    zzss2 = zzss.zzc(Pair.create(zzke.zzb, zzss.zza));
                    break;
                } else {
                    i11++;
                }
            }
            if (zzss2 == null) {
                return null;
            }
            zzss3 = zzss2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzss3);
    }

    public final void zzaf(int i10, zzss zzss, zzso zzso) {
        Pair zzf = zzf(0, zzss);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzka(this, zzf, zzso));
        }
    }

    public final void zzag(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        Pair zzf = zzf(0, zzss);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzjz(this, zzf, zzsj, zzso));
        }
    }

    public final void zzah(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        Pair zzf = zzf(0, zzss);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzjy(this, zzf, zzsj, zzso));
        }
    }

    public final void zzai(int i10, zzss zzss, zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
        Pair zzf = zzf(0, zzss);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzjx(this, zzf, zzsj, zzso, iOException, z10));
        }
    }

    public final void zzaj(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        Pair zzf = zzf(0, zzss);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzkb(this, zzf, zzsj, zzso));
        }
    }
}
