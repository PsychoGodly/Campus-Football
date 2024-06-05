package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class a2 extends zzasw implements c2 {
    public a2() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzasx.zzc(parcel);
        zze((c3) zzasx.zza(parcel, c3.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
