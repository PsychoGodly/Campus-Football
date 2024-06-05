package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarp extends zzasm {
    private final long zzi;

    public zzarp(zzaqx zzaqx, String str, String str2, zzamv zzamv, long j10, int i10, int i11) {
        super(zzaqx, "xTgGP9w4lMQ/WjLtAFn2v1JjPdma/PcJXQX8pyq+xajYX2HDrjKBZ5k/anX+M/Bo", "vRn7geI+WCeFJoZ7qQQ1ZFwlsU3+f9F9Kf66GT9NZts=", zzamv, i10, 25);
        this.zzi = j10;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(longValue);
            long j10 = this.zzi;
            if (j10 != 0) {
                this.zze.zzT(longValue - j10);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
