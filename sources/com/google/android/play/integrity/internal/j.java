package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public abstract class j extends e implements k {
    public static k M0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new i(iBinder);
    }
}
