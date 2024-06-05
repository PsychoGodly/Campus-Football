package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzbjc extends zzasw implements zzbjd {
    public zzbjc() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzasx.zzc(parcel);
        zzb((ParcelFileDescriptor) zzasx.zza(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
