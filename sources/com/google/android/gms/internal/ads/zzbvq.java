package com.google.android.gms.internal.ads;

import a5.b;
import a5.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b5.a;
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
public final class zzbvq extends a {
    private final String zza;
    private final zzbuw zzb;
    private final Context zzc;
    private final zzbvo zzd = new zzbvo();
    private m zze;
    private a5.a zzf;
    private s zzg;

    public zzbvq(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
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
        return this.zze;
    }

    public final a5.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final s getOnPaidEventListener() {
        return this.zzg;
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
            if (zzd2 != null) {
                return new zzbvg(zzd2);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        return b.f422a;
    }

    public final void setFullScreenContentCallback(m mVar) {
        this.zze = mVar;
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

    public final void setOnAdMetadataChangedListener(a5.a aVar) {
        this.zzf = aVar;
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzi(new g4(aVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(s sVar) {
        this.zzg = sVar;
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzj(new h4(sVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setServerSideVerificationOptions(e eVar) {
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzl(new zzbvk(eVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void show(Activity activity, t tVar) {
        this.zzd.zzc(tVar);
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

    public final void zza(z2 z2Var, b5.b bVar) {
        try {
            zzbuw zzbuw = this.zzb;
            if (zzbuw != null) {
                zzbuw.zzg(y4.f14626a.a(this.zzc, z2Var), new zzbvp(bVar, this));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
