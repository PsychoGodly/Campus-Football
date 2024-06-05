package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.dynamic.b;
import n4.m;
import n4.s;
import n4.y;
import p4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzauu extends a {
    m zza;
    private final zzauy zzb;
    private final String zzc;
    private final zzauv zzd = new zzauv();
    private s zze;

    public zzauu(zzauy zzauy, String str) {
        this.zzb = zzauy;
        this.zzc = str;
    }

    public final String getAdUnitId() {
        return this.zzc;
    }

    public final m getFullScreenContentCallback() {
        return this.zza;
    }

    public final s getOnPaidEventListener() {
        return this.zze;
    }

    public final y getResponseInfo() {
        p2 p2Var;
        try {
            p2Var = this.zzb.zzf();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            p2Var = null;
        }
        return y.g(p2Var);
    }

    public final void setFullScreenContentCallback(m mVar) {
        this.zza = mVar;
        this.zzd.zzg(mVar);
    }

    public final void setImmersiveMode(boolean z10) {
        try {
            this.zzb.zzg(z10);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(s sVar) {
        this.zze = sVar;
        try {
            this.zzb.zzh(new h4(sVar));
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void show(Activity activity) {
        try {
            this.zzb.zzi(b.B1(activity), this.zzd);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
