package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaru extends zzasm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaru(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "YqTS1o+C7XbcWZ1ePdCg6lS0vIYMM7HzMu7AOHCWvWhuNgyk3szL95200diFQtk9", "HoawD5bopn0ma7odT68Aadbw04A5xMOxr41zcgTyqd8=", zzamv, i10, 22);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzy(zzi.longValue());
        }
    }
}
