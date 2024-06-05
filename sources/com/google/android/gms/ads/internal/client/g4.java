package com.google.android.gms.ads.internal.client;

import a5.a;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class g4 extends e2 {

    /* renamed from: a  reason: collision with root package name */
    private final a f14469a;

    public g4(a aVar) {
        this.f14469a = aVar;
    }

    public final void zze() throws RemoteException {
        a aVar = this.f14469a;
        if (aVar != null) {
            aVar.onAdMetadataChanged();
        }
    }
}
