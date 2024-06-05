package com.applovin.impl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.ab;

public abstract class k2 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private static final int f8864a = (yp.f13662a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);

    public static ab a(IBinder iBinder) {
        int readInt;
        ab.a f10 = ab.f();
        int i10 = 1;
        int i11 = 0;
        while (i10 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i11);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    f10.b((Bundle) a1.a((Object) obtain2.readBundle()));
                    i11++;
                }
                obtain2.recycle();
                obtain.recycle();
                i10 = readInt;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return f10.a();
    }
}
