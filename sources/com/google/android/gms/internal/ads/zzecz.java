package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import n4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzecz implements zzdee {
    private final zzeyc zza;
    private final zzbpc zzb;
    private final b zzc;
    private zzcvg zzd = null;

    zzecz(zzeyc zzeyc, zzbpc zzbpc, b bVar) {
        this.zza = zzeyc;
        this.zzb = zzbpc;
        this.zzc = bVar;
    }

    public final void zza(boolean z10, Context context, zzcvb zzcvb) throws zzded {
        boolean z11;
        try {
            b bVar = b.f20900a;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                z11 = this.zzb.zzs(com.google.android.gms.dynamic.b.B1(context));
            } else if (ordinal != 2) {
                if (ordinal == 6) {
                    z11 = this.zzb.zzr(com.google.android.gms.dynamic.b.B1(context));
                }
                throw new zzded("Adapter failed to show.");
            } else {
                z11 = this.zzb.zzt(com.google.android.gms.dynamic.b.B1(context));
            }
            if (z11) {
                if (this.zzd != null) {
                    if (!((Boolean) a0.c().zzb(zzbar.zzbp)).booleanValue() && this.zza.zzZ == 2) {
                        this.zzd.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzded("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzded(th);
        }
    }

    public final void zzb(zzcvg zzcvg) {
        this.zzd = zzcvg;
    }
}
