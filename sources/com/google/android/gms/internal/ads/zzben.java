package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzben extends zzasw implements zzbeo {
    public zzben() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                a zzg = zzg();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbdx zze = zze();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                s2 zzc = zzc();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzc);
                return true;
            case 12:
                zzasx.zzc(parcel);
                zzo((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzasx.zzc(parcel);
                boolean zzq = zzq((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzq);
                return true;
            case 14:
                zzasx.zzc(parcel);
                zzp((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzbdp zzd = zzd();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzd);
                return true;
            case 16:
                a zzf = zzf();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
