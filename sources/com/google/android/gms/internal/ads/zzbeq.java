package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbeq extends zzasw implements zzber {
    public zzbeq() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzber zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzber ? (zzber) queryLocalInterface : new zzbep(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                zzasx.zzc(parcel);
                String zzj = zzj(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzasx.zzc(parcel);
                zzbdx zzg = zzg(readString2);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzg);
                return true;
            case 3:
                List zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzasx.zzc(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                s2 zze = zze();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                a zzh = zzh();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzh);
                return true;
            case 10:
                a M0 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                boolean zzr = zzr(M0);
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzr);
                return true;
            case 11:
                parcel2.writeNoException();
                zzasx.zzg(parcel2, (IInterface) null);
                return true;
            case 12:
                boolean zzq = zzq();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzq);
                return true;
            case 13:
                boolean zzs = zzs();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzs);
                return true;
            case 14:
                a M02 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzp(M02);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbdu zzf = zzf();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzf);
                return true;
            default:
                return false;
        }
    }
}
