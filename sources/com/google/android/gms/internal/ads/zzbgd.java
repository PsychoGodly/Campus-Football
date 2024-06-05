package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.u0;
import o4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbgd implements Runnable {
    final /* synthetic */ b zza;
    final /* synthetic */ u0 zzb;
    final /* synthetic */ zzbge zzc;

    zzbgd(zzbge zzbge, b bVar, u0 u0Var) {
        this.zzc = zzbge;
        this.zza = bVar;
        this.zzb = u0Var;
    }

    public final void run() {
        if (this.zza.g(this.zzb)) {
            this.zzc.zza.a(this.zza);
        } else {
            zzbza.zzj("Could not bind.");
        }
    }
}
