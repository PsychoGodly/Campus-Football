package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.dynamic.b;
import q4.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbdr implements f.a {
    private final zzber zza;

    public zzbdr(zzber zzber) {
        this.zza = zzber;
        try {
            zzber.zzm();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(b.B1(view));
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return false;
        }
    }
}
