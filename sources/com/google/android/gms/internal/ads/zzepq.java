package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzepq {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfen zzd;
    private final zzdpi zze;

    public zzepq(Context context, Executor executor, Set set, zzfen zzfen, zzdpi zzdpi) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfen;
        this.zze = zzdpi;
    }

    public final zzfut zza(Object obj) {
        zzfec zza2 = zzfeb.zza(this.zza, 8);
        zza2.zzh();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        for (zzepn zzepn : this.zzb) {
            zzfut zzb2 = zzepn.zzb();
            zzb2.zzc(new zzepo(this, t.b().b(), zzepn), zzbzn.zzf);
            arrayList.add(zzb2);
        }
        zzfut zza3 = zzfuj.zzb(arrayList).zza(new zzepp(arrayList, obj), this.zzc);
        if (zzfep.zza()) {
            zzfem.zza(zza3, this.zzd, zza2);
        }
        return zza3;
    }

    public final void zzb(long j10, zzepn zzepn) {
        long b10 = t.b().b() - j10;
        if (((Boolean) zzbco.zza.zze()).booleanValue()) {
            String zzc2 = zzfoj.zzc(zzepn.getClass().getCanonicalName());
            n1.a("Signal runtime (ms) : " + zzc2 + " = " + b10);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzbQ)).booleanValue()) {
            zzdph zza2 = this.zze.zza();
            zza2.zzb("action", "lat_ms");
            zza2.zzb("lat_grp", "sig_lat_grp");
            zza2.zzb("lat_id", String.valueOf(zzepn.zza()));
            zza2.zzb("clat_ms", String.valueOf(b10));
            zza2.zzh();
        }
    }
}
