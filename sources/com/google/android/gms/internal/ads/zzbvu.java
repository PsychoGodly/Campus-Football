package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbvu implements Runnable {
    public final /* synthetic */ zzbvw zza;
    public final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzbvu(zzbvw zzbvw, Bitmap bitmap) {
        this.zza = zzbvw;
        this.zzb = bitmap;
    }

    public final void run() {
        this.zza.zzf(this.zzb);
    }
}
