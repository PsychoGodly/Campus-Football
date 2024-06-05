package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbfn extends zzasw implements zzbfo {
    public zzbfn() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static zzbfo zzc(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof zzbfo ? (zzbfo) queryLocalInterface : new zzbfm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        a M0 = a.C0158a.M0(parcel.readStrongBinder());
        zzasx.zzc(parcel);
        boolean zzb = zzb(M0);
        parcel2.writeNoException();
        zzasx.zzd(parcel2, zzb);
        return true;
    }
}
