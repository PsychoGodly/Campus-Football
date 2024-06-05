package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzs implements Runnable {
    public final /* synthetic */ zzx zza;
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener zzb;
    public final /* synthetic */ zzac zzc;

    public /* synthetic */ zzs(zzx zzx, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzac zzac) {
        this.zza = zzx;
        this.zzb = onConsentInfoUpdateSuccessListener;
        this.zzc = zzac;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}
