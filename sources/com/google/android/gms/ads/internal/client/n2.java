package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class n2 extends zzasv implements p2 {
    n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final d5 zzf() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        d5 d5Var = (d5) zzasx.zza(zzbg, d5.CREATOR);
        zzbg.recycle();
        return d5Var;
    }

    public final String zzg() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzh() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzi() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzj() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList<d5> createTypedArrayList = zzbg.createTypedArrayList(d5.CREATOR);
        zzbg.recycle();
        return createTypedArrayList;
    }
}
