package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import v4.a;
import v4.d;
import v4.m;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbny implements d {
    final /* synthetic */ zzbnl zza;
    final /* synthetic */ a zzb;
    final /* synthetic */ zzbof zzc;

    zzbny(zzbof zzbof, zzbnl zzbnl, a aVar) {
        this.zzc = zzbof;
        this.zza = zzbnl;
        this.zzb = aVar;
    }

    public final void onFailure(n4.a aVar) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
            int a10 = aVar.a();
            String c10 = aVar.c();
            String b10 = aVar.b();
            zzbza.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + a10 + ". ErrorMessage = " + c10 + ". ErrorDomain = " + b10);
            this.zza.zzh(aVar.d());
            this.zza.zzi(aVar.a(), aVar.c());
            this.zza.zzg(aVar.a());
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzc.zzi = (m) obj;
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
        return new zzbnw(this.zza);
    }

    public final void onFailure(String str) {
        onFailure(new n4.a(0, str, "undefined"));
    }
}
