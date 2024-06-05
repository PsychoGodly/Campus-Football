package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
abstract class zzjo {
    final Unsafe zza;

    zzjo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j10);

    public abstract float zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract void zzd(Object obj, long j10, byte b10);

    public abstract void zze(Object obj, long j10, double d10);

    public abstract void zzf(Object obj, long j10, float f10);

    public abstract boolean zzg(Object obj, long j10);
}
