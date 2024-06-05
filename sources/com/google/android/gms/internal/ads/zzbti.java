package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzbti extends zzasw implements zzbtj {
    public zzbti() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzasx.zzc(parcel);
            zzf((ParcelFileDescriptor) zzasx.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zze((a0) zzasx.zza(parcel, a0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
