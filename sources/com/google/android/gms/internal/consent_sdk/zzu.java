package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzu implements Runnable {
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateFailureListener zza;
    public final /* synthetic */ zzi zzb;

    public /* synthetic */ zzu(ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener, zzi zzi) {
        this.zza = onConsentInfoUpdateFailureListener;
        this.zzb = zzi;
    }

    public final void run() {
        this.zza.onConsentInfoUpdateFailure(this.zzb.zza());
    }
}
