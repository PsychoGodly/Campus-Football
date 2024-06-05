package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbdw extends zzasw implements zzbdx {
    public zzbdw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbdx zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbdx ? (zzbdx) queryLocalInterface : new zzbdv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a zzf = zzf();
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzf);
        } else if (i10 == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzasx.zzf(parcel2, zze);
        } else if (i10 == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        } else if (i10 == 4) {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else if (i10 != 5) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
