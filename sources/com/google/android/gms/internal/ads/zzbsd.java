package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbsd implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbsf zzb;

    zzbsd(zzbsf zzbsf, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzb = zzbsf;
        this.zza = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.zzb.zze(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zza;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
