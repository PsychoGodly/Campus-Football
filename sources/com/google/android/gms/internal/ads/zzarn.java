package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarn extends zzasm {
    public zzarn(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "pzDMLx6PDOtUoiq4sHYJQM6a/7OSGXuSt3rWDXG0BK02rgL9BLEjiNa6eKy3zt3D", "O5il9ZZjBEgIiHjallNs+C68w5c7XQAr0WIqU8TcTvI=", zzamv, i10, 5);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm(-1);
        this.zze.zzl(-1);
        int[] iArr = (int[]) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()});
        synchronized (this.zze) {
            this.zze.zzm((long) iArr[0]);
            this.zze.zzl((long) iArr[1]);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                this.zze.zzk((long) i10);
            }
        }
    }
}
