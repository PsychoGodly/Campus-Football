package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzcfy extends zzasw implements zzcfz {
    public zzcfy() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzasx.zzc(parcel);
                zzp((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzasx.zzc(parcel);
                Bundle zzd = zzd((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzd);
                return true;
            case 3:
                zzasx.zzc(parcel);
                zzo(parcel.readString(), parcel.readString(), (Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                a M0 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzt(readString, readString2, M0);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean zzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                Map zzk = zzk(readString3, readString4, zzh);
                parcel2.writeNoException();
                parcel2.writeMap(zzk);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzasx.zzc(parcel);
                int zzb = zzb(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                zzasx.zzc(parcel);
                zzq((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzasx.zzc(parcel);
                zzm(parcel.readString(), parcel.readString(), (Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                zzasx.zzc(parcel);
                List zzj = zzj(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(zzj);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString8 = parcel.readString();
                zzasx.zzc(parcel);
                zzl(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                zzasx.zzc(parcel);
                zzn(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                a M02 = a.C0158a.M0(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzasx.zzc(parcel);
                zzs(M02, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzh2 = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh2);
                return true;
            case 17:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                zzasx.zzc(parcel);
                zzr((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
