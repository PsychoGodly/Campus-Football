package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class m0 extends zzasw implements n0 {
    public m0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzasx.zzc(parcel);
            zzg((u4) zzasx.zza(parcel, u4.CREATOR));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i10 == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zzi);
        } else if (i10 == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i10 != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            zzasx.zzc(parcel);
            zzh((u4) zzasx.zza(parcel, u4.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
