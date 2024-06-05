package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfmg extends zzasw implements zzfmh {
    public static zzfmh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof zzfmh ? (zzfmh) queryLocalInterface : new zzfmf(iBinder);
    }
}
