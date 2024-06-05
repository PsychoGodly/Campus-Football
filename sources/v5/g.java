package v5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class g extends zaa {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void A1(j jVar, int i10, boolean z10) throws RemoteException {
        Parcel zaa = zaa();
        zac.zad(zaa, jVar);
        zaa.writeInt(i10);
        zac.zab(zaa, z10);
        zac(9, zaa);
    }

    public final void B1(j jVar, f fVar) throws RemoteException {
        Parcel zaa = zaa();
        zac.zac(zaa, jVar);
        zac.zad(zaa, fVar);
        zac(12, zaa);
    }

    public final void M0(int i10) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i10);
        zac(7, zaa);
    }
}
