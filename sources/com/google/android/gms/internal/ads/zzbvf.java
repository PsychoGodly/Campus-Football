package com.google.android.gms.internal.ads;

import a5.a;
import a5.b;
import a5.c;
import a5.d;
import a5.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.g4;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import n4.m;
import n4.s;
import n4.t;
import n4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvf extends c {
    private final String zza;
    private final zzbuw zzb;
    private final Context zzc;
    private final zzbvo zzd = new zzbvo();
    private a zze;
    private s zzf;
    private m zzg;

    public zzbvf(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = x.a().o(context, str, new zzbnc());
    }

    public final Bundle getAdMetadata() {
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                return zzbuw.zzb();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final m getFullScreenContentCallback() {
        return this.zzg;
    }

    public final a getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final s getOnPaidEventListener() {
        return this.zzf;
    }

    public final y getResponseInfo() {
        p2 p2Var = null;
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                p2Var = zzbuw.zzc();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        return y.g(p2Var);
    }

    public final b getRewardItem() {
        try {
            zzbuw zzbuw = this.zzb;
            zzbut zzd2 = zzbuw != null ? zzbuw.zzd() : null;
            if (zzd2 == null) {
                return b.f422a;
            }
            return new zzbvg(zzd2);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            return b.f422a;
        }
    }

    public final void setFullScreenContentCallback(m mVar) {
        this.zzg = mVar;
        this.zzd.zzb(mVar);
    }

    public final void setImmersiveMode(boolean z10) {
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzh(z10);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnAdMetadataChangedListener(a aVar) {
        try {
            this.zze = aVar;
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzi(new g4(aVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(s sVar) {
        try {
            this.zzf = sVar;
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzj(new h4(sVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setServerSideVerificationOptions(e eVar) {
        if (eVar != null) {
            try {
                zzbuw zzbuw = this.zzb;
                if (zzbuw != null) {
                    zzbuw.zzl(new zzbvk(eVar));
                }
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void show(Activity activity, t tVar) {
        this.zzd.zzc(tVar);
        if (activity == null) {
            zzbza.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzk(this.zzd);
                this.zzb.zzm(com.google.android.gms.dynamic.b.B1(activity));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(z2 z2Var, d dVar) {
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzf(y4.f14626a.a(this.zzc, z2Var), new zzbvj(dVar, this));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
