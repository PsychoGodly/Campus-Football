package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface j extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class a extends zzb implements j {
        public static j M0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof j ? (j) queryLocalInterface : new r1(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
