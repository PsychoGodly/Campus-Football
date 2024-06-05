package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import n4.a;
import v4.d;
import v4.s;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbod implements d {
    final /* synthetic */ zzbnl zza;
    final /* synthetic */ zzbof zzb;

    zzbod(zzbof zzbof, zzbnl zzbnl) {
        this.zzb = zzbof;
        this.zza = zzbnl;
    }

    public final void onFailure(a aVar) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
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
            this.zzb.zzh = (s) obj;
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
        return new zzbvm(this.zza);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            zzbza.zze(canonicalName + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }
}
