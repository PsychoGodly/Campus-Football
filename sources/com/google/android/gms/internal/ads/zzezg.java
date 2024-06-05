package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezg {
    private final zzeyc zza;
    private final zzeyf zzb;
    private final zzeaf zzc;
    private final zzfff zzd;
    private final zzfen zze;

    public zzezg(zzeaf zzeaf, zzfff zzfff, zzeyc zzeyc, zzeyf zzeyf, zzfen zzfen) {
        this.zza = zzeyc;
        this.zzb = zzeyf;
        this.zzc = zzeaf;
        this.zzd = zzfff;
        this.zze = zzfen;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzeah(t.b().a(), this.zzb.zzb, str, i10));
    }

    public final void zzc(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i10);
        }
    }
}
