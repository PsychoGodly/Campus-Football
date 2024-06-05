package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbjr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class l3 extends zzbjr {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m3 f14493a;

    /* synthetic */ l3(m3 m3Var, k3 k3Var) {
        this.f14493a = m3Var;
    }

    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        synchronized (this.f14493a.f14499a) {
            this.f14493a.f14501c = false;
            this.f14493a.f14502d = true;
            arrayList = new ArrayList(this.f14493a.f14500b);
            this.f14493a.f14500b.clear();
        }
        InitializationStatus e10 = m3.y(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(e10);
        }
    }
}
