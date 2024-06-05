package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbel extends zzasw implements zzbem {
    public zzbel() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                a zzh = zzh();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzh);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbdx zzf = zzf();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzf);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                s2 zzd = zzd();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzd);
                return true;
            case 14:
                zzasx.zzc(parcel);
                zzq((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzasx.zzc(parcel);
                boolean zzs = zzs((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzs);
                return true;
            case 16:
                zzasx.zzc(parcel);
                zzr((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzbdp zze = zze();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zze);
                return true;
            case 18:
                a zzg = zzg();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzg);
                return true;
            case 19:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
