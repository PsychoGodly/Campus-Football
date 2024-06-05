package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: IEngagementSignalsCallback */
public interface c extends IInterface {

    /* renamed from: x1  reason: collision with root package name */
    public static final String f5563x1 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* compiled from: IEngagementSignalsCallback */
    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, c.f5563x1);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = c.f5563x1;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            boolean z10 = false;
            if (i10 == 2) {
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                onVerticalScrollEvent(z10, (Bundle) b.b(parcel, Bundle.CREATOR));
            } else if (i10 == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            } else if (i10 != 4) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                onSessionEnded(z10, (Bundle) b.b(parcel, Bundle.CREATOR));
            }
            return true;
        }
    }

    /* compiled from: IEngagementSignalsCallback */
    public static class b {
        /* access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) throws RemoteException;

    void onSessionEnded(boolean z10, Bundle bundle) throws RemoteException;

    void onVerticalScrollEvent(boolean z10, Bundle bundle) throws RemoteException;
}
