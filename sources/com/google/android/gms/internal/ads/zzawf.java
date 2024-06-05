package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class zzawf implements Runnable {
    public final /* synthetic */ zzawk zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzawf(zzawk zzawk, Context context) {
        this.zza = zzawk;
        this.zzb = context;
    }

    public final void run() {
        zzawk zzawk = this.zza;
        Context context = this.zzb;
        if (((Boolean) a0.c().zzb(zzbar.zzew)).booleanValue()) {
            try {
                zzawk.zza = (zzata) zzbze.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzawg.zza);
                zzawk.zza.zze(b.B1(context), "GMA_SDK");
                zzawk.zzb = true;
            } catch (RemoteException | zzbzd | NullPointerException unused) {
                zzbza.zze("Cannot dynamite load clearcut");
            }
        }
    }
}
