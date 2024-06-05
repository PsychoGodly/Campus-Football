package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeus implements zzftq {
    public final /* synthetic */ zzeuu zza;
    public final /* synthetic */ zzfas zzb;
    public final /* synthetic */ zzcrt zzc;

    public /* synthetic */ zzeus(zzeuu zzeuu, zzfas zzfas, zzcrt zzcrt) {
        this.zza = zzeuu;
        this.zzb = zzfas;
        this.zzc = zzcrt;
    }

    public final zzfut zza(Object obj) {
        zzfas zzfas = this.zzb;
        zzcrt zzcrt = this.zzc;
        zzeyo zzeyo = (zzeyo) obj;
        zzfas.zzb = zzeyo;
        Iterator it = zzeyo.zzb.zza.iterator();
        boolean z10 = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzeyc) it.next()).zza.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z10 = true;
                    }
                }
            } else if (z10) {
                return zzcrt.zzi(zzfuj.zzh(zzeyo));
            }
        }
        return zzfuj.zzh((Object) null);
    }
}
