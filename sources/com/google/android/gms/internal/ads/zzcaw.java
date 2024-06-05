package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcaw implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcax zzb;

    zzcaw(zzcax zzcax, boolean z10) {
        this.zzb = zzcax;
        this.zza = z10;
    }

    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
