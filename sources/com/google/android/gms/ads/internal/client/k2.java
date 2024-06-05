package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class k2 extends zzasw implements l2 {
    public k2() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        String readString = parcel.readString();
        a M0 = a.C0158a.M0(parcel.readStrongBinder());
        a M02 = a.C0158a.M0(parcel.readStrongBinder());
        zzasx.zzc(parcel);
        zze(readString, M0, M02);
        parcel2.writeNoException();
        return true;
    }
}
