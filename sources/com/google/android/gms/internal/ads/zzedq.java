package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.w0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzedq implements zzeba {
    private final Context zza;
    private final zzdes zzb;
    private final Executor zzc;

    public zzedq(Context context, zzdes zzdes, Executor executor) {
        this.zza = context;
        this.zzb = zzdes;
        this.zzc = executor;
    }

    private static final boolean zzc(zzeyo zzeyo, int i10) {
        return zzeyo.zza.zza.zzg.contains(Integer.toString(i10));
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzdgi zzdgi;
        zzbnq zzD = ((zzezs) zzeaw.zzb).zzD();
        zzbnr zzE = ((zzezs) zzeaw.zzb).zzE();
        zzbnu zzd = ((zzezs) zzeaw.zzb).zzd();
        if (zzd != null && zzc(zzeyo, 6)) {
            zzdgi = zzdgi.zzs(zzd);
        } else if (zzD != null && zzc(zzeyo, 6)) {
            zzdgi = zzdgi.zzaf(zzD);
        } else if (zzD != null && zzc(zzeyo, 2)) {
            zzdgi = zzdgi.zzad(zzD);
        } else if (zzE != null && zzc(zzeyo, 6)) {
            zzdgi = zzdgi.zzag(zzE);
        } else if (zzE == null || !zzc(zzeyo, 1)) {
            throw new zzeek(1, "No native ad mappers");
        } else {
            zzdgi = zzdgi.zzae(zzE);
        }
        if (zzeyo.zza.zza.zzg.contains(Integer.toString(zzdgi.zzc()))) {
            zzdgk zze = this.zzb.zze(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdgu(zzdgi), new zzdij(zzE, zzD, zzd, (byte[]) null));
            ((zzecq) zzeaw.zzc).zzc(zze.zzj());
            zze.zzd().zzm(new zzcmm((zzezs) zzeaw.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeek(1, "No corresponding native ad listener");
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        zzeyx zzeyx = zzeyo.zza.zza;
        ((zzezs) zzeaw.zzb).zzp(this.zza, zzeyo.zza.zza.zzd, zzeyc.zzw.toString(), w0.l(zzeyc.zzt), (zzbnl) zzeaw.zzc, zzeyx.zzi, zzeyx.zzg);
    }
}
