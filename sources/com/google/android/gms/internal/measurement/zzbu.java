package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public class zzbu implements IInterface {
    private final IBinder zza;
    private final String zzb;

    protected zzbu(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public IBinder asBinder() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final Parcel zza(int i10, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.zza.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
