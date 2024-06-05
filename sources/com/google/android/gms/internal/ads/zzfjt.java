package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfjt extends zzasw implements zzfju {
    public zzfjt() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                a.C0158a.M0(parcel.readStrongBinder());
                parcel.readString();
                zzasx.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzasx.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzasx.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzasx.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzasx.zzc(parcel);
                break;
            case 8:
                a.C0158a.M0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzasx.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
