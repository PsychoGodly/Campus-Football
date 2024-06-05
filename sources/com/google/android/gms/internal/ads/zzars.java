package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzars extends zzasm {
    private final zzaqy zzi;

    public zzars(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, zzaqy zzaqy) {
        super(zzaqx, "WiBvNElQIWLcD1MAWzkQBcjrDQoEuYCN1R/XT/Sg3LhVQ2iulZRZfofRQLig8S+e", "bmivrcLZaHzijOhh62Orf3BoYYHHdZV06MDdRRTWkIM=", zzamv, i10, 85);
        this.zzi = zzaqy;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke((Object) null, new Object[]{Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf())});
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
