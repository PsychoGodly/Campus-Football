package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfmi extends zzasw implements zzfmj {
    public zzfmi() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzasx.zzc(parcel);
        zzb((Bundle) zzasx.zza(parcel, Bundle.CREATOR));
        return true;
    }
}
