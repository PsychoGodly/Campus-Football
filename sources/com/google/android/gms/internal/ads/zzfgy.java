package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfgy implements Runnable {
    zzfgy() {
    }

    public final void run() {
        if (zzfhb.zzc != null) {
            zzfhb.zzc.post(zzfhb.zzd);
            zzfhb.zzc.postDelayed(zzfhb.zze, 200);
        }
    }
}
