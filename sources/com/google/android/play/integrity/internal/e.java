package com.google.android.play.integrity.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public class e extends Binder implements IInterface {
    protected e(String str) {
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    /* access modifiers changed from: protected */
    public boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return a(i10, parcel, parcel2, i11);
    }
}
