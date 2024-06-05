package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class u0 extends zzb implements v0 {
    public static v0 M0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(iBinder);
    }
}
