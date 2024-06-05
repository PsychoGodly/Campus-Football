package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.ads.zzbza;
import n4.q;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class y1 implements q {

    /* renamed from: a  reason: collision with root package name */
    private final String f14607a;

    /* renamed from: b  reason: collision with root package name */
    private final x1 f14608b;

    public y1(x1 x1Var) {
        String str;
        this.f14608b = x1Var;
        try {
            str = x1Var.zze();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            str = null;
        }
        this.f14607a = str;
    }

    public final x1 a() {
        return this.f14608b;
    }

    public final String toString() {
        return this.f14607a;
    }
}
