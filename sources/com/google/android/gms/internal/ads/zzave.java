package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzave extends zzasw implements zzavf {
    public zzave() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzf();
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            zzasx.zzc(parcel);
            zzd((c3) zzasx.zza(parcel, c3.CREATOR));
        } else if (i10 == 4) {
            zze();
        } else if (i10 != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
