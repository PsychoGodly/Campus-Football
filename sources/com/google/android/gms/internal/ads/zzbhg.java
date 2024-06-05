package com.google.android.gms.internal.ads;

import java.util.Map;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbhg implements zzbhp {
    zzbhg() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        if (zzcei.zzJ() != null) {
            zzcei.zzJ().zza();
        }
        r zzL = zzcei.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        r zzM = zzcei.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzbza.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
