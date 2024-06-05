package j5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class a extends zaa {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void M0(u uVar) throws RemoteException {
        Parcel zaa = zaa();
        zac.zac(zaa, uVar);
        zad(1, zaa);
    }
}
