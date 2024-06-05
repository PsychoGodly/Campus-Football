package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbun extends zzasw implements zzbuo {
    public zzbun() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbuo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzbuo ? (zzbuo) queryLocalInterface : new zzbum(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                a M0 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzl(M0);
                break;
            case 2:
                a M02 = a.C0158a.M0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzasx.zzc(parcel);
                zzk(M02, readInt);
                break;
            case 3:
                a M03 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzi(M03);
                break;
            case 4:
                a M04 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzj(M04);
                break;
            case 5:
                a M05 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzo(M05);
                break;
            case 6:
                a M06 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzf(M06);
                break;
            case 7:
                zzasx.zzc(parcel);
                zzm(a.C0158a.M0(parcel.readStrongBinder()), (zzbup) zzasx.zza(parcel, zzbup.CREATOR));
                break;
            case 8:
                a M07 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zze(M07);
                break;
            case 9:
                a M08 = a.C0158a.M0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzasx.zzc(parcel);
                zzg(M08, readInt2);
                break;
            case 10:
                a M09 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzh(M09);
                break;
            case 11:
                a M010 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzn(M010);
                break;
            case 12:
                Bundle bundle = (Bundle) zzasx.zza(parcel, Bundle.CREATOR);
                zzasx.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
