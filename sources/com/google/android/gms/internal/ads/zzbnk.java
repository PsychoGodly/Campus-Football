package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbnk extends zzasw implements zzbnl {
    public zzbnk() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbnl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbnl ? (zzbnl) queryLocalInterface : new zzbnj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzasx.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbnp) {
                        zzbnp zzbnp = (zzbnp) queryLocalInterface;
                    }
                }
                zzasx.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzasx.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzbeq.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzasx.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzasx.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzasx.zzc(parcel);
                zzs((zzbup) zzasx.zza(parcel, zzbup.CREATOR));
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbut zzb = zzbus.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzasx.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                Bundle bundle = (Bundle) zzasx.zza(parcel, Bundle.CREATOR);
                zzasx.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzasx.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzasx.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                zzasx.zzc(parcel);
                zzh((c3) zzasx.zza(parcel, c3.CREATOR));
                break;
            case 24:
                zzasx.zzc(parcel);
                zzk((c3) zzasx.zza(parcel, c3.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
