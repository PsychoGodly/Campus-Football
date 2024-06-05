package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasd extends zzasm {
    private final boolean zzi;

    public zzasd(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "H7DVVU5G/CyEmqoRDTRZzFOOZo/1i5OeCGYpAtE5NN4V5QTkqzRkQ5oAGN3vcrtV", "z+xFAlC1JJ/Cxy2NWKsDbM4NUy8C7neyeQZVK5Q+YiU=", zzamv, i10, 61);
        this.zzi = zzaqx.zzs();
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb(), Boolean.valueOf(this.zzi)})).longValue();
        synchronized (this.zze) {
            this.zze.zzE(longValue);
        }
    }
}
