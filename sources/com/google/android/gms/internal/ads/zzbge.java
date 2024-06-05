package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.p4;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.dynamic.a;
import o4.b;
import o4.e;
import q4.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbge extends zzbfh {
    /* access modifiers changed from: private */
    public final g zza;

    public zzbge(g gVar) {
        this.zza = gVar;
    }

    public final void zze(u0 u0Var, a aVar) {
        if (u0Var != null && aVar != null) {
            b bVar = new b((Context) com.google.android.gms.dynamic.b.A1(aVar));
            e eVar = null;
            try {
                if (u0Var.zzi() instanceof p4) {
                    p4 p4Var = (p4) u0Var.zzi();
                    bVar.setAdListener(p4Var != null ? p4Var.M0() : null);
                }
            } catch (RemoteException e10) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            }
            try {
                if (u0Var.zzj() instanceof zzatt) {
                    zzatt zzatt = (zzatt) u0Var.zzj();
                    if (zzatt != null) {
                        eVar = zzatt.zzb();
                    }
                    bVar.setAppEventListener(eVar);
                }
            } catch (RemoteException e11) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
            }
            zzbyt.zza.post(new zzbgd(this, bVar, u0Var));
        }
    }
}
