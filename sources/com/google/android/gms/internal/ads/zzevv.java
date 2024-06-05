package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzevv implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzevv(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
    }

    /* renamed from: zza */
    public final zzevt zzb() {
        zzbyd zzbyd;
        Context context = (Context) this.zza.zzb();
        zzfaf zzfaf = (zzfaf) this.zzb.zzb();
        zzfax zzfax = (zzfax) this.zzc.zzb();
        if (((Boolean) a0.c().zzb(zzbar.zzfT)).booleanValue()) {
            zzbyd = t.q().zzh().zzh();
        } else {
            zzbyd = t.q().zzh().zzi();
        }
        boolean z10 = false;
        if (zzbyd != null && zzbyd.zzh()) {
            z10 = true;
        }
        if (((Integer) a0.c().zzb(zzbar.zzgj)).intValue() > 0) {
            if (!((Boolean) a0.c().zzb(zzbar.zzfS)).booleanValue() || z10) {
                zzfaw zza2 = zzfax.zza(zzfan.AppOpen, context, zzfaf, new zzeux(new zzeuu()));
                zzevj zzevj = new zzevj(new zzevi());
                zzfaj zzfaj = zza2.zza;
                zzfuu zzfuu = zzbzn.zza;
                return new zzeuz(zzevj, new zzevf(zzfaj, zzfuu), zza2.zzb, zza2.zza.zza().zzf, zzfuu);
            }
        }
        return new zzevi();
    }
}
