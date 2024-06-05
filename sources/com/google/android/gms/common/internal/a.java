package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a extends j.a {
    public static Account A1(j jVar) {
        Account account = null;
        if (jVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = jVar.zzb();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
