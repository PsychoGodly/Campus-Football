package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzevh {
    public static void zza(AtomicReference atomicReference, zzevg zzevg) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzevg.zza(obj);
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                zzbza.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
    }
}
