package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f26070a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26071b = "com.google.android.play.core.integrity.protocol.IIntegrityService";

    protected a(IBinder iBinder, String str) {
        this.f26070a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void A1(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f26070a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel M0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26071b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f26070a;
    }
}
