package n2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import k4.a;
import k4.n0;
import s6.u;

/* compiled from: BundleListRetriever */
public final class g extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private static final int f20387a = (n0.f19738a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);

    public static u<Bundle> a(IBinder iBinder) {
        int readInt;
        u.a p10 = u.p();
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
                    p10.a((Bundle) a.e(obtain2.readBundle()));
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
        return p10.k();
    }
}
