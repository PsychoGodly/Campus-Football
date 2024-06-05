package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class u3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w3 f14550a;

    u3(w3 w3Var) {
        this.f14550a = w3Var;
    }

    public final void run() {
        x3 x3Var = this.f14550a.f14596a;
        if (x3Var.f14603a != null) {
            try {
                x3Var.f14603a.zze(1);
            } catch (RemoteException e10) {
                zzbza.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
