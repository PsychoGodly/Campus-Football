package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.b0;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.q4;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.b;
import n4.a;
import n4.m;
import n4.n;
import n4.s;
import n4.y;
import o4.c;
import o4.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbkh extends c {
    private final Context zza;
    private final y4 zzb = y4.f14626a;
    private final u0 zzc;
    private final String zzd;
    private final zzbnc zze;
    private e zzf;
    private m zzg;
    private s zzh;

    public zzbkh(Context context, String str) {
        zzbnc zzbnc = new zzbnc();
        this.zze = zzbnc;
        this.zza = context;
        this.zzd = str;
        this.zzc = x.a().e(context, new z4(), str, zzbnc);
    }

    public final String getAdUnitId() {
        return this.zzd;
    }

    public final e getAppEventListener() {
        return this.zzf;
    }

    public final m getFullScreenContentCallback() {
        return this.zzg;
    }

    public final s getOnPaidEventListener() {
        return this.zzh;
    }

    public final y getResponseInfo() {
        p2 p2Var = null;
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                p2Var = u0Var.zzk();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        return y.g(p2Var);
    }

    public final void setAppEventListener(e eVar) {
        try {
            this.zzf = eVar;
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzG(eVar != null ? new zzatt(eVar) : null);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setFullScreenContentCallback(m mVar) {
        try {
            this.zzg = mVar;
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzJ(new b0(mVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setImmersiveMode(boolean z10) {
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzL(z10);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(s sVar) {
        try {
            this.zzh = sVar;
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzP(new h4(sVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void show(Activity activity) {
        if (activity == null) {
            zzbza.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzW(b.B1(activity));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(z2 z2Var, n4.e eVar) {
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzy(this.zzb.a(this.zza, z2Var), new q4(eVar, this));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            eVar.onAdFailedToLoad(new n(0, "Internal Error.", MobileAds.ERROR_DOMAIN, (a) null, (y) null));
        }
    }
}
