package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzbtc extends zzasw implements zzbtd {
    public zzbtc() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbtg zzbtg = null;
        if (i10 == 1) {
            zzbsr zzbsr = (zzbsr) zzasx.zza(parcel, zzbsr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtg = queryLocalInterface instanceof zzbtg ? (zzbtg) queryLocalInterface : new zzbte(readStrongBinder);
            }
            zzasx.zzc(parcel);
            zzf(zzbsr, zzbtg);
        } else if (i10 == 2) {
            zzbsr zzbsr2 = (zzbsr) zzasx.zza(parcel, zzbsr.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzbtg) {
                    zzbtg zzbtg2 = (zzbtg) queryLocalInterface2;
                }
            }
            zzasx.zzc(parcel);
        } else if (i10 != 3) {
            return false;
        } else {
            zzbsv zzbsv = (zzbsv) zzasx.zza(parcel, zzbsv.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtg = queryLocalInterface3 instanceof zzbtg ? (zzbtg) queryLocalInterface3 : new zzbte(readStrongBinder3);
            }
            zzasx.zzc(parcel);
            zze(zzbsv, zzbtg);
        }
        parcel2.writeNoException();
        return true;
    }
}
