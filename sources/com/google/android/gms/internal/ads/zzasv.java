package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-base@@22.0.0 */
public class zzasv implements IInterface {
    private final IBinder zza;
    private final String zzb;

    protected zzasv(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel zzbg(int i10, Parcel parcel) throws RemoteException {
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
    public final void zzbh(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzbi(int i10, Parcel parcel) throws RemoteException {
        try {
            this.zza.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
