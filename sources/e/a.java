package e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: IResultReceiver */
public interface a extends IInterface {

    /* renamed from: z1  reason: collision with root package name */
    public static final String f17743z1 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* compiled from: IResultReceiver */
    public static abstract class C0179a extends Binder implements a {

        /* renamed from: e.a$a$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        private static class C0180a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17744a;

            C0180a(IBinder iBinder) {
                this.f17744a = iBinder;
            }

            public IBinder asBinder() {
                return this.f17744a;
            }

            public void y1(int i10, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f17743z1);
                    obtain.writeInt(i10);
                    b.d(obtain, bundle, 0);
                    this.f17744a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0179a() {
            attachInterface(this, a.f17743z1);
        }

        public static a M0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f17743z1);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0180a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.f17743z1;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                y1(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* compiled from: IResultReceiver */
    public static class b {
        /* access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
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

    void y1(int i10, Bundle bundle) throws RemoteException;
}
