package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public abstract class l extends e implements m {
    public l() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        f.b(parcel);
        b((Bundle) f.a(parcel, Bundle.CREATOR));
        return true;
    }
}
