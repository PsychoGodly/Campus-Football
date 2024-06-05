package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class e4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzbvd f14460a;

    public /* synthetic */ e4(zzbvd zzbvd) {
        this.f14460a = zzbvd;
    }

    public final void run() {
        zzbvd zzbvd = this.f14460a;
        if (zzbvd != null) {
            try {
                zzbvd.zze(1);
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
