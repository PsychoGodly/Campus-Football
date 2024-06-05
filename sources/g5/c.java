package g5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
interface c extends IInterface {

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f18112a;

        a(IBinder iBinder) {
            this.f18112a = iBinder;
        }

        public void E(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f18112a.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f18112a;
        }
    }

    void E(Message message) throws RemoteException;
}
