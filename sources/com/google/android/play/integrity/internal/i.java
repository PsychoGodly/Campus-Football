package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final class i extends a implements k {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    public final void p1(Bundle bundle, m mVar) throws RemoteException {
        Parcel M0 = M0();
        f.c(M0, bundle);
        f.d(M0, mVar);
        A1(2, M0);
    }
}
