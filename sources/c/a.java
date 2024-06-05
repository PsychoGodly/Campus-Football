package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: ICustomTabsCallback */
public interface a extends IInterface {

    /* renamed from: v1  reason: collision with root package name */
    public static final String f5560v1 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* compiled from: ICustomTabsCallback */
    public static abstract class C0101a extends Binder implements a {
        public C0101a() {
            attachInterface(this, a.f5560v1);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.f5560v1;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    X0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    P0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    m1((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    i1(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    q1(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle b02 = b0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, b02, 1);
                    break;
                case 8:
                    C0(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            return true;
        }
    }

    /* compiled from: ICustomTabsCallback */
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

    void C0(int i10, int i11, Bundle bundle) throws RemoteException;

    void P0(String str, Bundle bundle) throws RemoteException;

    void X0(int i10, Bundle bundle) throws RemoteException;

    Bundle b0(String str, Bundle bundle) throws RemoteException;

    void i1(String str, Bundle bundle) throws RemoteException;

    void m1(Bundle bundle) throws RemoteException;

    void q1(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;
}
