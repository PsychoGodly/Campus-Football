package com.google.android.gms.internal.p000authapiphone;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zza  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public class zza extends Binder implements IInterface {
    private static zzc zza;

    protected zza(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        boolean z10;
        if (i10 > 16777215) {
            z10 = super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return zza(i10, parcel, parcel2, i11);
    }

    /* access modifiers changed from: protected */
    public boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return false;
    }
}
