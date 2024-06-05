package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class w3 extends m0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x3 f14596a;

    /* synthetic */ w3(x3 x3Var, v3 v3Var) {
        this.f14596a = x3Var;
    }

    public final String zze() throws RemoteException {
        return null;
    }

    public final String zzf() throws RemoteException {
        return null;
    }

    public final void zzg(u4 u4Var) throws RemoteException {
        zzh(u4Var, 1);
    }

    public final void zzh(u4 u4Var, int i10) throws RemoteException {
        zzbza.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbyt.zza.post(new u3(this));
    }

    public final boolean zzi() throws RemoteException {
        return false;
    }
}
