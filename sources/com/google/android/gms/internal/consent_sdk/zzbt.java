package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbt implements Runnable {
    public final /* synthetic */ zzbw zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbt(zzbw zzbw, String str) {
        this.zza = zzbw;
        this.zzb = str;
    }

    public final void run() {
        zzcu.zza(this.zza, this.zzb);
    }
}
