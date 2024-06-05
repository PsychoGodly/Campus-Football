package d;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel */
public interface a extends IInterface {

    /* renamed from: y1  reason: collision with root package name */
    public static final String f17617y1 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: d.a$a  reason: collision with other inner class name */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0173a extends Binder implements a {

        /* renamed from: d.a$a$a  reason: collision with other inner class name */
        /* compiled from: INotificationSideChannel */
        private static class C0174a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17618a;

            C0174a(IBinder iBinder) {
                this.f17618a = iBinder;
            }

            public void L0(String str, int i10, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f17617y1);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    this.f17618a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void U(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f17617y1);
                    obtain.writeString(str);
                    this.f17618a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f17618a;
            }

            public void o1(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f17617y1);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f17618a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a M0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f17617y1);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0174a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    /* compiled from: INotificationSideChannel */
    public static class b {
        /* access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void L0(String str, int i10, String str2) throws RemoteException;

    void U(String str) throws RemoteException;

    void o1(String str, int i10, String str2, Notification notification) throws RemoteException;
}
