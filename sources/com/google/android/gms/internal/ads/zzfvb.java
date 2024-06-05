package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfvb {
    static void zza(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
