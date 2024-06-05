package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.nativead.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqh extends b.a {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbqh(zzbdp zzbdp) {
        try {
            this.zzb = zzbdp.zzg();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            this.zzb = MaxReward.DEFAULT_LABEL;
        }
        try {
            for (Object next : zzbdp.zzh()) {
                zzbdx zzg = next instanceof IBinder ? zzbdw.zzg((IBinder) next) : null;
                if (zzg != null) {
                    this.zza.add(new zzbqj(zzg));
                }
            }
        } catch (RemoteException e11) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
        }
    }

    public final List<b.C0153b> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
