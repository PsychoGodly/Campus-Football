package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzbsy extends zzasw implements zzbsz {
    public zzbsy() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbtj zzbtj = null;
        if (i10 == 1) {
            zzbso zzbso = (zzbso) zzasx.zza(parcel, zzbso.CREATOR);
            zzasx.zzc(parcel);
            parcel2.writeNoException();
            zzasx.zzf(parcel2, (Parcelable) null);
        } else if (i10 == 2) {
            zzbso zzbso2 = (zzbso) zzasx.zza(parcel, zzbso.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbta) {
                    zzbta zzbta = (zzbta) queryLocalInterface;
                }
            }
            zzasx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i10 == 4) {
            zzbtn zzbtn = (zzbtn) zzasx.zza(parcel, zzbtn.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtj = queryLocalInterface2 instanceof zzbtj ? (zzbtj) queryLocalInterface2 : new zzbth(readStrongBinder2);
            }
            zzasx.zzc(parcel);
            zzg(zzbtn, zzbtj);
            parcel2.writeNoException();
        } else if (i10 == 5) {
            zzbtn zzbtn2 = (zzbtn) zzasx.zza(parcel, zzbtn.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtj = queryLocalInterface3 instanceof zzbtj ? (zzbtj) queryLocalInterface3 : new zzbth(readStrongBinder3);
            }
            zzasx.zzc(parcel);
            zzf(zzbtn2, zzbtj);
            parcel2.writeNoException();
        } else if (i10 == 6) {
            zzbtn zzbtn3 = (zzbtn) zzasx.zza(parcel, zzbtn.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtj = queryLocalInterface4 instanceof zzbtj ? (zzbtj) queryLocalInterface4 : new zzbth(readStrongBinder4);
            }
            zzasx.zzc(parcel);
            zze(zzbtn3, zzbtj);
            parcel2.writeNoException();
        } else if (i10 != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtj = queryLocalInterface5 instanceof zzbtj ? (zzbtj) queryLocalInterface5 : new zzbth(readStrongBinder5);
            }
            zzasx.zzc(parcel);
            zzh(readString, zzbtj);
            parcel2.writeNoException();
        }
        return true;
    }
}
