package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class s0 implements m {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f15482a;

    s0(IBinder iBinder) {
        this.f15482a = iBinder;
    }

    public final void P(l lVar, f fVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                i1.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f15482a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f15482a;
    }
}
