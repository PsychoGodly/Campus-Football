package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class r0 extends zzb implements l {
    public r0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc.zzb(parcel);
            w0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            zzc.zzb(parcel);
            a0(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            zzc.zzb(parcel);
            E0(parcel.readInt(), parcel.readStrongBinder(), (f1) zzc.zza(parcel, f1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
