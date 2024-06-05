package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class b4 extends o1 {

    /* renamed from: a  reason: collision with root package name */
    private zzbjs f14421a;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbjs zzbjs = this.f14421a;
        if (zzbjs != null) {
            try {
                zzbjs.zzb(Collections.emptyList());
            } catch (RemoteException e10) {
                zzbza.zzk("Could not notify onComplete event.", e10);
            }
        }
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }

    public final String zzf() {
        return MaxReward.DEFAULT_LABEL;
    }

    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zzh(String str) throws RemoteException {
    }

    public final void zzi() {
    }

    public final void zzj(boolean z10) throws RemoteException {
    }

    public final void zzk() throws RemoteException {
        zzbza.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzbyt.zza.post(new a4(this));
    }

    public final void zzl(String str, a aVar) throws RemoteException {
    }

    public final void zzm(c2 c2Var) {
    }

    public final void zzn(a aVar, String str) throws RemoteException {
    }

    public final void zzo(zzbnf zzbnf) throws RemoteException {
    }

    public final void zzp(boolean z10) throws RemoteException {
    }

    public final void zzq(float f10) throws RemoteException {
    }

    public final void zzr(String str) throws RemoteException {
    }

    public final void zzs(zzbjs zzbjs) throws RemoteException {
        this.f14421a = zzbjs;
    }

    public final void zzt(String str) {
    }

    public final void zzu(i4 i4Var) throws RemoteException {
    }

    public final boolean zzv() throws RemoteException {
        return false;
    }
}
