package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzakm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzako zzc;

    zzakm(zzako zzako, String str, long j10) {
        this.zzc = zzako;
        this.zza = str;
        this.zzb = j10;
    }

    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzako zzako = this.zzc;
        zzako.zza.zzb(zzako.toString());
    }
}
