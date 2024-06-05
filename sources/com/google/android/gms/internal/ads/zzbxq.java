package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbxq extends zzasw implements zzbxr {
    public zzbxq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbxr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzbxr ? (zzbxr) queryLocalInterface : new zzbxp(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbxo zzbxo = null;
        switch (i10) {
            case 1:
                a M0 = a.C0158a.M0(parcel.readStrongBinder());
                zzbxv zzbxv = (zzbxv) zzasx.zza(parcel, zzbxv.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbxo = queryLocalInterface instanceof zzbxo ? (zzbxo) queryLocalInterface : new zzbxm(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zze(M0, zzbxv, zzbxo);
                parcel2.writeNoException();
                return true;
            case 2:
                a M02 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzj(M02);
                parcel2.writeNoException();
                return true;
            case 3:
                a.C0158a.M0(parcel.readStrongBinder());
                a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, (IInterface) null);
                return true;
            case 4:
                a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, (IInterface) null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                a M03 = a.C0158a.M0(parcel.readStrongBinder());
                zzbrr zzb = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzl(createTypedArrayList, M03, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                a M04 = a.C0158a.M0(parcel.readStrongBinder());
                zzbrr zzb2 = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzk(createTypedArrayList2, M04, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzasx.zzc(parcel);
                zzf((zzbsa) zzasx.zza(parcel, zzbsa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                a M05 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzi(M05);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                a M06 = a.C0158a.M0(parcel.readStrongBinder());
                zzbrr zzb3 = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzh(createTypedArrayList3, M06, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                a M07 = a.C0158a.M0(parcel.readStrongBinder());
                zzbrr zzb4 = zzbrq.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzg(createTypedArrayList4, M07, zzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
