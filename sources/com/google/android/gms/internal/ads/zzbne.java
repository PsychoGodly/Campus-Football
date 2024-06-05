package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbne extends zzasw implements zzbnf {
    public zzbne() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbnf zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbnf ? (zzbnf) queryLocalInterface : new zzbnd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zzbni zzb = zzb(readString);
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzb);
        } else if (i10 == 2) {
            String readString2 = parcel.readString();
            zzasx.zzc(parcel);
            boolean zze = zze(readString2);
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zze);
        } else if (i10 == 3) {
            String readString3 = parcel.readString();
            zzasx.zzc(parcel);
            zzbpc zzc = zzc(readString3);
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzc);
        } else if (i10 != 4) {
            return false;
        } else {
            String readString4 = parcel.readString();
            zzasx.zzc(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zzd);
        }
        return true;
    }
}
