package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.t0;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbfh extends zzasw implements zzbfi {
    public zzbfh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbfi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzbfi ? (zzbfi) queryLocalInterface : new zzbfg(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        u0 zzac = t0.zzac(parcel.readStrongBinder());
        a M0 = a.C0158a.M0(parcel.readStrongBinder());
        zzasx.zzc(parcel);
        zze(zzac, M0);
        parcel2.writeNoException();
        return true;
    }
}
