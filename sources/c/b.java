package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* compiled from: ICustomTabsService */
public interface b extends IInterface {

    /* renamed from: w1  reason: collision with root package name */
    public static final String f5561w1 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* compiled from: ICustomTabsService */
    public static abstract class a extends Binder implements b {

        /* renamed from: c.b$a$a  reason: collision with other inner class name */
        /* compiled from: ICustomTabsService */
        private static class C0102a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f5562a;

            C0102a(IBinder iBinder) {
                this.f5562a = iBinder;
            }

            public boolean I(a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeInt(i10);
                    boolean z10 = false;
                    C0103b.d(obtain, uri, 0);
                    C0103b.d(obtain, bundle, 0);
                    this.f5562a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Y(a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    this.f5562a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5562a;
            }

            public boolean b1(a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0103b.d(obtain, uri, 0);
                    C0103b.d(obtain, bundle, 0);
                    C0103b.c(obtain, list, 0);
                    this.f5562a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean c(a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0103b.d(obtain, bundle, 0);
                    this.f5562a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int d1(a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    C0103b.d(obtain, bundle, 0);
                    this.f5562a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean k1(a aVar, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeStrongBinder(iBinder);
                    boolean z10 = false;
                    C0103b.d(obtain, bundle, 0);
                    this.f5562a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean o0(long j10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    this.f5562a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean r0(a aVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0103b.d(obtain, uri, 0);
                    this.f5562a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean s1(a aVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0103b.d(obtain, uri, 0);
                    C0103b.d(obtain, bundle, 0);
                    this.f5562a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean t(a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0103b.d(obtain, bundle, 0);
                    this.f5562a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean u0(a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f5561w1);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0103b.d(obtain, bundle, 0);
                    this.f5562a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b M0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f5561w1);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0102a(iBinder);
            }
            return (b) queryLocalInterface;
        }
    }

    /* renamed from: c.b$b  reason: collision with other inner class name */
    /* compiled from: ICustomTabsService */
    public static class C0103b {
        /* access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    boolean I(a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    boolean Y(a aVar) throws RemoteException;

    boolean b1(a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean c(a aVar, Bundle bundle) throws RemoteException;

    int d1(a aVar, String str, Bundle bundle) throws RemoteException;

    boolean k1(a aVar, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean o0(long j10) throws RemoteException;

    boolean r0(a aVar, Uri uri) throws RemoteException;

    boolean s1(a aVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean t(a aVar, Bundle bundle) throws RemoteException;

    boolean u0(a aVar, Bundle bundle) throws RemoteException;
}
