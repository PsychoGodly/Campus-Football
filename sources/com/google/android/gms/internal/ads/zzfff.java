package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfff {
    private final Context zza;
    private final Executor zzb;
    private final zzbzf zzc;
    private final zzfep zzd;

    zzfff(Context context, Executor executor, zzbzf zzbzf, zzfep zzfep) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzbzf;
        this.zzd = zzfep;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzfen zzfen) {
        zzfec zza2 = zzfeb.zza(this.zza, 14);
        zza2.zzh();
        zza2.zzf(this.zzc.zza(str));
        if (zzfen == null) {
            this.zzd.zzb(zza2.zzl());
            return;
        }
        zzfen.zza(zza2);
        zzfen.zzg();
    }

    public final void zzc(String str, zzfen zzfen) {
        if (!zzfep.zza() || !((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            this.zzb.execute(new zzffd(this, str));
        } else {
            this.zzb.execute(new zzffe(this, str, zzfen));
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), (zzfen) null);
        }
    }
}
