package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzffe implements Runnable {
    public final /* synthetic */ zzfff zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfen zzc;

    public /* synthetic */ zzffe(zzfff zzfff, String str, zzfen zzfen) {
        this.zza = zzfff;
        this.zzb = str;
        this.zzc = zzfen;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
