package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class y3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z3 f14625a;

    y3(z3 z3Var) {
        this.f14625a = z3Var;
    }

    public final void run() {
        z3 z3Var = this.f14625a;
        if (z3Var.f14645a != null) {
            try {
                z3Var.f14645a.zze(1);
            } catch (RemoteException e10) {
                zzbza.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
